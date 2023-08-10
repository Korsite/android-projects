package com.example.reynosaapp.data

import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProvider
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderSubCategories

object mainProvider {
    private val goodPlacesCategories = GoodPlacesProviderCategories.Categories
    private val badPlacesCategories = DangerousPlacesProvider.Categories
    private val extraInformationCategories = extraInformationProvider.Categories

    private val allCategories = goodPlacesCategories.plus(badPlacesCategories)

    private val goodPlacesSubCategories = GoodPlacesProviderSubCategories.SubCategories
    private val dangerousPlacesSubCategories = DangerousPlacesProvider.SubCategories

    private val allSubCategories = goodPlacesSubCategories.plus(dangerousPlacesSubCategories)

    val allPlacesSubCategories = mapOf(
        MainCategories.GoodPlaces to goodPlacesCategories,
        MainCategories.DangerousPlaces to badPlacesCategories,
        MainCategories.ExtraInfo to extraInformationCategories
    )

    val allPlaces = buildMap {
        val subCategories = buildList {
            MainCategories.GoodPlaces.Categories.forEach {
                add(it)
            }

            MainCategories.DangerousPlaces.Categories.forEach {
                add(it)
            }

        }
            allCategories.forEachIndexed{ index, category ->
            put(category.categoryName, allSubCategories[subCategories[index]])
        }
    }
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