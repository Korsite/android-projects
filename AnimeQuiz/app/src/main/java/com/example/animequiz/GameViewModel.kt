package com.example.animequiz

import androidx.annotation.VisibleForTesting
import androidx.compose.animation.core.updateTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.internal.illegalDecoyCallException
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.toLowerCase
import androidx.lifecycle.ViewModel
import com.example.animequiz.data.MAX_PICTURES_PER_ROUND
import com.example.animequiz.data.MAX_POINTS
import com.example.animequiz.data.POINTS_IF_HINTS_WATCHED
import com.example.animequiz.data.POINTS_PER_ROUND
import com.example.animequiz.data.animeData
import com.example.animequiz.data.animeInformationHints
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


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
    private var ableToSubstractPoints by mutableStateOf(true)
    var showHints by mutableStateOf(false)
    var userCheckWord by mutableStateOf("")
    var previousAnswer by mutableStateOf("")
    var possibleAnswers by mutableStateOf(listOf<String>())


    init {
        resetGame()
    }

    fun showHints(){
        var pointsIfHintsWatched = _uiState.value.totalScore - POINTS_IF_HINTS_WATCHED
        if(ableToSubstractPoints) {
            _uiState.value.totalScore = pointsIfHintsWatched
            ableToSubstractPoints = false
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
        ableToSubstractPoints = true
    }

    fun skipPicture(){
        if(_uiState.value.picturesShowed < MAX_PICTURES_PER_ROUND){
            _uiState.update { currentState ->
                currentState.copy(
                    currentPicture = pickARandomPicture(),
                    picturesShowed = uiState.value.picturesShowed.inc()
                )
            }
        }else {
            _uiState.update { currentState ->
                currentState.copy(
                    gameIsOver = true
                )
            }
        }
        updateUserWordCheck("")
        showHints = false
        ableToSubstractPoints = true
    }

    fun resetGame(){
        picturesUsed.clear()
        _uiState.value = GameUiState(currentPicture = pickARandomPicture())
        findHints()
        findPossibleAnswers()
        setWordShuffled()
    }


    fun findHints(){
        setWordShuffled()
        val hints = animeInformationHints.getValue(possibleAnswers)

        _uiState.update { currentState ->
            currentState.copy(
                hint1  = hints.hint1,
                hint2 = hints.hint2,
                hint3 = hints.hint3
            )
        }
    }

    fun findPossibleAnswers(){
        possibleAnswers = animeInformationHints.keys.filter {
            it.contains(getKey(animeData, currentPicture))
        }.flatten()
    }

    private fun pickARandomPicture() : Int {
        currentPicture = animeData.values.random()

        return if(picturesUsed.contains(currentPicture))
            pickARandomPicture()
        else {
            findPossibleAnswers()

            previousAnswer = getKey(animeData, currentPicture).toString()
            picturesUsed.add(currentPicture)
            currentPicture
        }
    }


    private fun updateScore(score : Int){
        if(uiState.value.picturesShowed < MAX_PICTURES_PER_ROUND){
            _uiState.update { currentState ->
                currentState.copy(
                    currentPicture = pickARandomPicture(),
                    picturesShowed = uiState.value.picturesShowed.inc(),
                    totalScore = score,
                    wordIsWrong = false,
                    )
            }
        }else{
            _uiState.update { currentState ->
                currentState.copy(
                    totalScore = score,
                    gameIsOver = true
                )
            }
        }
        findPossibleAnswers()
        showHints = false
    }


    private fun setWordShuffled(word : String = getKey(animeData, currentPicture).toString()){
        var word_shuffled =
            if(word.count() in 1..2) "[Not given, 2 letters or less]"
            else word.toList().shuffled().joinToString(separator = "")

        if(word_shuffled.equals(word))
            setWordShuffled()
        else {

            _uiState.update { currentState ->
                currentState.copy(
                    answered_shuffled = word_shuffled
                )
            }
        }
    }
}