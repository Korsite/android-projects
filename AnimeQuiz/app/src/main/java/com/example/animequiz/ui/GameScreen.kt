package com.example.animequiz.ui

import android.app.Activity
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.animequiz.Difficulty
import com.example.animequiz.R
import com.example.animequiz.data.MINIMUM_POINTS_REACH_DIFFICULT
import com.example.animequiz.data.MINIMUM_POINTS_REACH_MEDIUM
import com.example.animequiz.data.MINIMUM_POINTS_WIN_GAME
import com.example.animequiz.ui.theme.AnimeQuizTheme
import com.example.animequiz.ui.theme.Shapes


@Preview(showSystemUi = true)
@Composable
fun AnimeQuizLayoutPreviewDarkMode() {
    AnimeQuizTheme {
        AnimeQuizScreen(
            gameViewModel = viewModel(),
            gameUiState = GameUiState(
                currentPicture = R.drawable.kokushibo,

                hint1 = R.string.kokushibo_hint_1,
                hint2 = R.string.kokushibo_hint_2,
                hint3 = R.string.kokushibo_hint_3
            ),
            onClickNextLevel = {},
            currentScreen = Difficulty.EASY
        )
    }
}

@Composable
fun AnimeQuizScreen(
    gameViewModel: GameViewModel,
    gameUiState: GameUiState,
    onClickNextLevel: () -> Unit,
    currentScreen: Difficulty,
    modifier: Modifier = Modifier,

    ) {
    val activity = LocalContext.current
    val previousCharacterMessage = Toast.makeText(
        activity,
        stringResource(R.string.previous_character_message, gameViewModel.currentAnswer),
        Toast.LENGTH_SHORT
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.verticalScroll(
            rememberScrollState()
        )
    ) {

        AnimeQuizLayout(
            picturesShowed = gameUiState.picturesShowed,
            currentPicture = gameUiState.currentPicture,
            CheckWord = gameViewModel.userCheckWord,
            onValueChanged = { gameViewModel.updateUserWordCheck(it) },
            wordIsWrong = gameUiState.wordIsWrong,
            onDoneFunction = { gameViewModel.checkUserWord() },
            visibleAnimation = gameViewModel.showHints,
            name_shuffled = gameUiState.answered_shuffled,
            hint1 = gameUiState.hint1,
            hint2 = gameUiState.hint2,
            hint3 = gameUiState.hint3,
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_30))
        )

        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_20)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Button(
                onClick = { gameViewModel.checkUserWord() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.submit))
            }

            OutlinedButton(
                onClick = {
                    gameViewModel.skipPicture()
                    previousCharacterMessage.show()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.skip))
            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = colorScheme.secondaryContainer
                )
            ) {
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PointStatus(
                        gameUiState.totalScore,
                    )

                    ClickMeHintsButton(
                        onShowHints = {
                            gameViewModel.findHints()
                            gameViewModel.showHints()
                        }
                    )
                }
            }
        }


    }

    if (gameUiState.gameIsOver) {
        AnimeAlertDialog(
            messageEitherSucceedOrFailed = gameUiState.messageEitherSucceedOrFailed,
            gameUiState = gameUiState,
            onClickConfirm = { gameViewModel.resetGame() },
            onClickOutOfConfirm = { gameViewModel.resetGame() },
            onClickNextLevel = onClickNextLevel,
            currentScreen = currentScreen
        )
    }

}

@Composable
fun AnimeQuizLayout(
    picturesShowed: Int,
    currentPicture: Int,
    CheckWord: String,
    onValueChanged: (String) -> Unit,
    wordIsWrong: Boolean,
    onDoneFunction: () -> Unit,
    visibleAnimation: Boolean,
    name_shuffled: String,
    @StringRes hint1: Int,
    @StringRes hint2: Int,
    @StringRes hint3: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding(
            start = 35.dp,
            end = 35.dp
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = modifier
                .animateContentSize(
                    spring(
                        stiffness = 2000f
                    )
                )

        ) {
            PrincipalLayout(
                picturesShowed = picturesShowed,
                currentPicture = currentPicture,
                CheckWord = CheckWord,
                onValueChanged = onValueChanged,
                wordIsWrong = wordIsWrong,
                onDoneFunction = onDoneFunction,
                visibleAnimation = visibleAnimation,
                name_shuffled = name_shuffled,
                hint1 = hint1,
                hint2 = hint2,
                hint3 = hint3,
            )
        }
    }
}

