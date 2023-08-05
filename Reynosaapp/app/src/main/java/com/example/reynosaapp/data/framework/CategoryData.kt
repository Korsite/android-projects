package com.example.reynosaapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryData(
    @StringRes val categoryName : Int,
    @StringRes val categoryDescription : Int = -1,
    @DrawableRes val categoryPicture : Int = -1
)
