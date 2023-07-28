package com.example.animequiz.ui.test

import com.example.animequiz.Difficulty
import com.example.animequiz.ui.GameViewModel
import com.example.animequiz.data.MAX_PICTURES_PER_ROUND
import com.example.animequiz.data.POINTS_PER_ROUND
import com.example.animequiz.data.animeData
import com.example.animequiz.ui.GameUiState
import com.example.animequiz.ui.getKey
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    private val viewModel : GameViewModel = GameViewModel()

    @Test // Success/happy test
    fun gameViewModel_CorrectPictureGuessed_ScoreUpdatedPicturesShowedIncrementedAndErrorFlagUnset(){
        var currentUiState = viewModel.uiState.value
        var currentAnswer = getKey(animeData[Difficulty.EASY] ?: emptyMap(), currentUiState.currentPicture).toString()
        var previousNoOfPicture = currentUiState.picturesShowed

        viewModel.updateUserWordCheck(currentAnswer)

        viewModel.checkUserWord()

        currentUiState = viewModel.uiState.value

        assertEquals(SCORE_AFTER_1ST_GUESSED_CORRECT, currentUiState.totalScore)
        assertEquals(previousNoOfPicture + 1, currentUiState.picturesShowed)
        assertFalse(currentUiState.wordIsWrong)

    }

    @Test // Error test
    fun gameViewModel_IncorrectPictureGuessed_ErrorFlagSet(){
        viewModel.userCheckWord = "tu puta madre"
        viewModel.checkUserWord()

        var currentUiState = viewModel.uiState.value

        assertTrue(currentUiState.wordIsWrong)

    }


    @Test  // boundary test
    fun gameViewModel_AllPicturesSeen_gameIsOverSet(){
        repeat(MAX_NO_PICTURES_PER_ROUND){
            viewModel.skipPicture()
        }

        var currentUiState = viewModel.uiState.value
        assertTrue(currentUiState.gameIsOver)
    }


    @Test // boundary test
    fun gameViewModel_AllPicturesCorrect_MaxScore(){
        var maxScoreExpected = 0
        var currentUiState = viewModel.uiState.value
        var currentAnswer = getKey(animeData[Difficulty.EASY] ?: emptyMap(), currentUiState.currentPicture).toString()

        viewModel.updateUserWordCheck(currentAnswer)
        repeat(MAX_NO_PICTURES_PER_ROUND){
            viewModel.checkUserWord()
            currentUiState = viewModel.uiState.value
            maxScoreExpected += SCORE_AFTER_1ST_GUESSED_CORRECT


            currentAnswer = getKey(animeData[Difficulty.EASY] ?: emptyMap(), currentUiState.currentPicture).toString()
            viewModel.updateUserWordCheck(currentAnswer)                                    // preparing for the next loop to checkUserWord() method to be correct


            assertFalse(currentUiState.wordIsWrong)
        }

        assertEquals(MAX_SCORE, currentUiState.totalScore)
    }

    companion object{
        const val SCORE_AFTER_1ST_GUESSED_CORRECT = POINTS_PER_ROUND.toInt()
        const val MAX_NO_PICTURES_PER_ROUND = MAX_PICTURES_PER_ROUND.toInt()
        const val MAX_SCORE = SCORE_AFTER_1ST_GUESSED_CORRECT * MAX_NO_PICTURES_PER_ROUND
    }
}