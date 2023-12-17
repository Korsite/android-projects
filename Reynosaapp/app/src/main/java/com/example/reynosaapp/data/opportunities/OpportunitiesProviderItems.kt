package com.example.reynosaapp.data.opportunities

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.opportunities.extraCategories.items.Education
import com.example.reynosaapp.data.opportunities.extraCategories.items.Work
import com.example.reynosaapp.data.takeAListOfSubCategoriesAndItemInstanceAndReturnAMap

object OpportunitiesProviderItems {
    private val allSubCategories =
        OpportunitiesProviderSubCategories.subCategories.flatMap { it.value }

    private val allItems = Education.subCategoryEducationItems
        .plus(Work.subCategoryWorkItems)


    val Items = takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
        allSubCategories = allSubCategories,
        allItems = allItems
    )
}
