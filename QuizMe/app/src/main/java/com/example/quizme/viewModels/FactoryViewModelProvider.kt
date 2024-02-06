package com.example.quizme.viewModels

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.quizme.QuizApplication

object FactoryViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            QuizViewModel(
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            LevelViewModel(
                savedStateHandle =  this.createSavedStateHandle(),
                repository = QuizApplication().container.repository
            )
        }
    }
}

fun CreationExtras.QuizApplication(): QuizApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as QuizApplication)
