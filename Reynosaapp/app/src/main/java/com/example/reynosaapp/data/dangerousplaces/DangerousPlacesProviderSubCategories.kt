package com.example.reynosaapp.data.dangerousplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData

object DangerousPlacesProviderSubCategories {
    private val subCategory1 =listOf(
            SubCategoryData(
                subCategoryName = R.string.dangerousPlacesSubCategoryName1,
                subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription1,
                subCategoryPicture = R.drawable.mitsuha,

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

    private val subCategory2 = listOf(
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

    val subCategories = mapOf(
        MainCategories.DangerousPlaces.Categories[0] to subCategory1,
        MainCategories.DangerousPlaces.Categories[1] to subCategory2,
    )
}