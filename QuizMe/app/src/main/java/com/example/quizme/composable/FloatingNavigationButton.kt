package com.example.quizme.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizme.composable.navigation.NavigationList
import com.example.quizme.composable.navigation.quizzes.AddAQuestionAlertDialog
import com.example.quizme.composable.navigation.quizzes.ConfirmEditAlertDialog
import com.example.quizme.composable.navigation.quizzes.DeleteAlertDialog
import com.example.quizme.composable.navigation.quizzes.EditAlertDialog
import com.example.quizme.composable.navigation.rules.EditQuizDestination
import com.example.quizme.composable.navigation.rules.ListOfQuestionsDestination
import com.example.quizme.viewModels.MainViewModel

@Composable
fun FloatingNavigationButton(
    mainViewModel: MainViewModel,
    navController: NavController,
    inSelectionMode: Boolean,
    currentRoute: List<String>,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        when {
            // Questions main
            currentRoute.contains(NavigationList.main.component1().name) ->
                FloatingButtonForQuestions(
                    mainViewModel = mainViewModel,
                    navController = navController
                )

            currentRoute.contains("EditQuiz") && currentRoute.count() == 2 -> FloatingButtonsForEditQuiz(
                mainViewModel = mainViewModel,
                navController = navController,
                inSelectionMode = inSelectionMode
            )
        }
    }
}

// edit button
@Composable
fun FloatingButtonForQuestions(
    mainViewModel: MainViewModel,
    navController: NavController,
) {
    val latestName by mainViewModel.latestQuizName.collectAsState()
    var editAlertDialog by rememberSaveable { mutableStateOf(false) }

    if (editAlertDialog) {

        val allQuestions = mainViewModel.allQuestions.observeAsState().value ?: emptySet()
        val allQuestionsCorrect =
            allQuestions.size == allQuestions.filter { it.resolved }.size


        EditAlertDialog(
            allQuestionsCorrect = allQuestionsCorrect,
            name = latestName,
            onConfirmButton = {
                val route = "${EditQuizDestination.route}/${latestName}"
                mainViewModel.changeMainRoute(route)
                navController.navigate(route)

                mainViewModel.calculateAllQuestionsFromSomeone(latestName)
                editAlertDialog = !editAlertDialog
            },
            onDismissRequest = { editAlertDialog = !editAlertDialog }
        )
    }

    FloatingActionButton(onClick = {
        mainViewModel.calculateAllQuestionsFromSomeone(latestName)
        editAlertDialog = !editAlertDialog
    }) {
        Icon(
            imageVector = Icons.Default.Edit,
            contentDescription = null
        )
    }
}


//  delete, select/unselect all and confirm button
@Composable
fun FloatingButtonsForEditQuiz(
    mainViewModel: MainViewModel,
    navController: NavController,
    inSelectionMode: Boolean,
) {
    val latestName by mainViewModel.latestQuizName.collectAsState()
    val thereAreQuestions = mainViewModel.allQuestions.observeAsState().value?.isNotEmpty() ?: false
    var confirmEditAlertDialog by remember {
        mutableStateOf(false)
    }

    var confirmDeleteQuestion by remember {
        mutableStateOf(false)
    }

    var addAQuestionAlertDialog by remember {
        mutableStateOf(false)
    }

    when {
        confirmEditAlertDialog -> ConfirmEditAlertDialog(
            atLeastOneQuestion = thereAreQuestions,
            onConfirmDeleteQuiz = {
                val route = "${ListOfQuestionsDestination.route}/${latestName}"

                mainViewModel.deleteAQuiz(latestName)
                mainViewModel.changeMainRoute(route)
                navController.navigate(route)
            },
            onConfirmEditQuiz = {
                val route = "${ListOfQuestionsDestination.route}/${latestName}"

                mainViewModel.changeMainRoute(route)
                mainViewModel.clear() // deselect all questions
                navController.navigate(route = route)
            },
            onDismissRequest = { confirmEditAlertDialog = !confirmEditAlertDialog }
        )

        confirmDeleteQuestion -> DeleteAlertDialog(
            name = latestName,
            onConfirmButton = {
                mainViewModel.deleteQuestions()
                confirmDeleteQuestion = !confirmDeleteQuestion
            },
            onDismissRequest = { confirmDeleteQuestion = !confirmDeleteQuestion }
        )

        addAQuestionAlertDialog -> AddAQuestionAlertDialog(
            onDismissRequest = { addAQuestionAlertDialog = !addAQuestionAlertDialog }
        )
    }


    if (inSelectionMode) {
        // delete button
        FloatingActionButton(
            onClick = {
                confirmDeleteQuestion = !confirmDeleteQuestion
            }
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = null
            )
        }
        // unselect all button
        FloatingActionButton(
            onClick = {
                mainViewModel.clear()
            }
        ) {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = null
            )
        }
    } else {
        // select all button
        FloatingActionButton(
            onClick = {
                if(thereAreQuestions) mainViewModel.selectAll()
                else addAQuestionAlertDialog = !addAQuestionAlertDialog
            }
        ) {
            Icon(
                imageVector = Icons.Filled.CheckCircle,
                contentDescription = null
            )
        }
    }

    // confirm button
    FloatingActionButton(
        onClick = {
            confirmEditAlertDialog = !confirmEditAlertDialog
        }
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null
        )
    }
}