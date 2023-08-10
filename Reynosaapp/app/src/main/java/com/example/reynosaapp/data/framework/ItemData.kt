package com.example.reynosaapp.data.framework

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.reynosaapp.R

data class ItemData(
    @StringRes val itemName: Int,
    @DrawableRes val itemPicture: Int,
    @StringRes val itemDescription: Int = R.string.useForNoThing,
    @StringRes val schedule: Int = R.string.useForNoThing,
    @StringRes val clickHere: Int = R.string.useForNoThing

)
