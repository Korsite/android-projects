package com.example.quizme.data

import kotlinx.coroutines.flow.Flow

class DefaultRepository(private val quizDao: QuizDao): QuizRepository {
    override fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions> =
        quizDao.getAllQuestionsFromSomeone(completeName)

    override fun getOne(id: Int): Flow<Question> =
        quizDao.getOne(id)
}