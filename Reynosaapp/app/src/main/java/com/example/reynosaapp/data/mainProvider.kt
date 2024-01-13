package com.example.reynosaapp.data

import com.example.reynosaapp.R
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderCategories
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderItems
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderSubCategories
import com.example.reynosaapp.data.extrainfo.ExtraInformationProviderCategories
import com.example.reynosaapp.data.extrainfo.ExtraInformationProviderSubCategories
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderItems
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderSubCategories
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderCategories
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderItems
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderSubCategories

object mainProvider {
    private val goodPlacesCategories = GoodPlacesProviderCategories.Categories
    private val dangerousPlacesCategories = DangerousPlacesProviderCategories.Categories
    private val opportunitiesCategories = OpportunitiesProviderCategories.Categories
    private val extraInformationCategories = ExtraInformationProviderCategories.Categories

    private val allCategories =
        goodPlacesCategories
            .plus(dangerousPlacesCategories)
            .plus(opportunitiesCategories)
            .plus(extraInformationCategories)


    private val goodPlacesSubCategories = GoodPlacesProviderSubCategories.SubCategories
    private val dangerousPlacesSubCategories = DangerousPlacesProviderSubCategories.subCategories
    private val opportunitiesSubCategories = OpportunitiesProviderSubCategories.subCategories
    private val extraInfoSubCategories = ExtraInformationProviderSubCategories // val no necessary, cause we do not instances to display any list of any

    private val allSubCategories =
        goodPlacesSubCategories
            .plus(dangerousPlacesSubCategories)
            .plus(opportunitiesSubCategories)


    private val goodPlacesAllItems = GoodPlacesProviderItems.Items
    private val dangerousPlacesAllItems = DangerousPlacesProviderItems.Items
    private val opportunitiesAllItems = OpportunitiesProviderItems.Items

    val Categories = mapOf(
        MainCategories.GoodPlaces to goodPlacesCategories,
        MainCategories.DangerousPlaces to dangerousPlacesCategories,
        MainCategories.Opportunities to opportunitiesCategories,
        MainCategories.ExtraInfo to extraInformationCategories
    )

    val SubCategories = buildMap {
        val subCategories = buildList {
            MainCategories.GoodPlaces.Categories.forEach { add(it) }
            MainCategories.DangerousPlaces.Categories.forEach { add(it) }
            MainCategories.Opportunities.Categories.forEach { add(it) }
            MainCategories.ExtraInfo.Categories.forEach { add(it) }
        }
        allCategories.forEachIndexed { index, category ->
            val education = R.string.opportunitiesCategoryName1
            val work = R.string.opportunitiesCategoryName2


            if (category.categoryName == education) {
                val extraCategoriesForOpportunities =
                    ExtraCategoriesForOpportunities.Education.extraCategories
                extraCategoriesForOpportunities.forEachIndexed { index, extraCategory ->
                    put(
                        extraCategory,
                        opportunitiesSubCategories[extraCategoriesForOpportunities[index]].orEmpty()
                    )
                }
                return@forEachIndexed
            } else if (category.categoryName == work) {
                val extraCategoriesForOpportunities =
                    ExtraCategoriesForOpportunities.Work.extraCategories
                extraCategoriesForOpportunities.forEachIndexed { index, extraCategory ->
                    put(
                        extraCategory,
                        opportunitiesSubCategories[extraCategoriesForOpportunities[index]].orEmpty()
                    )
                }
                return@forEachIndexed
            }

            put(category.categoryName, allSubCategories[subCategories[index]].orEmpty())
        }
    }

    val Items =
        goodPlacesAllItems
            .plus(dangerousPlacesAllItems)
            .plus(opportunitiesAllItems)

}
/*

fun main (){
    mainProvider.allSubCategories.forEach{
        println(it)
    }
    println()
    mainProvider.allPlaces.forEach{
        println(it)
    }
}

 */