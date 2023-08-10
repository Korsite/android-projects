package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.data.framework.ItemData

object GoodPlacesProviderItems {
    val subCategoriesIndexes = GoodPlacesProviderSubCategories.SubCategories.flatMap { it.value }
    val Items = buildMap {
        for(subCategoryIndex in subCategoriesIndexes) {
            put(
                subCategoryIndex.subCategoryName,
                ItemData(
                    subCategoryIndex.subCategoryName,
                    subCategoryIndex.subCategoryPicture,
                )
            )
        }
    }
}

fun main() {
    GoodPlacesProviderItems.Items.forEach{ index, it ->
        println("$index -> $it")
        println()
    }
}