package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel

@Composable
fun categoryLayerLazyColumn(
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    currentCategory: (Int) -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    windowsSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ){
        val currentListOfSubCategory = reynosaUiState.currentCategories


        LazyVerticalGrid(
            columns = GridCells.Adaptive(250.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = modifier
                .padding(
                    start = 10.dp,
                    end = 10.dp
                    )
                .fillMaxWidth()
        ) {
            items(
                currentListOfSubCategory,
                key = { category -> category.categoryName }
            ) { category ->
                categoryLayer(
                    category = category,
                    onClick = { currentCategory(category.categoryName) },
                    extraCategories = category.extraCategoriesType,
                    reynosaViewModel = reynosaViewModel,
                    onClickExtraCategory = onClickExtraCategory,
                    reynosaUiState = reynosaUiState,
                    windowsSize = windowsSize,
                    cardSelected = category.categoryName == reynosaUiState.currentCategory
                )
            }
        }
    }
}


@Composable
fun categoryLayer(
    @StringRes extraCategories: List<Int>,
    category: CategoryData,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    onClick: () -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    windowsSize: WindowWidthSizeClass,
    cardSelected: Boolean,
    modifier: Modifier = Modifier
) {
    when (reynosaUiState.currentMainCategory) {
        MainCategories.Opportunities -> categoryLayerForOpportunities(
            category = category,
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            windowsSize = windowsSize,
        )

        MainCategories.ExtraInfo -> categoryLayerForExtraInfo(
            category = category,
            cardSelected = cardSelected,
            onClick = onClick
        )

        else -> categoryLayerForGoodPlacesBadPlaces(
            cardSelected = cardSelected,
            category = category,
            reynosaViewModel = reynosaViewModel,
            onClick = onClick
        )
    }
}





