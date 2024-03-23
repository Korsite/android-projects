package com.example.quizme.composable.navigation.quizzes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizme.R
import com.example.quizme.data.Person
import com.example.quizme.data.PersonQuestions
import com.example.quizme.data.Question
import com.example.quizme.viewModels.forQuizzes.AlertDialogUiState
import com.example.quizme.viewModels.forQuizzes.NewQuizUiState
import com.example.quizme.viewModels.forQuizzes.QuizzesViewModel

@Composable
fun WhichAlertDialogToDisplay(
    personToQuestions: PersonQuestions,
    quizzesViewModel: QuizzesViewModel,
    numberOfCorrectQuestions: Int,
    listOfQuizzesName: List<String>,
    onEditConfirm: (String, List<Question>) -> Unit,
) {
    val controlDisplayAlertDialog =
        quizzesViewModel.alterDialogUiState.observeAsState().value ?: AlertDialogUiState()
    val onDismissRequest = { quizzesViewModel.dismissAlertDialogs() }
    val numberOfQuestions = personToQuestions.questions.count()
    val firstName = personToQuestions.person.completeName.split(" ")[0]
    when {
        controlDisplayAlertDialog.displayResetAlertDialog -> ResetAlertDialog(
            name = firstName,
            onConfirmButton = {
                quizzesViewModel.resetAllQuestionFromSomeone(personToQuestions.questions)
                onDismissRequest()
            },
            onDismissRequest = onDismissRequest
        )

        controlDisplayAlertDialog.displayDeleteAlertDialog ->
            DeleteAlertDialog(
                name = firstName,
                onConfirmButton = {
                    quizzesViewModel.deleteAQuiz(
                        personToQuestions.questions,
                        personToQuestions.person
                    )
                },
                onDismissRequest = onDismissRequest
            )

        controlDisplayAlertDialog.displayEditAlertDialog ->
            EditAlertDialog(
                allQuestionsCorrect = numberOfQuestions == numberOfCorrectQuestions,
                name = firstName,
                onConfirmButton = {
                    onDismissRequest()
                    quizzesViewModel.saveLatestQuizName(personToQuestions.person.completeName)
                    onEditConfirm(
                        personToQuestions.person.completeName,
                        personToQuestions.questions
                    )
                },
                onDismissRequest = onDismissRequest
            )

        controlDisplayAlertDialog.displayAddNewQuizAlertDialog -> {
            val newQuizUiState =
                quizzesViewModel.newQuizUiState.observeAsState().value ?: NewQuizUiState()


            AddNewQuizAlertDialog(
                newQuizUiState = newQuizUiState,
                listOfQuizzesName = listOfQuizzesName,
                onConfirmDataButton = { nameWithoutSpaces ->
                    val newPerson = Person(
                        completeName = newQuizUiState.newName,
                        age = newQuizUiState.age
                    )

                    quizzesViewModel.updateInput(
                        newQuizUiState.copy(newName = nameWithoutSpaces)
                    )
                    quizzesViewModel.changeLatestQuizTapped(
                        PersonQuestions(
                            newPerson,
                            emptyList()
                        )
                    ) // useful to alert dialogs

                },
                onConfirmQuizButton = {
                    val newPerson = Person(
                        completeName = newQuizUiState.newName,
                        age = newQuizUiState.age
                    )
                    quizzesViewModel.insertAQuiz(newPerson)
                    quizzesViewModel.saveLatestQuizName(personToQuestions.person.completeName)
                    onEditConfirm(
                        personToQuestions.person.completeName,
                        personToQuestions.questions
                    )
                },
                onValueChange = { quizzesViewModel.updateInput(it) },
                onDismissRequest = {
                    quizzesViewModel.updateInput(NewQuizUiState())
                    onDismissRequest()
                }
            )
        }
    }
}

