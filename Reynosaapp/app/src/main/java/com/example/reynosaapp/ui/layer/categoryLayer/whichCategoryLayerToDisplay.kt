package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.data.ReynosaUiState

@Composable
fun categoryLayerLazyColumn(
    reynosaUiState: ReynosaUiState,
    currentCategory: (Int) -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    windowsSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ){
        val currentListOfCategories = reynosaUiState.currentCategories


        LazyVerticalGrid(
            columns = GridCells.Adaptive(250.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = modifier
                .padding(
                    start = if(windowsSize != WindowWidthSizeClass.Expanded) 10.dp else 0.dp,
                    end = if(windowsSize != WindowWidthSizeClass.Expanded) 10.dp else 0.dp,
                    )
                .fillMaxWidth()
        ) {
            items(
                currentListOfCategories,
                key = { category -> category.categoryName }
            ) { category ->
                categoryLayer(
                    extraCategories = category.extraCategoriesType,
                    category = category,
                    reynosaUiState = reynosaUiState,
                    onClick = { currentCategory(category.categoryName) },
                    onClickExtraCategory = onClickExtraCategory,
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
    onClick: () -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    windowsSize: WindowWidthSizeClass,
    cardSelected: Boolean
) {
    when (reynosaUiState.currentMainCategory) {
        MainCategories.Opportunities -> categoryLayerForOpportunities(
            extraCategories = extraCategories,
            category = category,
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
            onClick = onClick
        )
    }
}





