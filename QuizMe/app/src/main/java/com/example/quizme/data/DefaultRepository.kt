package com.example.quizme.data

import kotlinx.coroutines.flow.Flow

class DefaultRepository(
    private val quizDao: QuizDao,
    dataStore: PreferencesRepository
): QuizRepository {
    override fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions> =
        quizDao.getAllQuestionsFromSomeone(completeName)

    override fun getAllQuestionsFromEveryone(): Flow<List<PersonQuestions>> =
        quizDao.getAllQuestionsFromEveryone()

    override fun getAQuestion(id: Int): Flow<Question> =
        quizDao.getAQuestion(id)

    override fun getAPerson(completeName: String): Flow<Person> =
        quizDao.getAPerson(completeName)

    override suspend fun insertANewPerson(person: Person) =
        quizDao.insertANewPerson(person)

    override suspend fun insertANewQuestion(question: Question) =
        quizDao.insertANewQuestion(question)

    override suspend fun updateQuestion(question: Question) =
        quizDao.modifyLevelState(question)

    override suspend fun resetAllQuestionsFromSomeone(questions: List<Question>) =
        quizDao.resetAllQuestionsFromSomeone(questions)

    override suspend fun deleteQuestions(questions: List<Question>) =
        quizDao.deleteQuestions(questions)

    override suspend fun deleteAQuiz(questions: List<Question>, person: Person) =
        quizDao.deleteAQuiz(questions, person)

    override val dataStore: PreferencesRepository =
        dataStore
}