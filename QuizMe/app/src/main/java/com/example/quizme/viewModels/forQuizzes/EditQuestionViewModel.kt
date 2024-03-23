package com.example.quizme.viewModels.forQuizzes

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.composable.navigation.rules.EditQuestionDestination
import com.example.quizme.data.Answer
import com.example.quizme.data.Question
import com.example.quizme.data.QuizRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EditQuestionViewModel(
    savedStateHandle: SavedStateHandle,
    val repository: QuizRepository,
) : ViewModel() {

    val questionId: Int = checkNotNull(savedStateHandle[EditQuestionDestination.levelIdArg])

    private var _questionUiState = MutableLiveData(QuestionUiState())
    val questionUiState: LiveData<QuestionUiState>
        get() = _questionUiState

    private var initialDataState by mutableStateOf(QuestionDetails())

    private var _showSnackBar = MutableLiveData(false)
    val showSnackBar: LiveData<Boolean>
        get() = _showSnackBar

    fun dismissSnackBar() {
        _showSnackBar.value = false
    }

    init {
        updateUiState()
    }

    fun updateOrInsertQuestion(personId: String) {
        viewModelScope.launch {
            this.coroutineContext
            withContext(context = Dispatchers.IO) {
                if (questionId >= 0) // if question exists, it is an update
                    repository.updateQuestion(
                        checkNotNull(_questionUiState.value).toQuestion(
                            question = getQuestion(), nextQuestionId = null, personId = null
                        )
                    )
                else { // if not, it is an insert
                    val nextQuestionIdAvailable = try{
                        repository.getAllQuestionsFromEveryone().first()
                            .map { it.questions.last() } // last question of each person
                            .maxBy { it.questionId }.questionId
                            .inc() // next
                    }catch (e: NoSuchElementException){ // if there are 0 questions in the database
                        1
                    }

                    repository.insertANewQuestion(
                        checkNotNull(_questionUiState.value).toQuestion(
                            question = null,
                            nextQuestionId = nextQuestionIdAvailable,
                            personId = personId
                        )
                    )
                }
                updateUiState()
            }
            _showSnackBar.value = true
        }
    }

    fun updateInput(questionDetails: QuestionDetails) {
        _questionUiState.value =
            QuestionUiState(
                questionDetails = questionDetails,
                isInputValid = validInput(questionDetails)
            )
    }

    private fun validInput(
        uiState: QuestionDetails = checkNotNull(_questionUiState.value).questionDetails,
    ): Boolean {
        return with(uiState) {
            question.isNotBlank() &&
                    answer1.isNotBlank() &&
                    answer2.isNotBlank() &&
                    answer3.isNotBlank() &&
                    correctAnswer != 0 &&
                    uiState != initialDataState
        }
    }

    private suspend fun getQuestion(): Question =
        repository.getAQuestion(questionId).first()

    private fun updateUiState() {
        viewModelScope.launch {
            _questionUiState.value = try {
                repository.getAQuestion(questionId)
                    .first()
                    .toUiState(false)
            } catch (e: NullPointerException) {
                QuestionUiState()
            }
            initialDataState = checkNotNull(_questionUiState.value).questionDetails
        }
    }
}

data class QuestionUiState(
    val questionDetails: QuestionDetails = QuestionDetails(),
    val isInputValid: Boolean = false,
)

data class QuestionDetails(
    val question: String = "",
    val answer1: String = "",
    val answer2: String = "",
    val answer3: String = "",
    val correctAnswer: Int = 0,
)

fun Question.toUiState(validInput: Boolean) = QuestionUiState(
    questionDetails = this.toQuestionDetails(),
    isInputValid = validInput
)

fun Question.toQuestionDetails(): QuestionDetails = QuestionDetails(
    question = this.question,
    answer1 = this.answer.answer1,
    answer2 = this.answer.answer2,
    answer3 = this.answer.answer3,
    correctAnswer = this.answer.correctAnswer
)

/**
 * Util function to convert UiState to question data class, needs only 1 param if edit is required,
 * needs only the other 2 to add a new one otherwise
 * @param question question to be edited
 * @param nextQuestionId primary key to save a new question
 * @param personId person name whose belongs this question
 */

fun QuestionUiState.toQuestion(
    question: Question?,
    nextQuestionId: Int?,
    personId: String?,
): Question = question?.copy(
    question = this.questionDetails.question,
    answer = Answer(
        answer1 = this.questionDetails.answer1,
        answer2 = this.questionDetails.answer2,
        answer3 = this.questionDetails.answer3,
        correctAnswer = this.questionDetails.correctAnswer
    )
) ?: Question(
    questionId = nextQuestionId!!,
    personId = personId!!,
    question = this.questionDetails.question,
    answer = Answer(
        answer1 = this.questionDetails.answer1,
        answer2 = this.questionDetails.answer2,
        answer3 = this.questionDetails.answer3,
        correctAnswer = this.questionDetails.correctAnswer
    )
)
