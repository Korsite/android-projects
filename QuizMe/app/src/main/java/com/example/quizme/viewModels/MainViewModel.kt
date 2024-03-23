package com.example.quizme.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.data.Answer
import com.example.quizme.data.Person
import com.example.quizme.data.Question
import com.example.quizme.data.QuizRepository
import com.example.quizme.data.keyForSavingLatestQuiz
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

private val mockAnswer = Answer("", "", "", 1)
val mockQuestion = Question(1, "fakePerson", "fakeQuestion", answer = mockAnswer)

class MainViewModel(
    val repository: QuizRepository,
) : ViewModel() {

    val latestQuizName = repository.dataStore.data.map {
        it.asMap()[keyForSavingLatestQuiz].toString()
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        "Gandhi Soto Sanchez"
    )

    /**
     * Questions / Quizzes / UserInfo
     * No other data is received here
     */
    private val _mainRouteNavigation =
        MutableLiveData("Welcome!") // default main (list of questions)
    val mainRouteNavigation: LiveData<String>
        get() = _mainRouteNavigation

    /**
     * Reference to display other components based on this route
     */
    private val _secondaryRouteNavigation = MutableLiveData("")
    val secondaryRouteNavigation: LiveData<String>
        get() = _secondaryRouteNavigation

    /**
     * Useful to have a reference for next and previous level
     */
    private var _questionNavigation = MutableLiveData(QuestionNavigation())
    val questionNavigation: LiveData<QuestionNavigation>
        get() = _questionNavigation


    /**
     * Reference to store selected questions on EditQuiz
     */
    private val _selectedQuestions = mutableStateOf<Set<Question>>(emptySet())
    val selectedQuestions: State<Set<Question>> = _selectedQuestions

    /**
     * reference to display floating buttons based on EditQuiz params
     */
    private var _inSelectionMode = MutableLiveData(false)
    val inSelectionMode: LiveData<Boolean>
        get() = _inSelectionMode


    fun toggleQuestionSelection(question: Question) {
        val newSelection = _selectedQuestions.value.toMutableSet()

        if (question in newSelection)
            newSelection.remove(question)
        else {
            if (_selectedQuestions.value.isEmpty()) // if it's the 1st item in adding
                _inSelectionMode.value = true
            newSelection.add(question)
        }
        _selectedQuestions.value = newSelection

        if (_selectedQuestions.value.isEmpty()) // if it's last item in deselecting
            _inSelectionMode.value = false
    }

    fun clear() {
        _selectedQuestions.value = emptySet()
        _inSelectionMode.value = false
    }

    fun selectAll() {
        _inSelectionMode.value = true
        _selectedQuestions.value = _allQuestions.value ?: emptySet()
    }

    fun deleteQuestions() {
        viewModelScope.launch {
            repository.deleteQuestions(_selectedQuestions.value.toList())
            clear()
        }
    }

    fun deleteAQuiz(name: String) {
        viewModelScope.launch {
            val person: Person
            coroutineScope {
                person = repository.getAPerson(name).first()
            }
            repository.deleteAQuiz(emptyList(), person)
        }
    }

    /**
     * Util var to function selectAll()
     * When a quiz to edit is displayed, calculates all questions
     */
    private var _allQuestions = MutableLiveData(emptySet<Question>())
    val allQuestions: LiveData<Set<Question>>
        get() = _allQuestions

    fun calculateAllQuestionsFromSomeone(quizName: String) {
        val newSet = mutableSetOf<Question>()
        viewModelScope.launch {
            coroutineScope {
                newSet.addAll(
                    try { repository.getAllQuestionsFromSomeone(quizName).first().questions }
                    catch (e: NullPointerException) { emptySet() }
                )
            }
            _allQuestions.value = newSet
        }
    }

    fun changeMainRoute(mainRouteName: String) {
        _mainRouteNavigation.value = mainRouteName
    }

    fun changeSecondaryNavigation(route: String) {
        _secondaryRouteNavigation.value = route
    }

    fun getNextAndPreviousQuestion(list: List<Question>, currentQuestionId: Int) {
        val currentLevel = list.find { it.questionId == currentQuestionId } ?: mockQuestion
        val indexOfCurrentLevel = list.indexOf(currentLevel)

        _questionNavigation.value = QuestionNavigation(
            listOfQuestions = list,
            currentQuestion = currentLevel,
            // if a question is not found by any reason, mockQuestion is returned
            nextQuestion = if (indexOfCurrentLevel == -1) mockQuestion
            else list.getOrNull(indexOfCurrentLevel.inc()) ?: mockQuestion,

            previousQuestion = if (indexOfCurrentLevel == -1) mockQuestion
            else list.getOrNull(indexOfCurrentLevel.dec()) ?: mockQuestion
        )
    }
}

data class QuestionNavigation(
    val listOfQuestions: List<Question> = emptyList(),
    val currentQuestion: Question = mockQuestion,
    val nextQuestion: Question = mockQuestion,
    val previousQuestion: Question = mockQuestion,
)
