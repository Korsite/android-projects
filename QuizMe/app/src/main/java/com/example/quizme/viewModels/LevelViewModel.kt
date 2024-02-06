package com.example.quizme.viewModels

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.composable.navigation.LevelDestination
import com.example.quizme.data.Question
import com.example.quizme.data.QuizRepository
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class LevelViewModel(
    savedStateHandle: SavedStateHandle,
    val repository: QuizRepository,
) : ViewModel() {

    val questionId: Int = checkNotNull(savedStateHandle[LevelDestination.levelIdArg])

    var levelUiState: StateFlow<LevelChargingState> =
        repository.getOne(questionId).map {
            try {
                LevelChargingState.Correct(it)
            } catch (e: NullPointerException) {
                Log.e("$e", "$e")
                LevelChargingState.Error
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            LevelChargingState.Loading
        )
        private set


    var count = mutableIntStateOf(3)

    suspend fun countTo0() {
        coroutineScope {
            while (count.intValue > 0) {
                delay(1000)
                count.intValue -= 1
            }
        }
    }


}

sealed interface LevelChargingState {
    data class Correct(
        val question: Question,
    ) : LevelChargingState

    object Loading : LevelChargingState
    object Error : LevelChargingState
}