package com.example.quizme.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.quizme.composable.navigation.LevelDestination
import com.example.quizme.data.Answer
import com.example.quizme.data.Question
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.LevelChargingState
import com.example.quizme.viewModels.LevelViewModel
import com.example.quizme.viewModels.QuizViewModel
import kotlinx.coroutines.launch

@Composable
fun QuizNavHost(
    viewModel: QuizViewModel = viewModel(factory = FactoryViewModelProvider.Factory),
    navController: NavHostController,
) {
    val list by viewModel.call.collectAsState()



    NavHost(navController = navController, startDestination = "home") {
        composable(
            route = "home"
        ) {
            levels(list.questions) { questionId, question ->
                navController.navigate("${LevelDestination.route}/${question.personId}/${questionId}")
            }
        }

        composable(
            route = LevelDestination.routeWithArgs,
            arguments = listOf(
                navArgument(LevelDestination.levelIdArg) { type = NavType.IntType },
                navArgument(LevelDestination.name) { type = NavType.StringType }
            )
        ) {
            val viewModel2: LevelViewModel = viewModel(factory = FactoryViewModelProvider.Factory)
            val levelUiState by viewModel2.levelUiState.collectAsState()
            when(val result = levelUiState){
                is LevelChargingState.Loading -> Text(text = "loading")
                is LevelChargingState.Error -> Text(text = "question not found", Modifier.clickable { navController.navigateUp() })
                is LevelChargingState.Correct -> QuestionsLayout(
                    viewModel = viewModel2,
                    listOfQuestions = list.questions,
                    question = result.question,
                    onChangeLevel = { questionId ->
                        navController.navigate("${LevelDestination.route}/${result.question.personId}/${questionId}")
                    },
                    onBack = { navController.navigate("home") }
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun levels(list: List<Question>, onClick: (Int, Question) -> Unit) {
    if (list.isNotEmpty())
        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
        ) {
            itemsIndexed(list) { index, item ->
                Card(
                    onClick = { onClick(item.questionId, item) }
                ) {
                    Text(text = "question ${index + 1}")
                }
            }
        }
    else {
        Text(text = "no")
    }

}


@Composable
fun QuestionsLayout(
    viewModel: LevelViewModel,
    listOfQuestions: List<Question>,
    question: Question,
    onChangeLevel: (Int) -> Unit,
    onBack: () -> Unit,
) {
    val coroutinesScope = rememberCoroutineScope()

    val indexOfCurrentLevel = listOfQuestions.indexOf(question)

    val previousQuestion =
        if (indexOfCurrentLevel > 0) listOfQuestions[indexOfCurrentLevel - 1]
        else question

    val nextQuestion =
        if (indexOfCurrentLevel < listOfQuestions.lastIndex) listOfQuestions[indexOfCurrentLevel + 1]
        else question

    if (listOfQuestions.isNotEmpty())
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = onBack) {
                Text(text = "back")
            }

            var onSelect by rememberSaveable {
                mutableStateOf(listOf(false, false, false))
            }

            var correctAnswer by rememberSaveable {
                mutableStateOf(Pair(-1, false))
            }


            val listOfAnswers = listOf(
                question.answer.answer1,
                question.answer.answer2,
                question.answer.answer3,
            )
            Text(text = question.question + " correct answer is ${question.answer.correctAnswer}")

            listOfAnswers.forEachIndexed { index, answer ->

                Text(
                    text = answer,
                    color = if (correctAnswer.first == index) Color.Green else Color.Gray,
                    modifier = Modifier.clickable {
                        onSelect = onSelect.mapIndexed { index2, _ ->
                            index == index2
                        }
                    }
                )
            }

            Button(onClick = {
                correctAnswer = if (question.answer.correctAnswer == onSelect.indexOf(true) + 1) {
                    coroutinesScope.launch {
                        viewModel.countTo0()
                        onChangeLevel(nextQuestion.questionId)
                    }
                    Pair(onSelect.indexOf(true), true)
                }
                else {
                    coroutinesScope.launch {
                        viewModel.countTo0()
                        onChangeLevel(question.questionId)
                    }
                    Pair(-1, false)
                }
            }) {
                Text(text = "Check")
            }

            if (correctAnswer.second)
                Text(text = "Correct! ${viewModel.count.value} seconds")

            Spacer(modifier = Modifier.height(100.dp))
            Row {


                Button(
                    onClick = { onChangeLevel(previousQuestion.questionId) },
                    enabled = listOfQuestions.indexOf(question) != 0
                ) {
                    Text(text = "previous")
                }
                Button(
                    onClick = { onChangeLevel(nextQuestion.questionId) },
                    enabled = listOfQuestions.indexOf(question) != listOfQuestions.lastIndex
                ) {
                    Text(text = "next")
                }
            }
        }
}

@Composable
@Preview
fun quetionPrevie() {
    QuestionsLayout(
        viewModel = viewModel(),
        question = Question(
            1, "Gandhi", "Question 1",
            Answer(
                "Answer 1", "Answer 2", "Answer 3", 1
            )
        ),
        listOfQuestions = emptyList(),
        onChangeLevel = {},
        onBack = {}
    )
}