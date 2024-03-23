package com.example.quizme.composable.navigation.quizzes.editQuiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quizme.R
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.MainViewModel
import com.example.quizme.viewModels.forQuizzes.EditQuestionViewModel
import com.example.quizme.viewModels.forQuizzes.QuestionDetails
import com.example.quizme.viewModels.forQuizzes.QuestionUiState


@Composable
fun EditQuestion(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel,
    editQuestionViewModel: EditQuestionViewModel = viewModel(factory = FactoryViewModelProvider.Factory),
) {
    val showSnackBar = editQuestionViewModel.showSnackBar.observeAsState().value
    val questionUiState = editQuestionViewModel.questionUiState.observeAsState().value
    val latestQuizName = mainViewModel.latestQuizName.collectAsState().value
    if (showSnackBar != null && questionUiState != null)
        TextSnackBarContainer(
            modifier = modifier,
            snackBarMessage = stringResource(R.string.saved_correctly),
            showSnackBar = showSnackBar,
            onDismissSnackBar = { editQuestionViewModel.dismissSnackBar() }
        ) {
            EditQuestionLayout(
                questionUiState = questionUiState,
                onValueChange = { questionDetails ->
                    editQuestionViewModel.updateInput(questionDetails)
                },
                onSaveClick = { editQuestionViewModel.updateOrInsertQuestion(latestQuizName) }
            )
        }
}


@Composable
fun EditQuestionLayout(
    modifier: Modifier = Modifier,
    questionUiState: QuestionUiState,
    onValueChange: (QuestionDetails) -> Unit,
    onSaveClick: () -> Unit,
) {

    Column(
        modifier = modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp),
    ) {

        OutlinedTextField(
            value = questionUiState.questionDetails.question,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            label = { Text(text = stringResource(R.string.Question)) },
            onValueChange = { onValueChange(questionUiState.questionDetails.copy(question = it)) },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                unfocusedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Row {
            Checkbox(
                checked = 1 == questionUiState.questionDetails.correctAnswer,
                onCheckedChange = { onValueChange(questionUiState.questionDetails.copy(correctAnswer = 1)) }
            )
            OutlinedTextField(
                value = questionUiState.questionDetails.answer1,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                label = { Text(text = stringResource(R.string.Answer1)) },
                onValueChange = { onValueChange(questionUiState.questionDetails.copy(answer1 = it)) },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }

        Row {
            Checkbox(
                checked = 2 == questionUiState.questionDetails.correctAnswer,
                onCheckedChange = { onValueChange(questionUiState.questionDetails.copy(correctAnswer = 2)) }
            )
            OutlinedTextField(
                value = questionUiState.questionDetails.answer2,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                label = { Text(text = stringResource(R.string.Answer2)) },
                onValueChange = { onValueChange(questionUiState.questionDetails.copy(answer2 = it)) },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row {
            Checkbox(
                checked = 3 == questionUiState.questionDetails.correctAnswer,
                onCheckedChange = { onValueChange(questionUiState.questionDetails.copy(correctAnswer = 3)) }
            )
            OutlinedTextField(
                value = questionUiState.questionDetails.answer3,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                label = { Text(text = stringResource(R.string.Answer3)) },
                onValueChange = { onValueChange(questionUiState.questionDetails.copy(answer3 = it)) },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                    disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
        Button(
            onClick = onSaveClick,
            enabled = questionUiState.isInputValid,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(R.string.save_action))
        }
        
    }
}

@Composable
fun impputForm() {

}

@Composable
fun TextSnackBarContainer(
    modifier: Modifier = Modifier,
    snackBarMessage: String,
    snackBarHostState: SnackbarHostState = remember { SnackbarHostState() },
    showSnackBar: Boolean,
    onDismissSnackBar: () -> Unit,
    content: @Composable () -> Unit,
) {

    Box(modifier.fillMaxHeight()) {
        content()

        val onDismissState by rememberUpdatedState(onDismissSnackBar)
        LaunchedEffect(showSnackBar, snackBarMessage) {
            if (showSnackBar)
                try {
                    snackBarHostState.showSnackbar(
                        message = snackBarMessage,
                        withDismissAction = true,
                        duration = SnackbarDuration.Short
                    )
                } finally {
                    onDismissState()
                }
        }

        MaterialTheme(shapes = Shapes()) {
            SnackbarHost(
                hostState = snackBarHostState,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
            ) {
                Snackbar(it)
            }
        }
    }
}

