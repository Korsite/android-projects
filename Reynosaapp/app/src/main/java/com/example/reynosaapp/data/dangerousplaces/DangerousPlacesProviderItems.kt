package com.example.reynosaapp.data.dangerousplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.takeAListOfSubCategoriesAndItemInstanceAndReturnAMap

object DangerousPlacesProviderItems {
    private val subCategory1Items = listOf(
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture1_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture1_2
        ),
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription2,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional2,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture2_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture2_2
        ),
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription3,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional3,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture3_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture3_2
        ),
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription4,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional4,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture4_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture4_2
        ),
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription5,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional6,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture5_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture5_2
        ),
        ItemData(
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription6,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional6,
            itemPictureOptional = R.drawable.dangerousplacescoloniesitempicture6_1,
            itemPictureOptional2 = R.drawable.dangerousplacescoloniesitempicture6_2
        )

    )

    private val subCategory2Items =  listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        )
    )

    private val subCategory3Items =  listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.dangerousPlacesSubCategoryItemDescription1,
            itemDescriptionOptional = R.string.dangerousPlacesSubCategoryItemDescriptionOptional1,
            itemPictureOptional = R.drawable.usefornothing
        )
    )

    private val allSubCategories =
        DangerousPlacesProviderSubCategories.subCategories.flatMap { it.value }

    private val allItems =
        subCategory1Items
            .plus(subCategory2Items)

    val Items = takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
        allSubCategories = allSubCategories,
        allItems = allItems
    )
}