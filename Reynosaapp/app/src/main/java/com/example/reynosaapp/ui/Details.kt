package com.example.reynosaapp.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.example.reynosaapp.R
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import java.time.LocalDateTime
import java.util.Calendar

@Composable
fun HyperText(
    @StringRes link : Int,
    modifier : Modifier
){
    val hyperText = buildAnnotatedString {
        // creating a string to display in the Text
        val string = stringResource(R.string.clickHere)

        // word and span to be hyperlinked
        val startIndex = 0
        val endIndex = string.lastIndex + 1

        append(string)
        addStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            ), start = startIndex, end = endIndex
        )

        // attach a string annotation that
        // stores a URL to the text "link"
        addStringAnnotation(
            tag = "URL",
            annotation = stringResource(link),
            start = startIndex,
            end = endIndex
        )
    }

    val mUriHandler = LocalUriHandler.current

    ClickableText(
        text = hyperText,
        onClick = {
            hyperText
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    mUriHandler.openUri(stringAnnotation.item)
                }
        },
        modifier = modifier
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showSystemUi = true)
fun preview(){
    val message = Calendar.getInstance()
    val minutesOpenedAt = 3.0/60.0
    val openAT = 10 + minutesOpenedAt
    val closeAt = 19 + minutesOpenedAt
    val minutesNow = message[Calendar.MINUTE].toDouble() / 60.0

    val hourNow = message[Calendar.HOUR_OF_DAY] + minutesNow
    ReynosaAppTheme {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = if (hourNow in (openAT + 1) .. closeAt) "is opened" else "is closed")
            Text(text = minutesOpenedAt.toString())
        }
    }
}