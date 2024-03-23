package com.example.quizme.composable.navigation.question

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.quizme.viewModels.forQuestions.ListViewModel


@Composable
fun ListOfQuestionsLayout(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel,
    navController: NavController,
    viewModel: ListViewModel = viewModel(factory = FactoryViewModelProvider.Factory),
    onClickQuestion :(Int, String, List<Question>) -> Unit,
) {
    val listOfQuestions by viewModel.allQuestionsFromSomeone.collectAsState()
    val data by viewModel.latestQuizName.collectAsState()

    when (val result = listOfQuestions) {
        is ChargingState.Loading -> LoadingScreen(modifier)
        is ChargingState.Error -> ErrorScreen {
            val route = NavigationList.main.component2().name
            mainViewModel.changeMainRoute(route)
            navController.navigate(route)
        }

        is ChargingState.Correct ->
            levels(
                modifier = modifier,
                data = data,
                list = result.personToQuestions.questions,
                onClickLevel = onClickQuestion
            )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun levels(
    modifier: Modifier = Modifier,
    data: String,
    list: List<Question>,
    onClickLevel: (Int, String, List<Question>) -> Unit,
) {

    val colorLevel: @Composable (Boolean, Int) -> CardColors = { resolved, attemptsLeft ->
        CardDefaults.cardColors(
            containerColor =
            if (resolved) Color.Green
            else if (attemptsLeft == 0) Color.Red
            else MaterialTheme.colorScheme.primaryContainer
        )
    }

    // next level to be completed by user
    val levelAvailable = list.firstOrNull {
        !it.resolved && it.attemptsLeft > 0
    }

    val indexOfLevelAvailable =
        list.indexOf(levelAvailable) // returns -1 when completing all levels

    Text(text = "$indexOfLevelAvailable")
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(100.dp),
    ) {
        itemsIndexed(list) { index, item ->
            Card(
                onClick = { onClickLevel(item.questionId, item.personId, list) },
                colors = if (index <= indexOfLevelAvailable || indexOfLevelAvailable == -1) // this colors the levels unavailable
                    colorLevel(item.resolved, item.attemptsLeft)
                else CardDefaults.cardColors(containerColor = Color.Gray)
            ) {
                Text(text = "question ${index + 1}")
            }
        }

        item {
            Text(text = data)
        }
    }

}