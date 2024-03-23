package com.example.quizme.composable.navigation.rules

import com.example.quizme.R

object EditQuizDestination : NavigationDestination {
    override val route: String = "EditQuiz"
    override val routeRes: Int = R.string.EditQuiz
    val name: String = "name"
    val routeWithArgs = "$route/{$name}"
}