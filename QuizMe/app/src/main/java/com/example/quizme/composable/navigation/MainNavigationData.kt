package com.example.quizme.composable.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.quizme.R

data class MainNavigationData(
    val name: String,
    val icon: ImageVector,
    @StringRes val stringResource: Int
)

object NavigationList{
    val main = listOf(
        MainNavigationData(
            name = "questions",
            icon = Icons.Filled.List,
            stringResource = R.string.level
        ),

        MainNavigationData(
            name = "quizzes",
            icon = Icons.Filled.Search,
            stringResource = R.string.quizzes
        ),

        MainNavigationData(
            name = "userInfo",
            icon = Icons.Filled.Person,
            stringResource = R.string.userInfo
        )
    )

    val level = listOf(
        MainNavigationData(
            name = "previousLevel",
            icon = Icons.Filled.ArrowBack,
            stringResource = R.string.previousLevel
        ),

        MainNavigationData(
            name = "home",
            icon = Icons.Filled.Home,
            stringResource = R.string.home
        ),

        MainNavigationData(
            name = "nextLevel",
            icon = Icons.Filled.ArrowForward,
            stringResource = R.string.nextLevel
        )
    )

}