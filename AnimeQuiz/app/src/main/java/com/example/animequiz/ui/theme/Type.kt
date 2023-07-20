package com.example.animequiz.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.animequiz.R

val ubuntuTypography = FontFamily(
    Font(R.font.ubuntu_regular)
)

val Typography = Typography(

    displayMedium = TextStyle(
        fontFamily = ubuntuTypography,
        fontWeight = FontWeight.Bold,
        fontSize = 38.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.5.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = ubuntuTypography,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),



)