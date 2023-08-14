package com.example.reynosaapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.reynosaapp.ui.ReynosaApp
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowsSize = calculateWindowSizeClass(activity = this)
            ReynosaAppTheme(darkTheme = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ReynosaApp(
                        windowsSize.widthSizeClass,
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun mainPreview() {
    ReynosaAppTheme {
        ReynosaApp(WindowWidthSizeClass.Compact)
    }
}


