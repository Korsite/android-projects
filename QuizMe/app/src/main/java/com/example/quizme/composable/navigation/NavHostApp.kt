package com.example.quizme.composable.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.quizme.composable.navigation.question.ListOfQuestionsLayout
import com.example.quizme.composable.navigation.question.QuestionLayout
import com.example.quizme.composable.navigation.quizzes.QuizzesLayout
import com.example.quizme.composable.navigation.quizzes.editQuiz.EditQuestion
import com.example.quizme.composable.navigation.quizzes.editQuiz.EditQuiz
import com.example.quizme.composable.navigation.rules.EditQuestionDestination
import com.example.quizme.composable.navigation.rules.EditQuizDestination
import com.example.quizme.composable.navigation.rules.ListOfQuestionsDestination
import com.example.quizme.composable.navigation.rules.QuestionDestination
import com.example.quizme.viewModels.MainViewModel

@Composable
fun NavHostQuizMe(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    mainViewModel: MainViewModel,
) {
    val routeForMainNavigation = NavigationList.main.map { it.name }
    NavHost(
        navController = navController,
        startDestination = routeForMainNavigation.component2()
    ) {
        // Questions
        composable(
            route = ListOfQuestionsDestination.routeWithArgs,
            arguments = listOf(navArgument(ListOfQuestionsDestination.name) { type = NavType.StringType }
            )
        ) {
            ListOfQuestionsLayout(
                modifier = modifier,
                mainViewModel = mainViewModel,
                navController = navController,
                onClickQuestion = { questionId, personId, listOfQuestions ->
                    val route = "${QuestionDestination.route}/${personId}/${questionId}"
                    navController.navigate(route)
                    mainViewModel.changeSecondaryNavigation("/$questionId")
                    mainViewModel.getNextAndPreviousQuestion(listOfQuestions, questionId)
                }
            )
        }

        // Question layout
        composable(
            route = QuestionDestination.routeWithArgs,
            arguments = listOf(
                navArgument(QuestionDestination.levelIdArg) { type = NavType.IntType },
                navArgument(QuestionDestination.name) { type = NavType.StringType })
        ) {
            QuestionLayout(
                modifier = modifier,
                navController = navController,
            ) { questionId, personId ->
                val route = "${QuestionDestination.route}/${personId}/${questionId}"
                navController.navigate(route)
                mainViewModel.changeSecondaryNavigation(route)
            }
        }

        // Quizzes
        composable(route = routeForMainNavigation.component2()) {
            QuizzesLayout(
                navController = navController, modifier = modifier,
                onEditConfirm = { quizName, listOfQuestions ->
                    val route = "${EditQuizDestination.route}/${quizName}"
                    mainViewModel.changeMainRoute(route)
                    navController.navigate(route)

                    mainViewModel.calculateAllQuestionsFromSomeone(quizName)
                },
                onQuizClick = { completeName, listOfQuestions ->
                    val route = "${ListOfQuestionsDestination.route}/${completeName}"

                    mainViewModel.changeMainRoute(route)

                    mainViewModel.getNextAndPreviousQuestion(listOfQuestions, 0)
                    navController.navigate(route = route)
                }
            )
        }

        // User Info
        composable(route = routeForMainNavigation.component3()) {
            Text(text = "You are in 3rd choice", modifier = modifier)
        }

        // Quiz edit
        composable(
            route = EditQuizDestination.routeWithArgs,
            arguments = listOf(
                navArgument(EditQuizDestination.name) { type = NavType.StringType }
            )
        ) {
            EditQuiz(
                modifier = modifier,
                mainViewModel = mainViewModel,
                navController = navController
            ){ personName, questionId, listOfQuestions ->
               val route = "${EditQuestionDestination.route}/${personName}/${questionId}"
                navController.navigate(route)
                mainViewModel.changeSecondaryNavigation("/$questionId")

                mainViewModel.getNextAndPreviousQuestion(listOfQuestions, questionId)
            }
        }

        composable(
            route = EditQuestionDestination.routeWithArgs,
            arguments =
                listOf(
                    navArgument(EditQuestionDestination.name){ type = NavType.StringType },
                    navArgument(EditQuestionDestination.levelIdArg){ type = NavType.IntType }
                )
        ){
            EditQuestion(
                mainViewModel = mainViewModel,
                modifier = modifier
            )
        }

    }
}