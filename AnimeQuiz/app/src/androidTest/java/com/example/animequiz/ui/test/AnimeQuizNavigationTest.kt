package com.example.animequiz.ui.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.NavController
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.animequiz.AnimeApp
import com.example.animequiz.Difficulty
import com.example.animequiz.data.MAX_PICTURES_PER_ROUND
import com.example.animequiz.data.animeData
import com.example.animequiz.ui.GameViewModel
import com.example.animequiz.ui.getKey
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import com.example.animequiz.R

class AnimeQuizNavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController
    private val viewModel: GameViewModel = GameViewModel()


    @Before
    fun setUpAnimeQuizNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            AnimeApp(navController = navController, viewModel = viewModel)
        }
    }

    @Test
    fun animeQuizNavHost_verifyStartDestination() {
        navController.assertCurrentRouteName(Difficulty.EASY.name)
    }

    @Test
    fun animeQuizNavHost_assertAllPictures_NextLevelButtonDisplayed() {
        assertAllPictures()
        composeTestRule.onNodeWithContentDescription(
                composeTestRule.activity.getString(R.string.next)
            ).assertIsDisplayed()

    }

    @Test
    fun animeQuizNavHost_failAllPictures_NextLevelButtonNotDisplayed(){
        failAllPictures()
        composeTestRule.onNodeWithContentDescription(
            composeTestRule.activity.getString(R.string.next)
        ).assertDoesNotExist()
    }

    @Test
    fun animeQuizNavHost_ClickNextLevelButton_travelToMediumLevel() {
        val nextLevelButtonContentDescription = composeTestRule.activity.getString(R.string.next)

        assertAllPictures()
        composeTestRule.onNodeWithContentDescription(nextLevelButtonContentDescription)
            .performClick()

        navController.assertCurrentRouteName(Difficulty.MEDIUM.name)
    }

    @Test
    fun animeQuizNavHost_ClickNextLevelButton_travelToDifficultLevel(){
        val nextLevelButtonContentDescription = composeTestRule.activity.getString(R.string.next)

        animeQuizNavHost_ClickNextLevelButton_travelToMediumLevel()
        assertAllPictures()
        composeTestRule.onNodeWithContentDescription(nextLevelButtonContentDescription)
            .performClick()
        navController.assertCurrentRouteName(Difficulty.DIFFICULT.name)
    }


    private fun assertAllPictures() {
        var uiState = viewModel.uiState.value
        var currentAnswer = getKey(
            animeData[viewModel.currentDifficulty] ?: emptyMap(),
            uiState.currentPicture
        ).toString()

        repeat(MAX_PICTURES_PER_ROUND.toInt()) {
            viewModel.updateUserWordCheck(currentAnswer)
            viewModel.checkUserWord()
            uiState = viewModel.uiState.value
            currentAnswer = getKey(
                animeData[viewModel.currentDifficulty] ?: emptyMap(),
                uiState.currentPicture
            ).toString()
        }
    }

    private fun failAllPictures() {
        repeat(MAX_PICTURES_PER_ROUND.toInt()) {
            composeTestRule.onNodeWithText(
                composeTestRule.activity.getString(R.string.skip)
            ).performClick()
        }
        var uiState = viewModel.uiState.value //this is used to update data
    }

    private fun NavController.assertCurrentRouteName(expectedRoute: String) {
        Assert.assertEquals(expectedRoute, currentBackStackEntry?.destination?.route)
    }

}