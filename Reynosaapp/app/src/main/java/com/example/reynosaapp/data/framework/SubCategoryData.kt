package com.example.reynosaapp.data.framework

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop
import com.example.reynosaapp.data.returnCloseAndOpenTimeOfTheShop
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

    val subCategoryCompleteSchedule: List<Pair<String, Any>> = returnAPairDataTypeAboutTheScheduleOfAShop(
        openTimeAndClose = Pair(0.0, 0.0)
    ),

    @StringRes val isOpenedOrClosed: Int = returnIfShopIsCurrentlyOpenedOrClosed(
        returnCloseAndOpenTimeOfTheShop(subCategoryCompleteSchedule).component1(),
        returnCloseAndOpenTimeOfTheShop(subCategoryCompleteSchedule).component2(),
    ),


    val subCategoryTypeOfRestaurant: ExtraCategoriesForGoodPlaces = ExtraCategoriesForGoodPlaces.None
)