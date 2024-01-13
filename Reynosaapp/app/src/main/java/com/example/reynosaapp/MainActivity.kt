package com.example.reynosaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.reynosaapp.ui.ReynosaApp
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

class MainActivity : ComponentActivity() {
    private val rememberScrollPositionForCoffeeShops by lazy {
        applicationContext.getSharedPreferences("rememberPositionForCoffeeShops", MODE_PRIVATE)
    }

    private val rememberScrollPositionForRestaurants by lazy {
        applicationContext.getSharedPreferences("rememberPositionForRestaurants", MODE_PRIVATE)
    }

    private val rememberScrollPositionForParks by lazy {
        applicationContext.getSharedPreferences("rememberPositionForParks", MODE_PRIVATE)
    }

    private val rememberIsInDarkMode by lazy {
        application.getSharedPreferences("isInDarkMode", MODE_PRIVATE)
    }


    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowsSize = calculateWindowSizeClass(activity = this)


                    ReynosaApp(
                        rememberIsInDarkMode,
                        windowsSize.widthSizeClass,
                        rememberScrollPositionForCoffeeShops,
                        rememberScrollPositionForRestaurants,
                        rememberScrollPositionForParks
                    )

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun mainPreview() {

}


