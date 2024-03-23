package com.example.quizme.composable.screenState

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizme.R


@Composable
fun ErrorScreen(
    modifier: Modifier = Modifier,
    navigate: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .clickable { navigate() }
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.tapscreen),
            contentDescription = stringResource(R.string.error),
            modifier = Modifier.size(250.dp),
            colorFilter = ColorFilter.tint(color = Color.Gray)
        )
        Text(text = stringResource(R.string.infoNotFound), textAlign = TextAlign.Center)

    }
}

@Composable
@Preview(showSystemUi = true)
fun ErrorScreenPreview() {
    ErrorScreen {}
}