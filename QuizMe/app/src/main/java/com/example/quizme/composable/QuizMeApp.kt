package com.example.quizme.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.quizme.composable.navigation.NavHostQuizMe
import com.example.quizme.composable.navigation.NavigationList
import com.example.quizme.composable.navigation.rules.ListOfQuestionsDestination
import com.example.quizme.viewModels.FactoryViewModelProvider
import com.example.quizme.viewModels.MainViewModel
import com.example.quizme.viewModels.QuestionNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun QuizMeApp(
    onChangeTheme: () -> Unit,
    // need a reference to these navs, to make BottomNavigationBar buttons work
    navController: NavHostController = rememberNavController(),
    mainViewModel: MainViewModel = viewModel(factory = FactoryViewModelProvider.Factory),
) {

    val mainRoute = mainViewModel.mainRouteNavigation.observeAsState().value
    val secondaryRoute = mainViewModel.secondaryRouteNavigation.observeAsState().value
    val questionNavigation =
        mainViewModel.questionNavigation.observeAsState().value ?: QuestionNavigation()

    val latestQuizName: String = mainViewModel.latestQuizName.collectAsState().value
    val completeRoute = "$mainRoute$secondaryRoute"
    val routeSplit = completeRoute.split("/")

    val inSelectionMode = mainViewModel.inSelectionMode.observeAsState().value ?: false

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "current navigation -> $mainRoute$secondaryRoute -> ${routeSplit.count()} components",
                        style = MaterialTheme.typography.labelMedium
                    )
                },
                actions = {
                    IconButton(onClick = { onChangeTheme() }) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = null
                        )
                    }
                }
            )
        },

        floatingActionButton = {
            FloatingNavigationButton(
                mainViewModel = mainViewModel,
                navController = navController,
                inSelectionMode = inSelectionMode,
                currentRoute = routeSplit
            )
        },
        bottomBar = {
            BottomNavigationBar(
                latestQuizName = latestQuizName,
                currentRoute = routeSplit,
                mainViewModel = mainViewModel,
                questionNavigation = questionNavigation,
                navController = navController,
                onClickMainCategory = { mainNavigationName ->
                    // this condition blocks recomposition in the same route
                    if (routeSplit.first() != mainNavigationName) {
                        when (mainNavigationName) {
                            // questions
                            NavigationList.main.first().name ->{
                                val route = "${ListOfQuestionsDestination.route}/${latestQuizName}"
                                mainViewModel.changeMainRoute(route)
                                navController.navigate(route)
                            }
                            // quizzes or userInfo
                            else -> {
                                navController.navigate(mainNavigationName)
                                mainViewModel.changeMainRoute(mainNavigationName)
                            }
                        }
                    }
                }
            )
        }
    ) { paddingValues ->
        NavHostQuizMe(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            mainViewModel = mainViewModel
        )
    }
}

