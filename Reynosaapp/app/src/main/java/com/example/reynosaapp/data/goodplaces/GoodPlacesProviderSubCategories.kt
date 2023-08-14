package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.extraOptions.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop

object GoodPlacesProviderSubCategories {

    private val subCategory1 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName1,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            openTime = 1.00,
            closeTime = 22.00,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(openTimeAndClose = Pair(6.00, 22.00))

        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName2,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            openTime = 6.00,
            closeTime = 22.00,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 15:00",
                null,
                "7:00 - 22:00",
                "9:00 - 23:00",
                "8:00 - 15:00",
                "8:00 - 15:00",
            )

        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName3,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            openTime = 6.00,
            closeTime = 22.00,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.American,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop()

        )
    )

    private val subCategory2 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName4,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.American
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName5,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.American
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName6,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian
        )
    )

    private val subCategory3 = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName7,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName8,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName9,
            subCategoryPicture = R.drawable.mitsuha,
            subCategoryDaysShopOpened = R.string.goodPlacesSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian
        )
    )

    val SubCategories = mapOf(
        MainCategories.GoodPlaces.Categories[0] to subCategory1,

        MainCategories.GoodPlaces.Categories[1] to subCategory2,

        MainCategories.GoodPlaces.Categories[2] to subCategory3
    )
}