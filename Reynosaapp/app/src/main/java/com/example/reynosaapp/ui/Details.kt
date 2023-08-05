package com.example.reynosaapp.ui.theme

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HyperText(
//    @StringRes text : Int
){
    val hyperText = buildAnnotatedString {
        // creating a string to display in the Text
        val string = "Click here to google maps"

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
            annotation = "https://www.geeksforgeeks.org",
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
        }
    )
}

@Composable
@Preview
fun preview(){
    ReynosaAppTheme {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            HyperText(

            )
        }
    }
}