@Composable
fun DeleteAlertDialog(
    name: String,
    onConfirmButton: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    var confirmAlertDeleteDialog by rememberSaveable {
        mutableStateOf(false)
    }
    if (confirmAlertDeleteDialog)
        ConfirmAlertDialog(
            resourceText = stringResource(R.string.confirmDeleteQuizText),
            onConfirmButton = onConfirmButton,
            onDismissRequest = onDismissRequest
        )
    else
        AlertDialog(
            onDismissRequest = onDismissRequest,
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = stringResource(R.string.cancel))
                }
            },
            confirmButton = {
                TextButton(onClick = { confirmAlertDeleteDialog = !confirmAlertDeleteDialog }) {
                    Text(text = stringResource(R.string.confirm))
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Delete,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
            },
            title = { Text(text = stringResource(R.string.titleDeleteQuiz)) },
            text = { Text(text = stringResource(R.string.deleteQuizText, name)) }
        )
}

@Composable
fun ConfirmAlertDialog(
    resourceText: String,
    onConfirmButton: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    var type by rememberSaveable {
        mutableStateOf("")
    }
    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmButton()
                    onDismissRequest()
                }, enabled = type == "Confirm"
            ) {
                Text(text = stringResource(R.string.confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismissRequest) {
                Text(text = stringResource(R.string.cancel))
            }
        },
        title = {
            Text(text = stringResource(R.string.confirmDeleteQuizTitle))
        },
        icon = {
            Icon(
                imageVector = Icons.Outlined.Warning,
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
        },
        text = {
            Column {
                Text(text = resourceText)
                OutlinedTextField(
                    value = type,
                    onValueChange = { type = it },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                )
            }
        }
    )
}

@Composable
fun EditAlertDialog(
    allQuestionsCorrect: Boolean,
    name: String,
    onConfirmButton: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    if (allQuestionsCorrect)
        AlertDialog(
            onDismissRequest = onDismissRequest,
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = stringResource(R.string.cancel))
                }
            },
            confirmButton = {
                TextButton(onClick = onConfirmButton) {
                    Text(text = stringResource(R.string.confirm))
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
            },
            title = { Text(text = stringResource(R.string.titleEditQuiz)) },
            text = { Text(text = stringResource(R.string.editQuizText, name)) }
        )
    else
        AlertDialog(
            onDismissRequest = onDismissRequest,
            confirmButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = stringResource(R.string.confirm))
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Warning,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
            },
            title = { Text(text = stringResource(R.string.notEditQuizTitle)) },
            text = { Text(text = stringResource(R.string.notEditQuizText)) }
        )
}

@Composable
fun ResetAlertDialog(
    name: String,
    onConfirmButton: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        dismissButton = {
            TextButton(onClick = onDismissRequest) {
                Text(text = stringResource(R.string.cancel))
            }
        },
        confirmButton = {
            TextButton(onClick = onConfirmButton) {
                Text(text = stringResource(R.string.confirm))
            }
        },
        icon = {
            Icon(
                imageVector = Icons.Outlined.Refresh,
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
        },
        title = { Text(text = stringResource(R.string.titleResetQuiz)) },
        text = { Text(text = stringResource(R.string.resetQuizText, name)) }
    )
}

/**
 * Displays an alert dialog to either confirm the changes made to the quiz
 * or to make the user add a questions as minimum to the quiz thus
 * preventing the user from saving a quiz without any question
 */
