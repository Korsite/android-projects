package com.example.tiptime

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.tiptime.ui.theme.TipTimeTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()
    // we create a variable instantiated in a class
    // which creates the UI content for the instrumentation test
    // which further, it will be used for making the test with "setContent" method
    @Test
    fun calculate_20_percent_tip(){

        /** The compiler knows that methods annotated with @Test annotation
         * in the androidTest directory refer to instrumentation tests
         * and methods annotated with @Test annotation in the
         * test directory refer to local tests.
         */

        composeTestRule.setContent { //This sets the UI content of the composeTestRule.
            TipTimeTheme { // the name of the activity followed by a "theme"
                TipTimeLayout() //the component UI we want to display
            }
        }
        //when UI content is set up, you can write instructions to interact
        //with the app's UI components which can be accessed as NODES
        //through the composeTestRule

        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
            "No node with this text was found"
        )
    }

}