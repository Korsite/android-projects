package com.example.reynosaapp.ui.layer

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.reynosaapp.data.framework.extraOptions.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.categoryLayer.categoryLayerLazyColumn
import com.example.reynosaapp.ui.layer.itemLayers.itemLayerLazyColumn


@Composable
fun currentLayer(
    currentCategory: (Int) -> Unit,
    currentItem: (Int) -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    onClickExtraOption: (Boolean, ExtraCategoriesForGoodPlaces) -> Unit,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    windowsSize: WindowWidthSizeClass,
    modifier: Modifier,
) {
    if (!reynosaUiState.showingSubCategories)
        categoryLayerLazyColumn(
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            currentCategory = currentCategory,
            onClickExtraCategory = onClickExtraCategory,
            modifier = modifier
        )
    else if (!reynosaUiState.showingAnItem)
        subCategoryLayerLazyColumn(
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            subCategories =
            if (reynosaUiState.extraOptionsForGoodPlaces.isNotEmpty()) reynosaUiState.filter
            else reynosaUiState.currentSubCategories,
            currentItem = currentItem,
            onClickExtraOption = onClickExtraOption,
            modifier = modifier
        )
    else
        itemLayerLazyColumn(
            item = reynosaUiState.currentItem,
            reynosaUiState = reynosaUiState,
            modifier = modifier,
            windowsSize = windowsSize
        )
}