package com.example.quizme

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.quizme.data.AppContainer
import com.example.quizme.data.DefaultContainer
import com.example.quizme.data.PreferencesRepository

private const val PREFERENCE_QUIZ_ME = "preference_quiz_me"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = PREFERENCE_QUIZ_ME
)
class QuizApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultContainer(this, PreferencesRepository(dataStore))
    }
}