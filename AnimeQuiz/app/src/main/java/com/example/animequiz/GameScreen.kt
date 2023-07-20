package com.example.animequiz
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
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.animequiz.data.MAX_POINTS
import com.example.animequiz.data.animeData
import com.example.animequiz.ui.theme.AnimeQuizTheme
import com.example.animequiz.ui.theme.Shapes
// this gets the key of a value


@Preview(showSystemUi = true)
@Composable
fun AnimeQuizLayoutPreviewDarkMode(){
    AnimeQuizTheme{
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            AnimeQuizLayout(
                hint1 = R.string.kokushibo_hint_1,
                name_shuffled = "a",
                hint2 = R.string.kokushibo_hint_2,
                hint3 = R.string.kokushibo_hint_2,
                visibleAnimation = true,
                currentPicture = R.drawable.kokushibo,
                picturesShowed = 1,
                CheckWord = "",
                onValueChanged = {},
                onDoneFunction = { /*TODO*/ },
                wordIsWrong = false
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_20)),
                style = MaterialTheme.typography.displayMedium
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeApp(){
    Scaffold (
        topBar = {
            AnimeTopBar()
        }
    ){
        AnimeQuizScreen(paddingValues = it)
    }
}

@Composable
fun AnimeQuizScreen(
    modifier : Modifier = Modifier,
    paddingValues: PaddingValues,
    gameViewModel : GameViewModel = viewModel(),
){
    val gameUiState by gameViewModel.uiState.collectAsState()
    val activity = LocalContext.current as Activity
    val previousCharacterMessage = Toast.makeText(activity, stringResource(R.string.previous_character_message, gameViewModel.previousAnswer), Toast.LENGTH_SHORT)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .verticalScroll(
                rememberScrollState()
            )
    ){

        AnimeQuizLayout(

            hint1 = gameUiState.hint1,
            name_shuffled = gameUiState.answered_shuffled,
            hint2 = gameUiState.hint2,
            hint3 = gameUiState.hint3,

            visibleAnimation = gameViewModel.showHints,
            currentPicture = gameUiState.currentPicture,
            picturesShowed = gameUiState.picturesShowed,
            CheckWord = gameViewModel.userCheckWord,
            onValueChanged = { gameViewModel.updateUserWordCheck(it) },
            onDoneFunction = { gameViewModel.checkUserWord() },
            wordIsWrong = gameUiState.wordIsWrong,

            modifier = Modifier.padding(dimensionResource(R.dimen.padding_30))
        )

        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_20)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {



            Button(
                onClick =  { gameViewModel.checkUserWord() },
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
            ){
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
                        },
                    )
                }
            }
        }


    }

    if(gameUiState.gameIsOver) {
        AnimeAlertDialog(
            totalScore = gameUiState.totalScore,
            onClickConfirm = { gameViewModel.resetGame() },
        )
    }

}
@Composable
fun AnimeQuizLayout(
    @StringRes hint1 : Int,
    name_shuffled: String,
    hint2 : Int,
    hint3 : Int,
    visibleAnimation : Boolean,
    currentPicture: Int,
    picturesShowed: Int,
    CheckWord: String,
    onValueChanged: (String) -> Unit,
    onDoneFunction: () -> Unit,
    wordIsWrong : Boolean,
    modifier : Modifier = Modifier
){
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
                visibleAnimation = visibleAnimation,
                currentPicture = currentPicture,
                picturesShowed = picturesShowed,
                hint1 = hint1,
                name_shuffled = name_shuffled,
                hint2 = hint2,
                hint3 = hint3,
                CheckWord = CheckWord,
                onValueChanged = onValueChanged,
                onDoneFunction = onDoneFunction,
                wordIsWrong = wordIsWrong,
            )
        }
    }
}

@Composable
fun PrincipalLayout(
    visibleAnimation : Boolean,
    currentPicture: Int,
    picturesShowed: Int,
    @StringRes hint1 : Int,
    name_shuffled : String,
    hint2 : Int,
    hint3 : Int,
    CheckWord: String,
    onValueChanged: (String) -> Unit,
    onDoneFunction: () -> Unit,
    wordIsWrong : Boolean,
){

    CountPicture(picturesShowed)

    AnimePicture(picture = currentPicture)

    AnimeInstructions()

    AnimeFieldToWrite(
        CheckWord,
        onValueChanged,
        onDoneFunction = onDoneFunction,
        wordIsWrong,
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
    @StringRes hint1 : Int,
    hint2 : Int,
    hint3 : Int,
    name_shuffled : String
){
    Column(
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ){

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
fun AnimePicture(
    @DrawableRes picture : Int,
){
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
fun AnimeInstructions(){
    Text(
        text = stringResource(R.string.instructions),
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeFieldToWrite(
    userCheckWord : String,
    onValueChanged : (String) -> Unit,
    onDoneFunction : () -> Unit,
    wordIsWrong : Boolean
){

    OutlinedTextField(
        value = userCheckWord,
        singleLine = true,
        shape = shapes.large,
        label = { Text(text = stringResource(R.string.enter_name))},
        placeholder ={ Text(text = stringResource(R.string.hit_a_hint))},
        onValueChange = onValueChanged,
        isError = wordIsWrong,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = colorScheme.onPrimary
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { onDoneFunction() }
        )
    )
}

@Composable
fun CountPicture(
    picturesShowed : Int
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorScheme.primary
        )
    ){
        Text(
            text = stringResource(R.string.picture_count, picturesShowed),
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_10))
        )
    }
}

@Composable
fun PointStatus(
    totalScore: Int,
){
    Text(
        text = stringResource(R.string.points_count, totalScore),
        modifier = Modifier.padding(dimensionResource(R.dimen.padding_10))
    )

}

@Composable
fun ClickMeHintsButton(
    onShowHints : () -> Unit,
    modifier : Modifier = Modifier
){
    OutlinedButton(
        modifier = Modifier.fillMaxWidth(),
        onClick =  onShowHints,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorScheme.inversePrimary
        )
    ) {
        Text(text = stringResource(R.string.click_me_hints_info))
    }
}

@Composable
fun AnimeAlertDialog(
    totalScore : Int,
    onClickConfirm : () -> Unit,
){
    val activity = (LocalContext.current as Activity)

    val MAX_POINTS : Double = MAX_POINTS

    val message_at_the_end = if(totalScore >= 0){
        when ((totalScore.toDouble()) / MAX_POINTS) {
            in 0.0 .. 0.29 -> R.string.very_bad
            in 0.3 .. 0.49 -> R.string.cant_blame_you
            in 0.5 .. 0.69 -> R.string.well_done
            in 0.7 .. 0.89 -> R.string.congratulations
            else -> R.string.you_are_otaku
        }
    }else
        R.string.negative_score

    AlertDialog(
        onDismissRequest = {},
        title = {
                Text(text = stringResource(message_at_the_end))
        },

        text = {
               Text(text = "Total points: $totalScore")
        },

        confirmButton = {
            IconButton(onClick = onClickConfirm) {
                Icon(
                    imageVector = Icons.Rounded.Refresh, contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
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

