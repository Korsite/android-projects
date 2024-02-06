package com.example.quizme.data

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
/**
 * TODO implement 2 columns more: resolved: Boolean, attemptsLeft: Int (ignore column) = 2
 */
@Entity
data class Question(
    @PrimaryKey(autoGenerate = true)
    val questionId: Int,
    val personId: String,
    val question: String,
    @Embedded
    val answer: Answer,
)

data class Answer(
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val correctAnswer: Int
)