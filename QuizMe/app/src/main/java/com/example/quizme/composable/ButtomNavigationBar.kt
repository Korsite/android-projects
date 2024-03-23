package com.example.quizme.composable

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.quizme.composable.navigation.NavigationList
import com.example.quizme.composable.navigation.rules.EditQuestionDestination
import com.example.quizme.composable.navigation.rules.EditQuizDestination
import com.example.quizme.composable.navigation.rules.ListOfQuestionsDestination
import com.example.quizme.composable.navigation.rules.QuestionDestination
import com.example.quizme.viewModels.MainViewModel
import com.example.quizme.viewModels.QuestionNavigation
import com.example.quizme.viewModels.mockQuestion

@Composable
fun BottomNavigationBar(
    latestQuizName: String,
    currentRoute: List<String>,
    mainViewModel: MainViewModel,
    questionNavigation: QuestionNavigation,
    navController: NavHostController,
    onClickMainCategory: (String) -> Unit,
) {
    // val routeForMainNavigation = NavigationList.main.map { it.name }
    // routeForMainNavigation.map { currentRoute.contains(it) }.contains(true)

    when {
        // TODO currentRoute.length == 2 since route is -> 1/
        currentRoute.count() >= 3 -> QuestionNavigationBar(
            latestQuizName = latestQuizName,
            questionNavigation = questionNavigation,
            mainViewModel = mainViewModel,
            navController = navController
        )

        !currentRoute.contains("EditQuiz") -> MainBottomNavigationBar(
            currentRoute = currentRoute.first(),
            onClickMainCategory = onClickMainCategory
        )
    }
}

@Composable
fun MainBottomNavigationBar(
    currentRoute: String,
    onClickMainCategory: (String) -> Unit,
) {

    NavigationBar {
        NavigationList.main.forEachIndexed { index, mainNavigationData ->
            NavigationBarItem(
                selected = mainNavigationData.name == currentRoute,
                onClick = {
                    onClickMainCategory(mainNavigationData.name)
                },
                icon = {
                    Icon(
                        imageVector = mainNavigationData.icon,
                        contentDescription = stringResource(mainNavigationData.stringResource)
                    )
                },
                label = {
                    Text(text = mainNavigationData.name)
                }
            )
        }
    }
}

@Composable
fun QuestionNavigationBar(
    latestQuizName: String,
    questionNavigation: QuestionNavigation,
    mainViewModel: MainViewModel,
    navController: NavHostController,
) {
    val inEditQuizMode =
        (mainViewModel.mainRouteNavigation.observeAsState().value ?: "")
            .contains("EditQuiz")

    NavigationBar {
        NavigationList.level.forEachIndexed { index, levelNavigationData ->
            NavigationBarItem(
                selected = false,
                onClick = {
                    when (levelNavigationData.name) {
                        // previous question
                        NavigationList.level.component1().name -> {
                            val personName = questionNavigation.previousQuestion.personId
                            val questionId = questionNavigation.previousQuestion.questionId
                            val route =
                                if (inEditQuizMode) "${EditQuestionDestination.route}/${personName}/${questionId}"
                                else "${QuestionDestination.route}/${personName}/${questionId}"
                            mainViewModel.changeSecondaryNavigation("/$questionId")
                            navController.navigate(route)
                            mainViewModel.getNextAndPreviousQuestion(
                                questionNavigation.listOfQuestions,
                                questionNavigation.previousQuestion.questionId
                            )
                        }

                        // home button
                        NavigationList.level.component2().name -> {
                            val route =
                                if (inEditQuizMode) {
                                    // re-calculates all questions, so when clicking select all in edit mode
                                    // all questions can be selected, if this is not done
                                    // a question edited will not be selected
                                    mainViewModel.calculateAllQuestionsFromSomeone(latestQuizName)
                                    "${EditQuizDestination.route}/${latestQuizName}"

                                } else "${ListOfQuestionsDestination.route}/$latestQuizName"
                            navController.navigate(route)
                            mainViewModel.changeSecondaryNavigation("")
                        }

                        // next question
                        NavigationList.level.component3().name -> {
                            val personName = questionNavigation.nextQuestion.personId
                            val questionId = questionNavigation.nextQuestion.questionId
                            val route =
                                if (inEditQuizMode) "${EditQuestionDestination.route}/${personName}/${questionId}"
                                else "${QuestionDestination.route}/${personName}/${questionId}"
                            mainViewModel.changeSecondaryNavigation("/$questionId")
                            navController.navigate(route)
                            mainViewModel.getNextAndPreviousQuestion(
                                questionNavigation.listOfQuestions,
                                questionNavigation.nextQuestion.questionId
                            )
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = levelNavigationData.icon, contentDescription = stringResource(
                            levelNavigationData.stringResource
                        )
                    )
                },
                enabled = when (levelNavigationData) {
                    // mock means that no question is available
                    NavigationList.level.component1() -> questionNavigation.previousQuestion != mockQuestion // previousLevel button
                    NavigationList.level.component3() -> questionNavigation.nextQuestion != mockQuestion // nextLevel button
                    else -> true // home button
                }
            )
        }
    }
}