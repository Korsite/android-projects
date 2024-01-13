package com.example.reynosaapp.data.extrainfo

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData

object ExtraInformationProviderSubCategories {

    private val subCategory1 = listOf(
        SubCategoryData(
            subCategoryName = R.string.useForNoThing,
            subCategoryPicture = R.drawable.usefornothing,
            subCategoryContentDescription = R.string.extraInformationSubCategory1Name
        )
    )

    private val subCategory2 = listOf(
        SubCategoryData(
            subCategoryName = R.string.useForNoThing,
            subCategoryPicture = R.drawable.usefornothing,
            subCategoryContentDescription = R.string.extraInformationSubCategory1Name
        )
    )

    private val subCategory3 = listOf(
        SubCategoryData(
            subCategoryName = R.string.useForNoThing,
            subCategoryPicture = R.drawable.usefornothing,
            subCategoryContentDescription = R.string.extraInformationSubCategory1Name
        )
    )
    val subCategories = mapOf(
        MainCategories.ExtraInfo.Categories[0] to subCategory1,

        MainCategories.ExtraInfo.Categories[1] to subCategory2,

        MainCategories.ExtraInfo.Categories[2] to subCategory3
    )

}