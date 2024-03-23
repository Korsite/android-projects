package com.example.quizme.composable.navigation.rules

import com.example.quizme.R

object EditQuestionDestination : NavigationDestination {
    override val route: String = "EditQuestion"
    override val routeRes: Int = R.string.EditQuestion
    const val name = "name"
    const val levelIdArg = "levelId"
    val routeWithArgs = "$route/{$name}/{$levelIdArg}"
}
