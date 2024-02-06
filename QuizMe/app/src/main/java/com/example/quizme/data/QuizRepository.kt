package com.example.quizme.data

import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions>
    fun getOne(id: Int): Flow<Question>
}