package com.example.reynosaapp.data.opportunities

import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Education.elementarySchoolSubCategory
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Education.juniorHighSchoolSubCategory
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Education.kinderSubCategory
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Work.subCategoryWork1
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Work.subCategoryWork2
import com.example.reynosaapp.data.opportunities.extraCategories.subCategory.Work.subCategoryWork3

object OpportunitiesProviderSubCategories {
    val subCategories = mapOf(
        ExtraCategoriesForOpportunities.Education.extraCategories[0] to kinderSubCategory,
        ExtraCategoriesForOpportunities.Education.extraCategories[1] to elementarySchoolSubCategory,
        ExtraCategoriesForOpportunities.Education.extraCategories[2] to juniorHighSchoolSubCategory,

        ExtraCategoriesForOpportunities.Work.extraCategories[0] to subCategoryWork1,
        ExtraCategoriesForOpportunities.Work.extraCategories[1] to subCategoryWork2,
        ExtraCategoriesForOpportunities.Work.extraCategories[2] to subCategoryWork3
    )
}