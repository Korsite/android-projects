package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ComposableArticleImage(
                        headline = stringResource(R.string.headline),
                        paragraph = stringResource(R.string.paragraph),
                        paragraph2 = stringResource(R.string.paragraph2)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposabelArticleText(headline : String,
                          paragraph: String,
                          paragraph2: String,
                          modifier: Modifier = Modifier)
{

        Text(
            text = headline,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
            )
        Text(
            text = paragraph,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = paragraph2,
            Modifier
                .padding(16.dp)
        )


}

@Composable
fun ComposableArticleImage(headline: String,
                          paragraph  : String,
                          paragraph2 : String,
                          modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column(){
        Image(painter = image,
            contentDescription = null
        )
        ComposabelArticleText(
            headline = headline,
            paragraph = paragraph,
            paragraph2 = paragraph2,
            modifier = Modifier
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
    )
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        ComposableArticleImage(
            headline = stringResource(R.string.headline),
            paragraph = stringResource(R.string.paragraph),
            paragraph2 = stringResource(R.string.paragraph2)
                    )

    }
}