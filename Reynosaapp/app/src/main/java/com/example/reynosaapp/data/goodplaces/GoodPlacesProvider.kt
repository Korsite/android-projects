package com.example.reynosaapp.data

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.SubCategoryData

object goodPlacesProvider {
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
        CategoryData(
            R.string.goodPlacesCategoryName3,
            R.string.goodPlacesCategoryContentDescription3,
            R.drawable.mitsuha
        )
    )

    val SubCategories = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName1,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryAvailableNow1
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName2,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule2,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere2,
            subCategoryAvailableNow =R.string.goodPlacesSubCategoryAvailableNow2
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName3,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule3,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere3,
            subCategoryAvailableNow =R.string.goodPlacesSubCategoryAvailableNow3
        )
    )
}