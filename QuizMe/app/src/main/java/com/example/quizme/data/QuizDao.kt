package com.example.quizme.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {
    @Transaction
    @Query("select * from Person where completeName = :completeName")
    fun getAllQuestionsFromSomeone(completeName: String): Flow<PersonQuestions>

    @Query("select * from question where questionId = :id")
    fun getOne(id: Int): Flow<Question>
}