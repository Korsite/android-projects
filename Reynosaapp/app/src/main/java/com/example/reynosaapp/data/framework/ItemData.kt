package com.example.reynosaapp.data.framework

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.reynosaapp.R

data class ItemData(
    @StringRes val itemName: Int = R.string.useForNoThing,
    @DrawableRes val itemPicture: Int = R.drawable.usefornothing,
    @StringRes val itemDescription: Int = R.string.useForNoThing,
    @StringRes val itemDescriptionOptional : Int = R.string.useForNoThing,
    @StringRes val itemDaysShopOpened: Int = R.string.useForNoThing,
    @StringRes val itemGoogleMaps: Int = R.string.useForNoThing,
    @StringRes val itemWebsite: Int = R.string.useForNoThing,
    @DrawableRes val itemPictureOptional :Int = R.drawable.usefornothing,
    @DrawableRes val itemPictureOptional2 :Int = R.drawable.usefornothing,

    val itemSchedule : List<Pair<String, Any>> = emptyList(),
)
