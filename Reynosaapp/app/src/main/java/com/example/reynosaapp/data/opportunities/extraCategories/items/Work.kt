package com.example.reynosaapp.data.opportunities.extraCategories.items

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.framework.SubCategoryData

/**
 *  Insert instances to write items
 *  Consider that, the same amount of instances in an internal val MUST BE the same amount of
 *  instances written in items
 *  @see com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Work
 */
object Work {
    private val subCategoryWork1Items = listOf<ItemData>()
    private val subCategoryWork2Items = listOf<ItemData>()
    private val subCategoryWork3Items = listOf<ItemData>()

    val subCategoryWorkItems =
        subCategoryWork1Items
            .plus(subCategoryWork2Items)
            .plus(subCategoryWork3Items)
}