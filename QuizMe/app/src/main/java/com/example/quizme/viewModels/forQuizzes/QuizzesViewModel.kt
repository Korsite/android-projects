package com.example.quizme.viewModels.forQuizzes

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.data.Person
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.Question
import com.example.quizme.data.QuizRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class QuizzesViewModel(
    val repository: QuizRepository,
) : ViewModel() {

    val allQuizzes: StateFlow<ChargingState> = repository.getAllQuestionsFromEveryone().map {
        try {
            ChargingState.Correct(
                listOfPersonToQuestions = it
            )
        } catch (e: NullPointerException) {
            Log.e("$e", "Info not found bitch!")
            ChargingState.Error
        }
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        ChargingState.Loading
    )

    /**
     * reference to the latest quiz tapped, useful to alert dialogs, so they can know
     * which quiz to be edited, displayed, reset, or removed
     */
    private var _quizTapped: MutableLiveData<PersonQuestions> = MutableLiveData()
    val quizTapped: LiveData<PersonQuestions>
        get() = _quizTapped

    fun changeLatestQuizTapped(personQuestions: PersonQuestions){
        _quizTapped.value = personQuestions
    }

    fun saveLatestQuizName(latestQuizName: String) {
        viewModelScope.launch {
            repository.dataStore.saveLatestQuizName(latestQuizName)
        }
    }


    fun resetAllQuestionFromSomeone(questionsToModify: List<Question>) {
        val questionsModified =
            questionsToModify.map { it.copy(resolved = false, attemptsLeft = 2) }
        viewModelScope.launch {
            repository.resetAllQuestionsFromSomeone(questionsModified)
        }
    }

    fun deleteAQuiz(listOfQuestions: List<Question>, person: Person) {
        viewModelScope.launch {
            repository.deleteAQuiz(listOfQuestions, person)
        }
    }

    fun insertAQuiz(newPerson: Person) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.insertANewPerson(newPerson)
            }
        }
    }

    private var _newQuizUiState = MutableLiveData(NewQuizUiState())
    val newQuizUiState: LiveData<NewQuizUiState>
        get() = _newQuizUiState


    fun updateInput(newInput: NewQuizUiState) {
        _newQuizUiState.value =
            newInput.checkInputs()
    }

    private fun NewQuizUiState.checkInputs(): NewQuizUiState {
        return NewQuizUiState(
            newName = newName,
            age = age,
            nameIsValid = newName.isNotBlank() && newName.isValidName() && newName.length >= 3,
            nameIsLong = newName.length >= 50,
            validAgeInput = age in 1..100,
            quizRepeated = checkQuizNameRepeated(newName.trim())
        )
    }

    private fun checkQuizNameRepeated(name: String): Boolean {
        val allQuizzesName =
            if (allQuizzes.value is ChargingState.Correct)
                (allQuizzes.value as ChargingState.Correct).listOfPersonToQuestions.map { it.person.completeName }
            else emptyList()

        return allQuizzesName.any { it.equals(name, ignoreCase = true) }
    }


    private var _alertDialogUiState = MutableLiveData(AlertDialogUiState())
    val alterDialogUiState: LiveData<AlertDialogUiState>
        get() = _alertDialogUiState

    fun updateAlertDialog(uiState: AlertDialogUiState) {
        _alertDialogUiState.value = uiState
    }

    fun dismissAlertDialogs() {
        _alertDialogUiState.value = AlertDialogUiState()
    }
}



data class AlertDialogUiState(
    val displayResetAlertDialog: Boolean = false,
    val displayEditAlertDialog: Boolean = false,
    val displayDeleteAlertDialog: Boolean = false,
    val displayAddNewQuizAlertDialog: Boolean = false,
)


data class NewQuizUiState(
    val newName: String = "",
    val age: Int = 1,
    val nameIsValid: Boolean = false,
    val nameIsLong: Boolean = false,
    val validAgeInput: Boolean = true,
    val quizRepeated: Boolean = false,
)

fun String.isValidName(): Boolean {
    val regex = "^[a-zA-Z\\s]+$".toRegex()
    return this.matches(regex)
}

