package com.example.reynosaapp.data.dangerousplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.takeAListOfSubCategoriesAndItemInstanceAndReturnAMap

object DangerousPlacesProviderItems {
    private val subCategory1Items = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        )
    )

    private val subCategory2Items =  listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        )
    )

    private val subCategory3Items =  listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategory1ItemDescription,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategory1ItemDescriptionOptional,
            itemPictureOptional = R.drawable.usefornothing
        )
    )

    private val allSubCategories =
        DangerousPlacesProviderSubCategories.subCategories.flatMap { it.value }

    private val allItems =
        subCategory1Items
            .plus(subCategory2Items)
            .plus(subCategory3Items)

    val Items = takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
        allSubCategories = allSubCategories,
        allItems = allItems
    )

}