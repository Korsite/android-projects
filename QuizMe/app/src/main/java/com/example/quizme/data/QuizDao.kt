package com.example.quizme.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {
    @Transaction
    @Query("select * from Person where completeName = :completeName")
    fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions>

    @Transaction
    @Query("select distinct completeName, age from Person")
    fun getAllQuestionsFromEveryone(): Flow<List<PersonQuestions>>

    @Query("select * from question where questionId = :id")
    fun getAQuestion(id: Int): Flow<Question>

    @Query("select * from Person where completeName = :completeName")
    fun getAPerson(completeName: String): Flow<Person>

    @Insert
    fun insertANewPerson(person: Person)

    @Insert
    fun insertANewQuestion(question: Question)

    @Update
    suspend fun modifyLevelState(question: Question)

    @Update
    suspend fun resetAllQuestionsFromSomeone(questions: List<Question>)

    @Delete
    suspend fun deleteQuestions(questions: List<Question>)

    @Delete
    suspend fun deleteAQuiz(questions: List<Question>, person: Person)
}