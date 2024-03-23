package com.example.quizme.data

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.catch
import java.io.IOException

const val LATEST_QUIZ = "LATEST_QUIZ"
val keyForSavingLatestQuiz = stringPreferencesKey(LATEST_QUIZ)

class PreferencesRepository(
    private val dataStore: DataStore<androidx.datastore.preferences.core.Preferences>
) {
    val data = dataStore.data.catch {
        if (it is IOException) {
            Log.e("UserPreferences", "Error reading preferences", it)
            emit(emptyPreferences())
        } else throw it
    }

    suspend fun saveLatestQuizName(nameOfLatestQuiz: String){
        dataStore.edit { preference ->
            preference[keyForSavingLatestQuiz] = nameOfLatestQuiz
        }
    }



}