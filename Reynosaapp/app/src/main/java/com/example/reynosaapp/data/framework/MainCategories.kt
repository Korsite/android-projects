package com.example.reynosaapp.data.framework

import androidx.annotation.StringRes
import com.example.reynosaapp.R

enum class MainCategories(@StringRes val Categories: List<Int>) {
    GoodPlaces(
        listOf(
            R.string.goodPlacesCategoryName1,
            R.string.goodPlacesCategoryName2,
            R.string.goodPlacesCategoryName3,
            R.string.goodPlacesCategoryName4,
            R.string.goodPlacesCategoryName5
        )
    ),

    DangerousPlaces(
        listOf(R.string.dangerousPlacesCategoryName1, R.string.dangerousPlacesCategoryName2)
    ),

    Opportunities(
        listOf(R.string.opportunitiesCategoryName1, R.string.opportunitiesCategoryName2)
    ),

    ExtraInfo(
        listOf(
            R.string.extraInformationCategory1,
            R.string.extraInformationCategory2,
            R.string.extraInformationCategory3
        )
    )
}