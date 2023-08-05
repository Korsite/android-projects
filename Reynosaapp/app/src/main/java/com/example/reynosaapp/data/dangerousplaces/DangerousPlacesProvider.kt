package com.example.reynosaapp.data

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.SubCategoryData

object badPlacesProvider {
    val Categories = listOf(
        CategoryData(
            R.string.goodPlacesCategoryName1,
            R.string.goodPlacesCategoryContentDescription1,
            R.drawable.mitsuha
        ),
        CategoryData(
            R.string.goodPlacesCategoryName2,
            R.string.goodPlacesCategoryContentDescription2,
            R.drawable.mitsuha
        ),
    )

    val SubCategories = listOf(
        SubCategoryData(
            subCategoryName = R.string.badPlacesSubCategoryName1,
            subCategoryContentDescription = R.string.badPlacesSubCategoryContentDescription1,
            subCategoryPicture = R.drawable.mitsuha
        ),
        SubCategoryData(
            subCategoryName = R.string.badPlacesSubCategoryName2,
            subCategoryContentDescription = R.string.badPlacesSubCategoryContentDescription2,
            subCategoryPicture = R.drawable.mitsuha
        ),
        SubCategoryData(
            subCategoryName = R.string.badPlacesSubCategoryName1,
            subCategoryContentDescription = R.string.badPlacesSubCategoryContentDescription2,
            subCategoryPicture = R.drawable.mitsuha
        )
    )
}