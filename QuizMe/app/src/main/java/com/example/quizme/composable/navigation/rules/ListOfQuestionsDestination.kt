package com.example.quizme.composable.navigation.rules

import com.example.quizme.R
import com.example.quizme.composable.navigation.NavigationList

object ListOfQuestionsDestination : NavigationDestination {
    override val route: String = NavigationList.main.first().name
    override val routeRes: Int = R.string.questions
    val name = "name"
    val routeWithArgs = "$route/{$name}"
}