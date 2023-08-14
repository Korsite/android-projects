package com.example.reynosaapp.ui.layer

import androidx.lifecycle.ViewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.mainProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ReynosaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ReynosaUiState())
    val uiState = _uiState.asStateFlow()

    fun updateMainCategory(subject : Int, currentMainCategory: MainCategories){
        _uiState.update {currentState ->
            currentState.copy(
                subject = subject,
                currentMainCategory = currentMainCategory,
                currentMainCategoryName = subject,
                currentCategory = 0, // this means that no category is shown
         )
        }
    }

    fun updateCategory(currentCategory : Int){
        _uiState.update {currentState ->
            currentState.copy(
                currentCategory = currentCategory,
                subject = currentCategory,
                currentItem = ItemData(R.string.useForNoThing, R.drawable.usefornothing) // this means that no item  is shown
            )
        }
    }

    fun updateSubCategory(currentSubCategory : Int){
        _uiState.update { currentState ->
            currentState.copy(
                currentItem = mainProvider.Items[currentSubCategory] ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                subject = mainProvider.Items[currentSubCategory]?.itemName ?: R.string.useForNoThing
            )
        }
    }

    fun takeExtraCategories(extraCategoriesForOpportunities: ExtraCategoriesForOpportunities) : List<Int>{
        return extraCategoriesForOpportunities.extraCategories
    }

}