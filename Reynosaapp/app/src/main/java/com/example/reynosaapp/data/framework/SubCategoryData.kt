package com.example.reynosaapp.data.framework

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.extraOptions.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop
import com.example.reynosaapp.data.returnIfShopIsCurrentlyOpenedOrClosed

data class SubCategoryData(
    @StringRes val subCategoryName: Int,
    @DrawableRes val subCategoryPicture: Int,
    @StringRes val subCategoryContentDescription: Int = R.string.useForNoThing,
    @StringRes val subCategoryIsPrivateOrPublic: Int = R.string.useForNoThing,
    @StringRes val subCategoryDaysShopOpened: Int = R.string.useForNoThing,
    @StringRes val subCategoryGoogleMaps: Int = R.string.useForNoThing,
    @StringRes val subCategoryWebsite: Int = R.string.useForNoThing,
    @StringRes val subCategoryAvailableNow: Int = R.string.useForNoThing,
    val openTime: Double = 0.0,
    val closeTime: Double = 0.0,

    @StringRes val isOpenedOrClosed: Int =
        if (openTime == 0.0) R.string.useForNoThing
        else returnIfShopIsCurrentlyOpenedOrClosed(
            openTime,
            closeTime
        ),
    val subCategoryCompleteSchedule: List<Pair<String, Any>> = returnAPairDataTypeAboutTheScheduleOfAShop(
        openTimeAndClose = Pair(openTime, closeTime)
    ),

    val subCategoryTypeOfRestaurant: ExtraCategoriesForGoodPlaces = ExtraCategoriesForGoodPlaces.None
)