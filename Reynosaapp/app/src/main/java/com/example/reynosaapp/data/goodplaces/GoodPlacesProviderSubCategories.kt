package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData

object GoodPlacesProviderSubCategories {

    private val subCategory1 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName1,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryAvailableNow1,
            openTime = 6.00,
            closeTime = 22.00
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName2,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryAvailableNow1,
            openTime = 6.00,
            closeTime = 22.00
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName3,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryAvailableNow1,
            openTime = 6.00,
            closeTime = 22.00
        )
    )

    private val subCategory2 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName4,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName5,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName6,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        )
    )

    private val subCategory3 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName7,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName8,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName9,
            subCategoryPicture = R.drawable.mitsuha,
            subCategorySchedule = R.string.goodPlacesSubCategorySchedule1,
            subCategoryClickHere = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryAvailableNow = R.string.goodPlacesSubCategoryClickHere1
        )
    )

    val SubCategories = mapOf(
        MainCategories.GoodPlaces.Categories[0] to subCategory1,

        MainCategories.GoodPlaces.Categories[1] to subCategory2,

        MainCategories.GoodPlaces.Categories[2] to subCategory3
    )
}