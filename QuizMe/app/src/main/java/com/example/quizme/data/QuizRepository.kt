package com.example.quizme.data

import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    // query
    fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions>
    fun getAllQuestionsFromEveryone(): Flow<List<PersonQuestions>>
    fun getAQuestion(id: Int): Flow<Question>
    fun getAPerson(completeName: String): Flow<Person>

    // insert
    suspend fun insertANewPerson(person: Person)
    suspend fun insertANewQuestion(question: Question)

    // update
    suspend fun updateQuestion(question: Question)
    suspend fun resetAllQuestionsFromSomeone(questions: List<Question>)

    // delete
    suspend fun deleteQuestions(questions: List<Question>)
    suspend fun deleteAQuiz(questions: List<Question>, person: Person)

    val dataStore: PreferencesRepository
}