package com.example.reynosaapp.ui.layer

import androidx.annotation.StringRes
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.mainProvider
import java.util.Calendar

data class ReynosaUiState(
    @StringRes val subject: Int = R.string.good_places,
    @StringRes val currentMainCategoryName: Int = R.string.good_places,
    val currentMainCategory: MainCategories = MainCategories.GoodPlaces,

    val currentCategory: Int = 0,

    val currentItem: ItemData = ItemData(R.string.useForNoThing, R.drawable.usefornothing),


    val currentTime: Calendar = Calendar.getInstance()
) {
    val currentCategories by lazy { mainProvider.Categories[currentMainCategory]!! }

    val currentSubCategories by lazy { mainProvider.SubCategories[currentCategory]!! }

    val showingSubCategories: Boolean by lazy { currentCategory != 0 }
    val showingAnItem: Boolean by lazy {
        currentItem != ItemData(
                R.string.useForNoThing,
                R.drawable.usefornothing
            )
    }
}