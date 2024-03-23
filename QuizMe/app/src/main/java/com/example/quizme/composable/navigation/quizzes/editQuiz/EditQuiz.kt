package com.example.quizme.composable.navigation.quizzes.editQuiz

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.quizme.composable.navigation.NavigationList
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.composable.screenState.ErrorScreen
import com.example.quizme.composable.screenState.LoadingScreen
import com.example.quizme.data.Question
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.MainViewModel
import com.example.quizme.viewModels.forQuizzes.EditQuizViewModel


// insert into Question values (null, "Elsy Dayany Hernandez Guerrero", "question", false, 2, "answer", "answer", "answer", 3)

@Composable
fun EditQuiz(
    modifier: Modifier = Modifier,
    navController: NavController,
    mainViewModel: MainViewModel,
    editQuizViewModel: EditQuizViewModel = viewModel(factory = FactoryViewModelProvider.Factory),
    onClickEditQuestion: (String, Int, List<Question>) -> Unit,
) {
    val questionsOfLatestQuizName by editQuizViewModel.allQuestionsFromSomeone.collectAsState()

    when (val result = questionsOfLatestQuizName) {
        is ChargingState.Error -> ErrorScreen {
            val route = NavigationList.main.component2().name
            mainViewModel.changeMainRoute(route)
            navController.navigate(route) // Quizzes
        }

        is ChargingState.Loading -> LoadingScreen(modifier = modifier)

        is ChargingState.Correct -> EditQuizLayout(
            modifier = modifier,
            mainViewModel = mainViewModel,
            listOfQuestionsToEdit = result.personToQuestions.questions,
            onClickEditQuestion = onClickEditQuestion
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun EditQuizLayout(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel,
    listOfQuestionsToEdit: List<Question>,
    onClickEditQuestion: (String, Int, List<Question>) -> Unit,
) {

    val list by mainViewModel.selectedQuestions

    val inSelectionMode = mainViewModel.inSelectionMode.observeAsState().value ?: false

    val latestQuizName by mainViewModel.latestQuizName.collectAsState()
    LazyVerticalGrid(
        modifier = modifier
            .padding(start = 10.dp, end = 10.dp),
        columns = GridCells.Fixed(4),
        verticalArrangement = Arrangement.spacedBy(3.dp),
        horizontalArrangement = Arrangement.spacedBy(3.dp),
    ) {
        itemsIndexed(
            listOfQuestionsToEdit,
            key = { _, question -> question.questionId }
        ) { index, questionToEdit ->
            val selected by remember { derivedStateOf { questionToEdit in list } }

            EditQuestionCard(
                modifier =
                if (inSelectionMode) Modifier.clickable {
                    mainViewModel.toggleQuestionSelection(questionToEdit)
                }
                else Modifier.combinedClickable(
                    onClick = {
                        onClickEditQuestion(
                            latestQuizName,
                            questionToEdit.questionId,
                            listOfQuestionsToEdit
                        )
                    },
                    onLongClick = {
                        mainViewModel.toggleQuestionSelection(questionToEdit)
                    }
                ),
                inSelectionMode = inSelectionMode,
                selected = selected,
                number = index.inc().toString()
            )
        }
        item {
            AddQuestionCard(
                modifier = Modifier.clickable {
                    onClickEditQuestion(
                        latestQuizName,
                        -1, // a position non-existent so mockQuestion is returned
                        listOfQuestionsToEdit
                    )
                }
            )
        }
    }
}

@Composable
fun AddQuestionCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.aspectRatio(1f),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.LightGray)
    ) {
        Box(modifier = modifier.fillMaxSize()) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
    }
}


@Composable
fun EditQuestionCard(
    modifier: Modifier = Modifier,
    inSelectionMode: Boolean,
    selected: Boolean,
    number: String,
) {
    val transition = updateTransition(selected, label = "selected")
    val padding by transition.animateDp(label = "padding") { selected ->
        if (selected) 5.dp else 0.dp
    }
    val roundedCornerShape by transition.animateDp(label = "corner") { selected ->
        if (selected) 16.dp else 0.dp
    }


    Surface(
        modifier = Modifier
            .aspectRatio(1f)
            .padding(padding)
            .clip(RoundedCornerShape(roundedCornerShape)),
        tonalElevation = 3.dp
    ) {
        val bgColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)

        Box(modifier = modifier) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Text(text = number)
            }
            if (inSelectionMode)
                if (selected)
                    Icon(
                        Icons.Filled.CheckCircle,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(end = 4.dp, top = 4.dp)
                            .border(2.dp, bgColor, CircleShape)
                            .clip(CircleShape)
                            .background(bgColor)
                    )
                else
                    Icon(
                        Icons.Outlined.CheckCircle,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(end = 4.dp, top = 4.dp)
                            .border(2.dp, bgColor, CircleShape)
                            .clip(CircleShape)
                            .background(bgColor)
                    )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun EditQuestionCardPreview() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) { EditQuestionCard(inSelectionMode = false, selected = false, number = "1") }
}

@Composable
@Preview(showSystemUi = true)
fun AddQuestionCardPreview() {
    AddQuestionCard()
}