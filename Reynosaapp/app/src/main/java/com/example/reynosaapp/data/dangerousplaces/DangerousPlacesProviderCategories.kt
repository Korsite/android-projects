package com.example.reynosaapp.data.dangerousplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.MainCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.SubCategoryData

object DangerousPlacesProvider {
    val Categories = listOf(
        CategoryData(
            R.string.dangerousPlacesCategoryName1,
            R.string.goodPlacesCategoryContentDescription1,
            R.drawable.mitsuha
        ),
        CategoryData(
            R.string.dangerousPlacesCategoryName2,
            R.string.goodPlacesCategoryContentDescription2,
            R.drawable.mitsuha
        )
    )

    val SubCategories = mapOf(
        MainCategories.DangerousPlaces.Categories[0] to listOf(
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName1,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription1,
                subCategoryPicture = R.drawable.mitsuha
            ),
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName2,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription2,
                subCategoryPicture = R.drawable.mitsuha
            ),
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName1,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription2,
                subCategoryPicture = R.drawable.mitsuha
            )
        ),

        MainCategories.DangerousPlaces.Categories[1] to listOf(
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName1,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription1,
                subCategoryPicture = R.drawable.mitsuha
            ),
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName2,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription2,
                subCategoryPicture = R.drawable.mitsuha
            ),
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName1,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription2,
                subCategoryPicture = R.drawable.mitsuha
            )
        )
    )
}
