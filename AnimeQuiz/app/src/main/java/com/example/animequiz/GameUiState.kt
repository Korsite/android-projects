package com.example.animequiz

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

data class GameUiState(
    var currentPicture: Int = 0,
    var picturesShowed : Int = 1,
    var hint1 : Int = 0,
    var answered_shuffled : String = "",
    var hint2 : Int = 0,
    var hint3 : Int = 0,

    var wordIsWrong : Boolean = false,
    var totalScore : Int = 0,
    var gameIsOver : Boolean = false,
)