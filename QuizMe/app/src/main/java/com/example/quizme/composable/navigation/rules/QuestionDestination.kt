package com.example.quizme.composable.navigation.rules

import com.example.quizme.R

object QuestionDestination: NavigationDestination {
    override val route: String = "level"
    override val routeRes: Int = R.string.level
    const val name = "name"
    const val levelIdArg = "levelId"
    val routeWithArgs ="$route/{$name}/{$levelIdArg}"
}