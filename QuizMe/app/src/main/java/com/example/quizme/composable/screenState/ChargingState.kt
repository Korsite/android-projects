package com.example.quizme.composable.screenState

import com.example.quizme.data.Answer
import com.example.quizme.data.Person
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.Question

sealed interface ChargingState {
    data class Correct(
        val question: Question = mockQuestion,
        val personToQuestions: PersonQuestions = mockPersonToQuestions,
        val listOfPersonToQuestions: List<PersonQuestions> = listOf(personToQuestions)
    ) : ChargingState

    object Loading : ChargingState
    object Error : ChargingState

    private companion object {
        private val mockAnswer = Answer("", "", "", 1)
        private val mockPerson = Person("fakePerson", 1_000)
        private val mockQuestion = Question(1, "fakePerson", "fakeQuestion", answer = mockAnswer)
        private val mockPersonToQuestions = PersonQuestions(
            mockPerson,
            listOf(mockQuestion)
        )
    }
}