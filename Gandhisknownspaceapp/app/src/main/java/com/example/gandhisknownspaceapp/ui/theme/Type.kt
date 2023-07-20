package com.example.gandhisknownspaceapp.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gandhisknownspaceapp.R

val MerryWeather = FontFamily(
    Font(R.font.merriweather_light),
    Font(R.font.merriweather_ighttalic)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = MerryWeather,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
    ),

    displayMedium = TextStyle(
        fontFamily = MerryWeather,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),

    labelSmall = TextStyle(
        fontFamily = MerryWeather,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = MerryWeather,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

)