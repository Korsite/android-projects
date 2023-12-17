package com.example.reynosaapp.data.opportunities.extraCategories.items

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData

object Education {
    private val kinderSubCategoryItems = listOf(
        ItemData(
            itemDescription = R.string.opportunitiesItemDescriptionKinderGarden1,
            itemWebsite = R.string.opportunitiesItemKinderGardenWebSite1,
            itemPictureOptional = R.drawable.opportunitieskindergardenitempicture1_1,
            itemPictureOptional2 = R.drawable.opportunitieskindergardenitempicture1_2
   ),
        ItemData(
            itemDescription = R.string.opportunitiesItemDescriptionKinderGarden2,
            itemPictureOptional = R.drawable.opportunitieskindergardenitempicture2_1,
            itemPictureOptional2 = R.drawable.opportunitieskindergardenitempicture2_1
        ),
        ItemData(
            itemDescription = R.string.opportunitiesItemDescriptionKinderGarden3,
            itemWebsite = R.string.opportunitiesItemKinderGardenWebSite3,
            itemPictureOptional = R.drawable.opportunitieskindergardenitempicture3_1,
            itemPictureOptional2 = R.drawable.opportunitieskindergardenitempicture3_2
        ),
        ItemData(
            itemDescription = R.string.opportunitiesItemDescriptionKinderGarden4,
            itemPictureOptional = R.drawable.opportunitieskindergardenitempicture4_1,
            itemPictureOptional2 = R.drawable.opportunitieskindergardenitempicture4_2
        ),
        ItemData(
            itemDescription = R.string.opportunitiesItemDescriptionKinderGarden5,
            itemPictureOptional = R.drawable.opportunitieskindergardenitempicture5_1,
            itemPictureOptional2 = R.drawable.opportunitieskindergardenitempicture5_2
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