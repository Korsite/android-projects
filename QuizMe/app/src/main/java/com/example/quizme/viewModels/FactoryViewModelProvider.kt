package com.example.quizme.viewModels

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.quizme.QuizApplication
import com.example.quizme.viewModels.forQuestions.ListViewModel
import com.example.quizme.viewModels.forQuestions.QuestionViewModel
import com.example.quizme.viewModels.forQuizzes.EditQuestionViewModel
import com.example.quizme.viewModels.forQuizzes.EditQuizViewModel
import com.example.quizme.viewModels.forQuizzes.QuizzesViewModel

object FactoryViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            ListViewModel(
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            QuestionViewModel(
                savedStateHandle =  this.createSavedStateHandle(),
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            QuizzesViewModel(
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            MainViewModel(
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            EditQuizViewModel(
                repository = QuizApplication().container.repository
            )
        }

        initializer {
            EditQuestionViewModel(
                savedStateHandle = this.createSavedStateHandle(),
                repository = QuizApplication().container.repository
            )
        }
    }
}

fun CreationExtras.QuizApplication(): QuizApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as QuizApplication)
