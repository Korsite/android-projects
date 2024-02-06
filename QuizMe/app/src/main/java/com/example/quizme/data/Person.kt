package com.example.quizme.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
    @PrimaryKey
    val completeName: String,

    val age: Int
)

