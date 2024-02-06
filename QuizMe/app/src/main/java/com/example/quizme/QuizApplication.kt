package com.example.quizme

import android.app.Application
import com.example.quizme.data.AppContainer
import com.example.quizme.data.DefaultContainer

class QuizApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultContainer(this)
    }
}