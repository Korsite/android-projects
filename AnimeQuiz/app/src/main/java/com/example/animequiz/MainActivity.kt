package com.example.animequiz

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.animequiz.data.POINTS_IF_HINTS_WATCHED
import com.example.animequiz.ui.theme.AnimeQuizTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val alertOfUsingHints = Toast.makeText(this, stringResource(R.string.welcome_message, POINTS_IF_HINTS_WATCHED), Toast.LENGTH_LONG)

            AnimeQuizTheme(darkTheme = true){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AnimeApp()
                    alertOfUsingHints.show()
                }
            }
        }
    }
}