@Composable
fun PrincipalLayout(
    picturesShowed: Int,
    currentPicture: Int,
    CheckWord: String,
    onValueChanged: (String) -> Unit,
    wordIsWrong: Boolean,
    onDoneFunction: () -> Unit,
    visibleAnimation: Boolean,
    name_shuffled: String,
    @StringRes hint1: Int,
    @StringRes hint2: Int,
    @StringRes hint3: Int,
) {

    CountPicture(picturesShowed = picturesShowed)

    AnimePicture(picture = currentPicture)

    AnimeInstructions()

    AnimeFieldToWrite(
        userCheckWord = CheckWord,
        onValueChanged = onValueChanged,
        wordIsWrong = wordIsWrong,
        onDoneFunction = onDoneFunction,
    )

    AnimatedVisibility(
        visible = visibleAnimation,
        enter = expandVertically(),
        exit = shrinkVertically(),
    ) {
        HintsOfPicture(
            hint1 = hint1,
            hint2 = hint2,
            hint3 = hint3,
            name_shuffled = name_shuffled
        )
    }

}


@Composable
fun HintsOfPicture(
    @StringRes hint1: Int,
    hint2: Int,
    hint3: Int,
    name_shuffled: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(
            text = stringResource(R.string.appears_in) + " " + stringResource(hint1) + " name shuffled is \"$name_shuffled\"",
            modifier = Modifier.align(Alignment.Start)
        )

        Text(
            text = stringResource(hint2),
            modifier = Modifier.align(Alignment.Start)
        )

        Text(
            text = stringResource(hint3),
            modifier = Modifier.align(Alignment.Start)
        )

    }
}

@Composable
fun CountPicture(
    picturesShowed: Int
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorScheme.primary
        )
    ) {
        Text(
            text = stringResource(R.string.picture_count, picturesShowed),
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_10))
        )
    }
}

@Composable
fun AnimePicture(
    @DrawableRes picture: Int,
) {
    Image(
        painter = painterResource(picture),
        modifier = Modifier
            .height(200.dp)
            .width(250.dp)
            .clip(Shapes.medium),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
fun AnimeInstructions() {
    Text(
        text = stringResource(R.string.instructions),
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeFieldToWrite(
    userCheckWord: String,
    onValueChanged: (String) -> Unit,
    wordIsWrong: Boolean,
    onDoneFunction: () -> Unit,
) {

    OutlinedTextField(
        value = userCheckWord,
        onValueChange = onValueChanged,
        label = { Text(text = stringResource(R.string.enter_name)) },
        placeholder = { Text(text = stringResource(R.string.hit_a_hint)) },
        leadingIcon = { Icon(imageVector = Icons.Rounded.Person, contentDescription = null) },
        isError = wordIsWrong,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { onDoneFunction() }
        ),
        singleLine = true,
        shape = shapes.large,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = colorScheme.onPrimary
        )
    )
}


@Composable
fun PointStatus(
    totalScore: Int,
) {
    Text(
        text = stringResource(R.string.points_count, totalScore),
        modifier = Modifier.padding(dimensionResource(R.dimen.padding_10))
    )

}

@Composable
fun ClickMeHintsButton(
    onShowHints: () -> Unit,
) {
    OutlinedButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = onShowHints,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorScheme.inversePrimary
        )
    ) {
        Text(text = stringResource(R.string.click_me_hints_info))
    }
}

@Composable
fun AnimeAlertDialog(
    @StringRes messageEitherSucceedOrFailed: Int,
    gameUiState: GameUiState,
    onClickConfirm: () -> Unit,
    onClickOutOfConfirm: () -> Unit,
    onClickNextLevel: () -> Unit,
    currentScreen: Difficulty,

    ) {
    val activity = LocalContext.current as Activity
    val totalScore = gameUiState.totalScore


    AlertDialog(
        onDismissRequest = onClickOutOfConfirm,
        title = {
            Text(text = stringResource(gameUiState.messageAtTheEnd))
        },

        text = {
            Text(
                text = stringResource(
                    messageEitherSucceedOrFailed,
                    gameUiState.totalScore,
                    gameUiState.needingPointsToReachNextLevel
                ),
            )

        },

        confirmButton = {
            IconButton(onClick = onClickConfirm) {
                Icon(
                    imageVector = Icons.Rounded.Refresh,
                    contentDescription = stringResource(R.string.refresh),
                    modifier = Modifier.fillMaxSize()
                )
            }

            if (
                (currentScreen == Difficulty.EASY && totalScore >= MINIMUM_POINTS_REACH_MEDIUM) or
                (currentScreen == Difficulty.MEDIUM && totalScore >= MINIMUM_POINTS_REACH_DIFFICULT) or
                (currentScreen == Difficulty.DIFFICULT && totalScore >= MINIMUM_POINTS_WIN_GAME)
            ) {
                IconButton(onClick = onClickNextLevel) {
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowRight,
                        contentDescription = stringResource(R.string.next),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        },

        dismissButton = {
            IconButton(onClick = { activity.finish() }) {
                Icon(
                    imageVector = Icons.Rounded.ExitToApp, contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    )
}