@Composable
fun ConfirmEditAlertDialog(
    atLeastOneQuestion: Boolean,
    onConfirmDeleteQuiz: () -> Unit,
    onConfirmEditQuiz: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    var confirmDeleteQuiz by rememberSaveable {
        mutableStateOf(false)
    }
    if (atLeastOneQuestion)
        AlertDialog(
            onDismissRequest = onDismissRequest,
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = stringResource(R.string.cancel))
                }
            },
            confirmButton = {
                TextButton(onClick = onConfirmEditQuiz) {
                    Text(text = stringResource(R.string.confirm))
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null
                )
            },
            text = { Text(text = stringResource(R.string.confirmChanges)) }
        )
    else if (confirmDeleteQuiz)
        ConfirmAlertDialog(
            resourceText = stringResource(R.string.confirmDeleteQuizText),
            onConfirmButton = onConfirmDeleteQuiz,
            onDismissRequest = onDismissRequest
        )
    else
    // if the user tries to delete a quiz without any question
        AlertDialog(
            onDismissRequest = onDismissRequest,
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Outlined.Add, contentDescription = null)
                        Text(text = stringResource(R.string.continueEditing))
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { confirmDeleteQuiz = !confirmDeleteQuiz }) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Outlined.Delete, contentDescription = null)
                        Text(text = stringResource(R.string.deleteQuiz))
                    }
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null
                )
            },
            text = { Text(text = stringResource(R.string.oneQuestionRequired)) }
        )

}

/**
 * @param onConfirmDataButton: function to be called when the user confirms the data
 * @param onConfirmQuizButton: function that actually creates the new quiz in the DB
 */
