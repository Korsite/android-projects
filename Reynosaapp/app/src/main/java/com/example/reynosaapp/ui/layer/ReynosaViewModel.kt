package com.example.reynosaapp.ui.layer

import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.example.reynosaapp.data.MainCategories
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
                currentCategory = 0 // this means that no category is shown
            )
        }
    }

    fun updateCategory(currentCategory : Int){
        _uiState.update {currentState ->
            currentState.copy(
                currentCategory = currentCategory,
                subject = currentCategory
            )
        }
    }

}