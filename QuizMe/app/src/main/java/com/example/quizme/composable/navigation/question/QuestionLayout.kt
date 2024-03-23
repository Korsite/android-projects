package com.example.quizme.composable.navigation.question

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.composable.screenState.ErrorScreen
import com.example.quizme.composable.screenState.LoadingScreen
import com.example.quizme.data.Question
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.forQuestions.QuestionViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun QuestionLayout(
    modifier: Modifier,
    navController: NavController,
    onChangeLevel: (Int, String) -> Unit,
) {
    val viewModel: QuestionViewModel = viewModel(factory = FactoryViewModelProvider.Factory)

    val levelUiState by viewModel.questionUiState.collectAsState()

    when (val result = levelUiState) {
        is ChargingState.Loading -> LoadingScreen(modifier)
        is ChargingState.Error -> ErrorScreen {
            navController.navigate(
                "home"
            )
        }
        is ChargingState.Correct ->
            QuestionScreen(
                modifier = modifier,
                viewModel = viewModel,
                listOfQuestions = result.personToQuestions.questions,
                question = result.question,
                onChangeLevel = onChangeLevel
            )
    }
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun QuestionScreen(
    modifier: Modifier = Modifier,
    viewModel: QuestionViewModel,
    listOfQuestions: List<Question>,
    question: Question,
    onChangeLevel: (Int, String) -> Unit,
) {
    val indexOfCurrentLevel = listOfQuestions.indexOf(question)

    val previousQuestion =
        if (indexOfCurrentLevel > 0) listOfQuestions[indexOfCurrentLevel - 1]
        else question

    val nextQuestion =
        if (indexOfCurrentLevel < listOfQuestions.lastIndex) listOfQuestions[indexOfCurrentLevel + 1]
        else question


    if (listOfQuestions.isNotEmpty())
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var onSelect by rememberSaveable {
                mutableStateOf(listOf(false, false, false))
            }

            var correctAnswer by rememberSaveable {
                mutableStateOf(-1)
            }


            val listOfAnswers = listOf(
                question.answer.answer1,
                question.answer.answer2,
                question.answer.answer3,
            )
            Text(text = question.question + " correct answer is ${question.answer.correctAnswer} you have ${question.attemptsLeft} attempts left")

            listOfAnswers.forEachIndexed { index, answer ->
                Text(
                    text = answer,
                    color = if (correctAnswer == index) Color.Green else Color.Gray,
                    modifier = Modifier.clickable {
                        onSelect = onSelect.mapIndexed { index2, _ ->
                            index == index2
                        }
                    }
                )
            }

            var countingtTo0 by rememberSaveable { // makes button unavailable when counting to 0
                mutableStateOf(false)
            }
            Button(
                onClick = {
                    countingtTo0 = !countingtTo0

                    correctAnswer = if (question.answer.correctAnswer == onSelect.indexOf(true) + 1)
                        question.answer.correctAnswer - 1
                    else -1

                    viewModel.checkAnswer(
                        answerCorrect = correctAnswer >= 0,
                        question = question,
                        // TODO question.attemptsLeft == 1 should be to 0, but works with 1, check later why
                        nextQuestion = if (correctAnswer >= 0 || question.attemptsLeft == 1) nextQuestion else question
                    ) { questionId, personId -> onChangeLevel(questionId, personId) }

                },
                enabled = !countingtTo0 && onSelect.contains(true) && question.attemptsLeft > 0 && !question.resolved
            ) {
                Text(text = "Check")
            }

            if (question.attemptsLeft == 0)
                Text(text = "Question not solved, sorry for you")

            if(question.resolved)
                Text(text = "Solved")

            if (countingtTo0)
                Text(text = "${if (correctAnswer >= 0) "Correct!" else "Incorrect!"} ${viewModel.count.intValue} seconds")
        }
}

@Composable
fun SnackBar(
    scope: CoroutineScope,
    snackBarHostState: SnackbarHostState,
) {
    ExtendedFloatingActionButton(
        text = { Text("Show snackbar") },
        icon = { Icon(Icons.Filled.Check, contentDescription = "") },
        onClick = {
            scope.launch {
                snackBarHostState.showSnackbar("Snackbar", duration = SnackbarDuration.Short)
            }
        }
    )
}
