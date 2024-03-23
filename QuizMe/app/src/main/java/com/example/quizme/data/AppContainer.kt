package com.example.quizme.data

import android.content.Context

interface AppContainer{
    val repository: QuizRepository
}

class DefaultContainer(context: Context, dataStore: PreferencesRepository): AppContainer{
    override val repository: QuizRepository by lazy {
        DefaultRepository(
            QuizDatabase.getDatabase(context).quizDao(),
            dataStore
        )
    }
}