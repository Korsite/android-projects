package com.example.reynosaapp.data.goodplaces

import androidx.core.graphics.translationMatrix
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop
import com.example.reynosaapp.data.takeAListOfSubCategoriesAndItemInstanceAndReturnAMap

/**
 * if itemSchedule is not given, every day schedule will be equal to the schedule given in SubCategory Instances
 */
object GoodPlacesProviderItems {

    private val subCategory1Items = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,
            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription2,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription3,

            )
    )

    private val subCategory2Items = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription2,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription3,

            )
    )

    private val subCategory3Items = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription2,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription3,

            )
    )

    private val allSubCategories =
        GoodPlacesProviderSubCategories.SubCategories.flatMap { it.value }

    private val allItems =
        subCategory1Items
            .plus(subCategory2Items)
            .plus(subCategory3Items)

    val Items = takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
        allSubCategories = allSubCategories,
        allItems = allItems
    )
}
