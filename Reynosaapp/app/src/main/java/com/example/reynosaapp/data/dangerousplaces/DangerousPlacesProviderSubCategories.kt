package com.example.reynosaapp.data.dangerousplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData

object DangerousPlacesProviderSubCategories {
    private val subCategory1 =listOf(
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName1,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription1,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture1
        ),
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName2,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription2,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture2
        ),
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName3,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription3,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture3
        ),
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName4,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription4,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture4
        ),
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName5,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription5,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture5
        ),
        SubCategoryData(
            subCategoryName = R.string.dangerousPlacesSubCategoryName6,
            subCategoryContentDescription = R.string.dangerousPlacesSubCategoryContentDescription6,
            subCategoryPicture = R.drawable.dangerousplacescoloniessubcategorypicture6
        ),
    )

    // if dangerous places is added, use it in the public val "subCategories" of type map
    private val subCategory2 = listOf(
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

    val subCategories = mapOf(
        MainCategories.DangerousPlaces.Categories[0] to subCategory1
    )
}