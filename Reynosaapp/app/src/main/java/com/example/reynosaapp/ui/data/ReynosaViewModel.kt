package com.example.reynosaapp.ui.data

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.lifecycle.ViewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.mainProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class ReynosaViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ReynosaUiState())
    val uiState = _uiState.asStateFlow()

    fun updateMainCategory(subject: Int, currentMainCategory: MainCategories) {
        _uiState.update { currentState ->
            currentState.extraOptionsForGoodPlaces.clear() // this is for clearing the filter
            currentState.copy(
                subject = subject,
                currentMainCategory = currentMainCategory,
                currentMainCategoryName = subject,
                currentCategory = 0, // this means that no category is shown
                filter = emptyList() // this is for clearing the filter
            )
        }
    }

    fun updateCategory(currentCategory: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                currentCategory = currentCategory,
                subject = currentCategory,
                currentItem = ItemData(
                    R.string.useForNoThing,
                    R.drawable.usefornothing
                ) // this means that no item  is shown
            )
        }
    }

    fun updateSubCategory(currentSubCategory: Int) {
        _uiState.update { currentState ->
            currentState.extraOptionsForGoodPlaces.clear() // this is for clearing the filter

            currentState.copy(
                currentItem = mainProvider.Items[currentSubCategory]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                subject = mainProvider.Items[currentSubCategory]?.itemName ?: R.string.useForNoThing
            )
        }
    }

    fun addOrRemoveExtraCategory(
        check: Boolean,
        currentExtraCategory: ExtraCategoriesForGoodPlaces
    ) {
        val currentCategory = _uiState.value.currentSubCategories

        _uiState.update { currentState ->
            val updateExtraOptionsForGoodPlaces = currentState.extraOptionsForGoodPlaces

            if(check) updateExtraOptionsForGoodPlaces.add(currentExtraCategory)
            else updateExtraOptionsForGoodPlaces.remove(currentExtraCategory)

            currentState.copy(
                extraOptionsForGoodPlaces = updateExtraOptionsForGoodPlaces,
                filter = currentCategory.filter { updateExtraOptionsForGoodPlaces.contains(it.subCategoryTypeOfRestaurant) }
            )
        }
    }

    fun updateFilterIsShow(){
        _uiState.update { currentState->
            currentState.copy(
                isShowingFilters = !currentState.isShowingFilters
            )
        }
    }

    fun initiliazeCompactAndMediumSize(){
        _uiState.update {currentState ->
            currentState.copy(
                currentCategory = 0
            )
        }
    }

}