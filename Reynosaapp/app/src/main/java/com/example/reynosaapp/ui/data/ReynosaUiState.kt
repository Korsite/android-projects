package com.example.reynosaapp.ui.data

import androidx.annotation.StringRes
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.mainProvider
import java.util.Calendar

data class ReynosaUiState(
    @StringRes val subject: Int = R.string.good_places,
    @StringRes val currentMainCategoryName: Int = R.string.good_places,
    val currentMainCategory: MainCategories = MainCategories.GoodPlaces,

    val currentCategory: Int = 0,

    val currentItem: ItemData = ItemData(R.string.useForNoThing, R.drawable.usefornothing),


    val currentTime: Calendar = Calendar.getInstance(),

    val extraOptionsForGoodPlaces: MutableList<ExtraCategoriesForGoodPlaces> = mutableStateListOf(),

    val filter : List<SubCategoryData> = emptyList<SubCategoryData>().toMutableStateList(),
    val filtersToShow: SnapshotStateList<Boolean> = List(12){false}.toMutableStateList(),
    val isShowingFilters : Boolean = false
) {

    val currentCategories by lazy { mainProvider.Categories[currentMainCategory]!! }

    val currentSubCategories by lazy {
        // to fix expanded size when initializing
       if(currentCategory != 0) mainProvider.SubCategories[currentCategory]!!
        else mainProvider.SubCategories[R.string.goodPlacesCategoryName1]!!
    }

    val showingSubCategories: Boolean by lazy { currentCategory != 0 }
    val showingAnItem: Boolean by lazy {
        currentItem != ItemData(
            R.string.useForNoThing,
            R.drawable.usefornothing
        )
    }
}
