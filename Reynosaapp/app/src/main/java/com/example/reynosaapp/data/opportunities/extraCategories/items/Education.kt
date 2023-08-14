package com.example.reynosaapp.data.opportunities.extraCategories.items

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData

object Education {
    private val kinderSubCategoryItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemWebsite = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        ),

        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemGoogleMaps = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        )
    )

    private val elementarySchoolSubCategoryItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemGoogleMaps = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        ),

        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemGoogleMaps = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        )
    )

    private val juniorHighSchoolSubCategoryItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemGoogleMaps = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        ),

        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.opportunitiesSubCategory1ItemDescription,
            itemGoogleMaps = R.string.opportunitiesSubCategory1ItemWebsite,
            itemPictureOptional = R.drawable.usefornothing,
            itemPictureOptional2 = R.drawable.usefornothing
        )
    )

    val subCategoryEducationItems =
        kinderSubCategoryItems
            .plus(elementarySchoolSubCategoryItems)
            .plus(juniorHighSchoolSubCategoryItems)

}