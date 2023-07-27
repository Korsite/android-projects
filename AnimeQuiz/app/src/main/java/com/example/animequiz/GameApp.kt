package com.example.animequiz

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navOptions
import com.example.animequiz.ui.AnimeQuizScreen
import com.example.animequiz.ui.GameUiState
import com.example.animequiz.ui.GameViewModel
import com.example.animequiz.ui.theme.AnimeQuizTheme




enum class Difficulty(level : String){
    EASY(level = "Easy"),
    MEDIUM(level = "Medium"),
    DIFFICULT(level = "Difficult")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeTopBar(
) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(
                    text = stringResource(R.string.app_name),
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_20)),
                    style = MaterialTheme.typography.displaySmall
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeBottomBar(
    onClickSquareButtons: (String) -> Unit,
    message: Context,
    viewModel: GameViewModel,
    levels : List<Boolean>,
){
    val squares = Difficulty.values()

    CenterAlignedTopAppBar(
        title = {
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ){
                squares.forEachIndexed { index, item ->
                    val message =
                        Toast.makeText(message, "Level changed to ${item.name}", Toast.LENGTH_SHORT)
                    Button(
                        onClick = {
                            message.show()
                            viewModel.changeDifficulty(item)
                            viewModel.resetGame()
                            onClickSquareButtons(item.name)
                        },
                        enabled = levels[index],
                    ) {
                        Text(text = item.name)
                    }
                }
            }
        }
    )
}


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnimeApp(
    viewModel : GameViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
){
    val uiState by viewModel.uiState.collectAsState()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = Difficulty.valueOf(
        backStackEntry?.destination?.route ?: Difficulty.EASY.name
    )

    val levels = when(currentScreen){
        Difficulty.EASY ->  listOf(true, false, false)
        Difficulty.MEDIUM ->  listOf(true, true, false)
        else -> listOf(true, true, true)
    }

    Scaffold (
        topBar = {
            AnimeTopBar()
        },
        bottomBar = {

            AnimeBottomBar(
                onClickSquareButtons = { currentDifficulty ->
                    if(currentDifficulty == currentScreen.name) navController.navigate(currentDifficulty)
                    /**
                     if the Difficulty of the bottom pressed not equals to the current route of navigation
                     then, view Model is modified so the pictures of the button difficulty pressed are shown
                     however, the route is not changed, in other words, we display pictures of different difficulty
                     in the same route

                     This was made because if route is also changed to display the corresponding pictures, then
                     levels variable is changed too, so the buttons availability will changed too

                     For example, if user is in MEDIUM level, and wants to click EASY level, route is changed, buttons would change
                     and he couldn't pressed MEDIUM level back, for this to not happen, images are displayed in the same route
                     */
                },
                viewModel = viewModel,
                message = LocalContext.current,
                levels = levels,
            )
        }
    ){

        NavHost(
            navController = navController,
            startDestination = Difficulty.EASY.name,
            Modifier.padding(it)
        ){


            composable(route = Difficulty.EASY.name){
                AnimeQuizScreen(
                    gameViewModel = viewModel,
                    gameUiState = uiState,
                    onClickNextLevel = {
                        navController.navigate(Difficulty.MEDIUM.name)
                        viewModel.currentDifficulty = Difficulty.MEDIUM
                        viewModel.resetGame()
                    },
                    currentScreen = currentScreen
                )
            }

            composable(route = Difficulty.MEDIUM.name){
                AnimeQuizScreen(
                    gameViewModel = viewModel,
                    gameUiState = uiState,
                    onClickNextLevel = {
                        navController.navigate(Difficulty.DIFFICULT.name)
                        viewModel.currentDifficulty = Difficulty.DIFFICULT
                        viewModel.resetGame()
                                       },
                    currentScreen = currentScreen
                )
            }

            composable(route = Difficulty.DIFFICULT.name){
                AnimeQuizScreen(
                    gameViewModel = viewModel,
                    gameUiState = uiState,
                    onClickNextLevel = {},
                    currentScreen = currentScreen
                )
            }
        }
    }
}