@Composable
fun AddNewQuizAlertDialog(
    newQuizUiState: NewQuizUiState,
    listOfQuizzesName: List<String>,
    onConfirmDataButton: (String) -> Unit,
    onConfirmQuizButton: () -> Unit,
    onValueChange: (NewQuizUiState) -> Unit,
    onDismissRequest: () -> Unit,
) {
    var confirmAddANewQuiz by rememberSaveable {
        mutableStateOf(false)
    }
    if (confirmAddANewQuiz)
        ConfirmAlertDialog(
            resourceText = stringResource(
                R.string.confirmAddANewQuiz,
                newQuizUiState.newName,
                newQuizUiState.age,
                if (newQuizUiState.age == 1) "year" else "years"
            ),
            onConfirmButton = {
                onDismissRequest()
                onConfirmQuizButton()
            },
            onDismissRequest = onDismissRequest
        )
    else
        AlertDialog(
            onDismissRequest = onDismissRequest,
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = stringResource(R.string.cancel))
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onConfirmDataButton(newQuizUiState.newName.trim())
                        confirmAddANewQuiz = !confirmAddANewQuiz
                    },
                    enabled = newQuizUiState.nameIsValid && newQuizUiState.validAgeInput && !newQuizUiState.quizRepeated && !newQuizUiState.nameIsLong
                ) {
                    Text(text = stringResource(R.string.confirm))
                }

            },
            text = {
                Column {
                    Text(text = stringResource(R.string.writeAQuizName))
                    OutlinedTextField(
                        value = newQuizUiState.newName,
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                        label = { Text(text = stringResource(R.string.name)) },
                        onValueChange = { onValueChange(newQuizUiState.copy(newName = it)) },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                            unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                            disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    OutlinedTextField(
                        value = newQuizUiState.age.toString(),
                        keyboardOptions = KeyboardOptions(
                            imeAction = ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        label = { Text(text = stringResource(R.string.age)) },
                        onValueChange = {
                            onValueChange(
                                newQuizUiState.copy(
                                    age = it.toIntOrNull() ?: 0
                                )
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                            unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                            disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    when {
                        newQuizUiState.quizRepeated -> {
                            val quizRepeated = listOfQuizzesName
                                .find {
                                    it.equals(
                                        newQuizUiState.newName.trim(),
                                        ignoreCase = true
                                    )
                                }
                                ?: newQuizUiState.newName

                            Text(
                                text = stringResource(
                                    R.string.quizzNameAlreadyExists,
                                    quizRepeated
                                ), color = Color.Red
                            )
                        }

                        !newQuizUiState.validAgeInput -> Text(
                            text = stringResource(R.string.ageNotAccepted),
                            color = Color.Red
                        )

                        newQuizUiState.nameIsLong -> Text(
                            text = stringResource(R.string.nameIsTooLong),
                            color = Color.Red
                        )

                        !newQuizUiState.nameIsValid -> Text(text = stringResource(R.string.nameNotValid))
                    }
                }
            },
            title = {
                Text(
                    text = stringResource(R.string.addANewQuiz),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        )
}

@Composable
fun AddAQuestionAlertDialog(
    onDismissRequest: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(onClick = onDismissRequest) {
                Text(text = stringResource(R.string.confirm))
            }
        },
        icon = { Icon(imageVector = Icons.Outlined.Warning, contentDescription = null) },
        title = { Text(text = stringResource(R.string.attention)) },
        text = { Text(text = stringResource(R.string.needAQuestion)) })

}

@Composable
@Preview
fun DeleteAlertDialogPreview() {
    DeleteAlertDialog(
        name = "Gandhi",
        onConfirmButton = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun ConfirmAlertDialogPreview1() {
    val context = LocalContext.current
    ConfirmAlertDialog(
        resourceText = context.getString(R.string.confirmDeleteQuizText),
        onConfirmButton = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun ConfirmAlertDialogPreview2() {
    val mockQuiz = LocalContext.current.getString(
        R.string.confirmAddANewQuiz,
        "Gandhi Soto Sanchez",
        19,
        "years"
    )
    ConfirmAlertDialog(
        resourceText = mockQuiz,
        onConfirmButton = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun EditAlertDialogPreview1() {
    EditAlertDialog(
        allQuestionsCorrect = true,
        name = "Gandhi",
        onConfirmButton = {},
        onDismissRequest = {}
    )
}


@Composable
@Preview
fun EditAlertDialogPreview2() {
    EditAlertDialog(
        allQuestionsCorrect = false,
        name = "Gandhi",
        onConfirmButton = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun ResetAlertDialogPreview() {
    ResetAlertDialog(
        name = "Gandhi",
        onConfirmButton = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun ConfirmEditAlertDialogPreview1() {
    ConfirmEditAlertDialog(
        atLeastOneQuestion = true,
        onConfirmDeleteQuiz = {},
        onConfirmEditQuiz = {},
        onDismissRequest = {},
    )
}

@Composable
@Preview
fun ConfirmEditAlertDialogPreview2() {
    ConfirmEditAlertDialog(
        atLeastOneQuestion = false,
        onConfirmDeleteQuiz = {},
        onConfirmEditQuiz = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun AddNewQuizAlertDialogPreview1() {
    val mockHappyData =
        NewQuizUiState(newName = "Gandhi Soto Sanchez", age = 19, nameIsValid = true)
    AddNewQuizAlertDialog(
        newQuizUiState = mockHappyData,
        listOfQuizzesName = emptyList(),
        onConfirmDataButton = {},
        onConfirmQuizButton = {},
        onValueChange = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun AddNewQuizAlertDialogPreview2() {
    val mockUnHappyData =
        NewQuizUiState(newName = "lol I am troll!!", age = 19, nameIsValid = false)
    AddNewQuizAlertDialog(
        newQuizUiState = mockUnHappyData,
        listOfQuizzesName = emptyList(),
        onConfirmDataButton = {},
        onConfirmQuizButton = {},
        onValueChange = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun AddNewQuizAlertDialogPreview3() {
    val mockUnHappyData =
        NewQuizUiState(newName = "Gandhi Soto Sanchez", age = 200, validAgeInput = false)
    AddNewQuizAlertDialog(
        newQuizUiState = mockUnHappyData,
        listOfQuizzesName = emptyList(),
        onConfirmDataButton = {},
        onConfirmQuizButton = {},
        onValueChange = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview
fun AddNewQuizAlertDialogPreview4() {
    val mockUnHappyData = NewQuizUiState(
        newName = "This is a loooooooooooooooong nameeeee",
        age = 19,
        nameIsLong = true
    )
    AddNewQuizAlertDialog(
        newQuizUiState = mockUnHappyData,
        listOfQuizzesName = emptyList(),
        onConfirmDataButton = {},
        onConfirmQuizButton = {},
        onValueChange = {},
        onDismissRequest = {}
    )
}
