package com.example.quizme.viewModels.forQuestions

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.data.QuizRepository
import com.example.quizme.data.keyForSavingLatestQuiz
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

//TODO problem not fixed -> rarely, the correct quiz is not displayed, spite of info stored in DataStore

class ListViewModel(
    val repository: QuizRepository,
) : ViewModel() {

    val latestQuizName: StateFlow<String> = repository.dataStore.data.map {
        it.asMap()[keyForSavingLatestQuiz].toString()
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        ""
    )


    @OptIn(ExperimentalCoroutinesApi::class)
    val allQuestionsFromSomeone: StateFlow<ChargingState> = latestQuizName.flatMapLatest { quizName ->
        repository.getAllQuestionsFromSomeone(quizName).map {
            try {
                ChargingState.Correct(personToQuestions = it)
            } catch (e: NullPointerException) {
                Log.e("$e", "Info not found bitch!")
                ChargingState.Error
            }

        }
    }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            ChargingState.Loading
        )

}