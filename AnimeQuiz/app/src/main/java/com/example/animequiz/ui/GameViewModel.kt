package com.example.animequiz.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.animequiz.Difficulty
import com.example.animequiz.R
import com.example.animequiz.data.MAX_PICTURES_PER_ROUND
import com.example.animequiz.data.MAX_POINTS
import com.example.animequiz.data.MINIMUM_POINTS_REACH_DIFFICULT
import com.example.animequiz.data.MINIMUM_POINTS_REACH_MEDIUM
import com.example.animequiz.data.MINIMUM_POINTS_WIN_GAME
import com.example.animequiz.data.POINTS_IF_HINTS_WATCHED
import com.example.animequiz.data.POINTS_PER_ROUND
import com.example.animequiz.data.animeData
import com.example.animequiz.data.animeInformation
import com.example.animequiz.data.animeInformationHints
import com.example.animequiz.data. animeInformationHints
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * currentPicture = shows the current picture, this variable is changed when
 * pickARandomPicture is called
 *
 * picturesUsed = mutableMap which adds a @Drawable every time pickARandomPicture is called
 * and it gets cleared when resetGame is called
 *
 * AbleToSubtractPoints checks if points may be subtracted, since user may click
 * many times "Click me, hints/info!" button, it doesn't subtract every time user clicks.
 * It is by default false, but it turns true when button (blackly mentioned) is pressed,
 * It turns true when either updateScore() or skipPicture() is called
 *
 * currentDifficulty allows to access which information is going to be consumed in the
 * data variables, such as animeInformationHints and animeData
 *
 * showHints, it shows the hints of current character, it is false by default, it changes into true/false
 * when showHints() is called, it gets false when one of these functions is called ->
 * resetGame, skipPicture, updateScore
 *
 * userCheckWord, it consumes the user answer from the screen
 *
 * currentAnswer, it updates every time pickARandomPicture is called
 * [also useful when user skips, so app sends a message saying which characters was the previous]
 *
 * possibleAnswers, it is a list of Strings which are all of the possibilities the currentAnswers could be
 * it updates with pickARandomPicture
 */

fun <K, V> getKey(map: Map<K, V>, target: V): K? { // this method is used in checkUserWord function
    for ((key, value) in map)
    {
        if (target == value) {
            return key
        }
    }
    return null
}

fun main() {
    val map: MutableMap<String?, Int?> = HashMap()

    map["A"] = 1
    map["B"] = 2
    map["C"] = 3

    println(getKey(map, 2))        // output: 'B'

}

class GameViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(GameUiState())
    val uiState = _uiState.asStateFlow()

    private var currentPicture : Int = 0
    private val picturesUsed = mutableSetOf<Int>()
    private var ableToSubtractPoints by mutableStateOf(true)
    var currentDifficulty by mutableStateOf(Difficulty.EASY)
    var showHints by mutableStateOf(false)
    var userCheckWord by mutableStateOf("")
    var currentAnswer by mutableStateOf("")

    var possibleAnswers by mutableStateOf(listOf<String>())


    init {
        resetGame()
    }

    fun resetGame(){
        picturesUsed.clear()
        showHints = false
        _uiState.value = GameUiState(currentPicture = NEWpickARandomPicture())
        findHints()
    }


    fun showHints(){
        var pointsIfHintsWatched = _uiState.value.totalScore - POINTS_IF_HINTS_WATCHED
        if(ableToSubtractPoints) {
            _uiState.value.totalScore = pointsIfHintsWatched
            ableToSubtractPoints = false
        }
        showHints = !showHints
    }

    fun updateUserWordCheck(CheckWord : String){
        userCheckWord = CheckWord
    }

    fun checkUserWord(){
        if(possibleAnswers.contains(userCheckWord.lowercase())){
            val updateScore = uiState.value.totalScore + POINTS_PER_ROUND.toInt()
            updateScore(updateScore)
        }
        else
            _uiState.update { currentState ->
                currentState.copy(
                    wordIsWrong = true
                )
            }
        updateUserWordCheck("")
    }

    fun skipPicture(){
        if(_uiState.value.picturesShowed < MAX_PICTURES_PER_ROUND){
            _uiState.update { currentState ->
                currentState.copy(
                    currentPicture = NEWpickARandomPicture(),
                    picturesShowed = uiState.value.picturesShowed.inc()
                )
            }
        }else {
            _uiState.update { currentState ->
                currentState.copy(
                    gameIsOver = true,
                    messageAtTheEnd = checkMessageAtTheEnd(),
                    needingPointsToReachNextLevel = checkHowManyPointsToReachLevel(),
                    messageEitherSucceedOrFailed = checkEitherMessageAtTheEndIsSucceedORFailed()
                )
            }
        }
        updateUserWordCheck("")
        showHints = false
        ableToSubtractPoints = true
    }


    fun findHints(){
        setWordShuffled()
        val hints =
             animeInformationHints[currentDifficulty]?.getValue(possibleAnswers) ?:
            animeInformation(R.string.kokushibo_hint_1, R.string.kokushibo_hint_2, R.string.kokushibo_hint_3)

        _uiState.update { currentState ->
            currentState.copy(
                hint1  = hints.hint1,
                hint2 = hints.hint2,
                hint3 = hints.hint3
            )
        }
    }

    fun NEWfindPossibleAnswers(){
        possibleAnswers =  animeInformationHints[currentDifficulty]?.keys?.filter {
            it.contains(currentAnswer)
        }?.flatten() ?: emptyList()
    }

    fun changeDifficulty(difficulty: Difficulty){
        currentDifficulty = difficulty
    }

    private fun NEWpickARandomPicture() : Int{
        currentPicture =  animeData[currentDifficulty]?.values?.random() ?: currentPicture

        return if(picturesUsed.contains(currentPicture))
            NEWpickARandomPicture()
        else{
            currentAnswer =  getKey( animeData[currentDifficulty] ?: emptyMap(), currentPicture).toString()
            NEWfindPossibleAnswers()
            picturesUsed.add(currentPicture)
            currentPicture
        }
    }

    private fun updateScore(score : Int){
        if(uiState.value.picturesShowed < MAX_PICTURES_PER_ROUND){
            _uiState.update { currentState ->
                currentState.copy(
                    currentPicture = NEWpickARandomPicture(),
                    picturesShowed = uiState.value.picturesShowed.inc(),
                    totalScore = score,
                    wordIsWrong = false,
                    )
            }
        }else{
            _uiState.update { currentState ->
                currentState.copy(
                    totalScore = score,
                    gameIsOver = true,
                    messageAtTheEnd = checkMessageAtTheEnd(),
                    needingPointsToReachNextLevel = checkHowManyPointsToReachLevel(),
                    messageEitherSucceedOrFailed = checkEitherMessageAtTheEndIsSucceedORFailed()
                )
            }
        }
        NEWfindPossibleAnswers()
        showHints = false
        ableToSubtractPoints = true
    }


    private fun setWordShuffled(){
        var wordShuffled =
            if(currentAnswer.count() in 1..2) "[Not given, 2 letters or less]"
            else currentAnswer.toList().shuffled().joinToString(separator = "")

        if(wordShuffled == currentAnswer)
            setWordShuffled()
        else {
            _uiState.update { currentState ->
                currentState.copy(
                    answered_shuffled = wordShuffled
                )
            }
        }
    }

    private fun checkMessageAtTheEnd() : Int{
        val scoreAtTheEndOfTheRound = _uiState.value.totalScore

        return if(scoreAtTheEndOfTheRound >= 0)
                when (_uiState.value.totalScore / MAX_POINTS){
                    in 0.0 .. 0.29 -> R.string.very_bad
                    in 0.3 .. 0.49 -> R.string.cant_blame_you
                    in 0.5 .. 0.69 -> R.string.well_done
                    in 0.7 .. 0.89 -> R.string.congratulations
                    else -> R.string.you_are_otaku
                }
        else R.string.negative_score
    }

    private fun checkHowManyPointsToReachLevel() : Int{
        val scoreAtTheEndOfTheRound = _uiState.value.totalScore

        val needingPointsToReachNextLevel = when(currentDifficulty){
            Difficulty.EASY -> MINIMUM_POINTS_REACH_MEDIUM - scoreAtTheEndOfTheRound
            Difficulty.MEDIUM -> MINIMUM_POINTS_REACH_DIFFICULT - scoreAtTheEndOfTheRound
            else -> MINIMUM_POINTS_WIN_GAME - scoreAtTheEndOfTheRound
        }

        return needingPointsToReachNextLevel
    }

    private fun checkEitherMessageAtTheEndIsSucceedORFailed() : Int{
        var totalScoreAtTheEnd = _uiState.value.totalScore

        return when(currentDifficulty){
            Difficulty.EASY ->
                if(totalScoreAtTheEnd >= MINIMUM_POINTS_REACH_MEDIUM) R.string.DifficultyEasy_messageRoundSucceed
                else R.string.DifficultyEasy_messageRoundFailed

            Difficulty.MEDIUM ->
                if(totalScoreAtTheEnd >= MINIMUM_POINTS_REACH_DIFFICULT) R.string.DifficultyMedium_messageRoundSucceed
                else R.string.DifficultyMedium_messageRoundFailed

            else ->
                if(totalScoreAtTheEnd >= MINIMUM_POINTS_WIN_GAME) R.string.DifficultyDifficult_messageRoundSucceed
                else R.string.DifficultyDifficult_messageRoundFailed
        }
    }
}