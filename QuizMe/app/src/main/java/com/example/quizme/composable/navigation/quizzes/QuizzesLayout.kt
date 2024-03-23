package com.example.quizme.composable.navigation.quizzes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.quizme.R
import com.example.quizme.composable.navigation.NavigationList
import com.example.quizme.composable.screenState.ChargingState
import com.example.quizme.composable.screenState.ErrorScreen
import com.example.quizme.composable.screenState.LoadingScreen
import com.example.quizme.data.Person
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.Question
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.forQuizzes.AlertDialogUiState
import com.example.quizme.viewModels.forQuizzes.QuizzesViewModel

@Composable
fun QuizzesLayout(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    onEditConfirm: (String, List<Question>) -> Unit,
    onQuizClick: (String, List<Question>) -> Unit,
) {
    val quizzesViewModel: QuizzesViewModel = viewModel(factory = FactoryViewModelProvider.Factory)
    val listOfQuizzes by quizzesViewModel.allQuizzes.collectAsState()

    when (val result = listOfQuizzes) {
        is ChargingState.Loading -> LoadingScreen(modifier)
        is ChargingState.Error -> ErrorScreen {
            navController.navigate(
                NavigationList.main.component1().name
            )
        }

        is ChargingState.Correct ->
            QuizzesLazyColumn(
                modifier = modifier,
                listOfQuizzes = result.listOfPersonToQuestions,
                quizzesViewModel = quizzesViewModel,
                onEditConfirm = onEditConfirm,
                onQuizClick = onQuizClick
            )
    }
}

@Composable
fun QuizzesLazyColumn(
    modifier: Modifier = Modifier,
    listOfQuizzes: List<PersonQuestions>,
    quizzesViewModel: QuizzesViewModel,
    onEditConfirm: (String, List<Question>) -> Unit,
    onQuizClick: (String, List<Question>) -> Unit,
) {
    val latestQuizTapped = quizzesViewModel.quizTapped.observeAsState().value ?: PersonQuestions(
        person = Person(
            completeName = "No one",
            age = 0,
        ),
        questions = emptyList()
    )

    LazyVerticalGrid(
        modifier = modifier.padding(start = 10.dp, end = 10.dp),
        columns = GridCells.Adaptive(400.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp),
    ) {
        // TODO fix horizontal view in this item
        item {
            TextButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    quizzesViewModel.updateAlertDialog(
                        AlertDialogUiState(
                            displayAddNewQuizAlertDialog = true
                        )
                    )
                },
                colors = ButtonDefaults.buttonColors()
            ) {
                Text(text = stringResource(R.string.addANewQuiz))
            }
        }

        items(listOfQuizzes) { quiz ->
            Quiz(
                personToQuestions = quiz,
                quizzesViewModel = quizzesViewModel,
                onQuizClick = onQuizClick
            )
        }
    }

    WhichAlertDialogToDisplay(
        personToQuestions = latestQuizTapped,
        quizzesViewModel = quizzesViewModel,
        numberOfCorrectQuestions = latestQuizTapped.questions.count { it.resolved },
        listOfQuizzesName = listOfQuizzes.map { it.person.completeName },
        onEditConfirm = onEditConfirm
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Quiz(
    modifier: Modifier = Modifier,
    personToQuestions: PersonQuestions,
    quizzesViewModel: QuizzesViewModel,
    onQuizClick: (String, List<Question>) -> Unit,
) {

    val numberOfCorrectQuestions = personToQuestions.questions.count { it.resolved }
    val numberOfIncorrectQuestions = personToQuestions.questions.count { it.attemptsLeft == 0 }

    Card(
        onClick = {
            onQuizClick(
                personToQuestions.person.completeName,
                personToQuestions.questions
            )
            quizzesViewModel.saveLatestQuizName(personToQuestions.person.completeName)
        }
    ) {
        Box(modifier = Modifier.padding(20.dp)) {

            // todo fix this when user clicks to edit a quiz

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.userimage),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(80.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = personToQuestions.person.completeName,
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            text = "I have ${personToQuestions.questions.size} questions",
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Column {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(imageVector = Icons.Filled.Check, contentDescription = null)
                            Text(
                                text = "$numberOfCorrectQuestions",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(imageVector = Icons.Filled.Close, contentDescription = null)
                            Text(
                                text = "$numberOfIncorrectQuestions",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    FloatingActionButton(
                        modifier = modifier.size(50.dp),
                        onClick = {
                            quizzesViewModel.changeLatestQuizTapped(personToQuestions) // useful to alert dialogs
                            quizzesViewModel.updateAlertDialog(
                                AlertDialogUiState(
                                    displayResetAlertDialog = true
                                )
                            )
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Refresh,
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    FloatingActionButton(
                        modifier = modifier.size(50.dp),
                        onClick = {
                            quizzesViewModel.changeLatestQuizTapped(personToQuestions) // useful to alert dialogs
                            quizzesViewModel.updateAlertDialog(
                                AlertDialogUiState(
                                    displayEditAlertDialog = true
                                )
                            )
                        }) {
                        Icon(
                            imageVector = Icons.Outlined.Edit,
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    FloatingActionButton(
                        modifier = modifier.size(50.dp),
                        onClick = {
                            quizzesViewModel.changeLatestQuizTapped(personToQuestions) // useful to alert dialogs
                            quizzesViewModel.updateAlertDialog(
                                AlertDialogUiState(
                                    displayDeleteAlertDialog = true
                                )
                            )
                        }) {
                        Icon(
                            imageVector = Icons.Outlined.Delete,
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                }
            }
        }
    }
}
