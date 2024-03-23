package com.example.quizme.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question(
    @PrimaryKey(autoGenerate = true)
    val questionId: Int,
    val personId: String,
    val question: String,
    val resolved: Boolean = false,
    val attemptsLeft: Int = 2,
    @Embedded
    val answer: Answer,
)

data class Answer(
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val correctAnswer: Int
)