package com.example.quizme.data

import androidx.room.Embedded
import androidx.room.Relation

data class PersonQuestions(
    @Embedded val person: Person,
    @Relation(
        parentColumn = "completeName",
        entityColumn = "personId"
    )
    val questions: List<Question>
)
