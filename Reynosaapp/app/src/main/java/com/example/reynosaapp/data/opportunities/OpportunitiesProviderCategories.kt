package com.example.reynosaapp.data.opportunities

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.framework.CategoryData

object OpportunitiesProviderCategories {
    val Categories = listOf(
        CategoryData(
            R.string.opportunitiesCategoryName1,
            R.string.opportunitiesCategoryDescription1,
            R.drawable.opportunitieseducation,
            ExtraCategoriesForOpportunities.Education.extraCategories
        ),

        CategoryData(
            R.string.opportunitiesCategoryName2,
            R.string.opportunitiesCategoryDescription2,
            R.drawable.work,
            ExtraCategoriesForOpportunities.Work.extraCategories
        )
    )
}