package com.example.reynosaapp.ui.layer

import androidx.annotation.StringRes
import com.example.reynosaapp.R
import com.example.reynosaapp.data.MainCategories
import com.example.reynosaapp.data.mainProvider
import java.util.Calendar

data class ReynosaUiState(
    @StringRes val subject : Int = R.string.good_places,
    @StringRes val currentMainCategoryName : Int = R.string.good_places,
    val currentMainCategory : MainCategories = MainCategories.GoodPlaces,

    val currentCategory : Int  = 0,

    val currentTime: Calendar = Calendar.getInstance()
){
    val currentCategories by lazy { mainProvider.allPlacesSubCategories[currentMainCategory]!! }
    val currentSubCategories by lazy { mainProvider.allPlaces[currentCategory]!! }

    val showingSubCategories : Boolean by lazy { currentCategory != 0 }
}