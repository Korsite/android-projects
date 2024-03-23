package com.example.quizme.viewModels.forQuestions

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.composable.navigation.rules.QuestionDestination
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.Question
import com.example.quizme.data.QuizRepository
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class QuestionViewModel(
    savedStateHandle: SavedStateHandle,
    val repository: QuizRepository,
) : ViewModel() {

    private val questionId: Int =
        checkNotNull(savedStateHandle[QuestionDestination.levelIdArg])

    val questionUiState: StateFlow<ChargingState> =
        repository.getAQuestion(questionId).map {
            try {
                ChargingState.Correct(
                    personToQuestions = getAllQuestionFromSomeone(it.personId), // need a reference to all questions
                    question = it
                )
            } catch (e: NullPointerException) {
                Log.e("$e", "$e")
                ChargingState.Error
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            ChargingState.Loading
        )

    /**
     * util function to have all the questions from someone
     */
    private suspend fun getAllQuestionFromSomeone(name: String): PersonQuestions =
         repository.getAllQuestionsFromSomeone(name).first()


    var count = mutableIntStateOf(2)
        private set

    /**
     * If correct, next question, return -1 attempt and same question otherwise
     * TODO exception when rotating while counting to 0
     */
    fun checkAnswer(
        answerCorrect: Boolean,
        question: Question,
        nextQuestion: Question,
        onChangeLevel: (Int, String) -> Unit,
    ) {
        viewModelScope.launch {

            modifyLevelState(
                if (answerCorrect) question.copy(resolved = true)
                else question.copy(attemptsLeft = question.attemptsLeft.dec())
            )
            countTo0()
            onChangeLevel(nextQuestion.questionId, nextQuestion.personId)
        }
    }

    private fun modifyLevelState(question: Question) {
        viewModelScope.launch {
            repository.updateQuestion(question) // modifies the state
        }
    }


    private suspend fun countTo0() {
        coroutineScope {
            while (count.intValue > 0) {
                delay(1000)
                count.intValue -= 1
            }
        }
    }
}