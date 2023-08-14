package com.example.reynosaapp.data.framework

import androidx.annotation.StringRes
import com.example.reynosaapp.R

enum class ExtraCategoriesForOpportunities(@StringRes val extraCategories: List<Int>) {
    Education(
        listOf(
            R.string.opportunitiesEducationExtraCategoryName1,
            R.string.opportunitiesEducationExtraCategoryName2,
            R.string.opportunitiesEducationExtraCategoryName3
        )
    ),

    Work(
        listOf(
            R.string.opportunitiesWorkExtraCategoryName1,
            R.string.opportunitiesWorkExtraCategoryName2,
            R.string.opportunitiesWorkExtraCategoryName3
        )
    )
}