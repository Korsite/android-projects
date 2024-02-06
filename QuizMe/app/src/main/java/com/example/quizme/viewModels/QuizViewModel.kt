package com.example.quizme.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.data.Person
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.QuizRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class QuizViewModel(
    repository: QuizRepository
): ViewModel() {

    val call = repository.getAllQuestionsFromSomeone("Gandhi Soto").stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        PersonQuestions(
            Person("", 0),
            emptyList()
        )
    )

}

