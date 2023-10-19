package com.example.reynosaapp.ui.layer

import android.content.SharedPreferences
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.categoryLayer.categoryLayerLazyColumn
import com.example.reynosaapp.ui.layer.itemLayers.itemLayerLazyColumn
import com.example.reynosaapp.ui.topBar
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun currentLayer(
    currentCategory: (Int) -> Unit,
    currentItem: (Int) -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    onClickExtraOption: (Boolean, ExtraCategoriesForGoodPlaces) -> Unit,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences,
    modifier: Modifier,
) {
    val scrollPosition = when (reynosaUiState.currentCategory) {
        R.string.goodPlacesCategoryName1 -> rememberScrollPositionForCoffeeShops.getInt(
            "scroll_position",
            0
        )

        R.string.goodPlacesCategoryName2 -> rememberScrollPositionForRestaurants.getInt(
            "scroll_position",
            0
        )

        R.string.goodPlacesCategoryName3 -> rememberScrollPositionForCoffeeShops.getInt(
            "scroll_position",
            0
        )

        R.string.goodPlacesCategoryName4 -> rememberScrollPositionForCoffeeShops.getInt(
            "scroll_position",
            0
        )

        else -> rememberScrollPositionForCoffeeShops.getInt("scroll_position", 0)
    }

    val lazyGridStateForCoffeeShops = rememberLazyGridState(
        initialFirstVisibleItemIndex = scrollPosition
    )

    val lazyGridStateForRestaurants = rememberLazyGridState(
        initialFirstVisibleItemIndex = scrollPosition
    )

    when (reynosaUiState.currentCategory) {
        R.string.goodPlacesCategoryName1 -> coroutineToEditLazyGridState(
            lazyGridStateToEdit = lazyGridStateForCoffeeShops,
            variableToSaveTheData = rememberScrollPositionForCoffeeShops
        )

        R.string.goodPlacesCategoryName2 -> coroutineToEditLazyGridState(
            lazyGridStateToEdit = lazyGridStateForRestaurants,
            variableToSaveTheData = rememberScrollPositionForRestaurants
        )
    }


// <----------------------------------------- If it is compact or medium size ---------------------------------->
    if (windowsSize != WindowWidthSizeClass.Expanded)
        if (!reynosaUiState.showingSubCategories)
            categoryLayerLazyColumn(
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                currentCategory = currentCategory,
                onClickExtraCategory = onClickExtraCategory,
                windowsSize = windowsSize,
                modifier = modifier
            )
        else if (!reynosaUiState.showingAnItem)
            subCategoryLayerLazyColumn(
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                subCategories =
                if (reynosaUiState.filtersToShow.any { it }) reynosaUiState.filter
                else reynosaUiState.currentSubCategories,
                currentItem = currentItem,
                onClickExtraOption = onClickExtraOption,
                lazyGridState = when (reynosaUiState.currentCategory) {
                    R.string.goodPlacesCategoryName1 -> lazyGridStateForCoffeeShops
                    else -> lazyGridStateForRestaurants
                },
                modifier = modifier
            )
        else
            itemLayerLazyColumn(
                item = reynosaUiState.currentItem,
                reynosaUiState = reynosaUiState,
                modifier = modifier,
                windowsSize = windowsSize
            )
    else
// <----------------------------------------- If it is expanded size ---------------------------------------->
        Row {
            categoryLayerLazyColumn(
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                currentCategory = currentCategory,
                onClickExtraCategory = onClickExtraCategory,
                windowsSize = windowsSize,
                modifier = Modifier.weight(1f)
            )

            Column(
                Modifier.weight(1f)
            ) {

                topBar(
                    subject = stringResource(reynosaUiState.subject),
                    reynosaUiState = reynosaUiState,
                    reynosaViewModel = reynosaViewModel,
                    windowsSize = windowsSize
                )

                if (!reynosaUiState.showingAnItem) {
                    subCategoryLayerLazyColumn(
                        reynosaUiState = reynosaUiState,
                        reynosaViewModel = reynosaViewModel,
                        subCategories =
                        if (reynosaUiState.filtersToShow.any { it }) reynosaUiState.filter
                        else reynosaUiState.currentSubCategories,
                        currentItem = currentItem,
                        onClickExtraOption = onClickExtraOption,
                        lazyGridState = when (reynosaUiState.currentCategory) {
                            R.string.goodPlacesCategoryName1 -> lazyGridStateForCoffeeShops
                            else -> lazyGridStateForRestaurants
                        },
                        modifier = Modifier
                    )
                } else
                    itemLayerLazyColumn(
                        item = reynosaUiState.currentItem,
                        reynosaUiState = reynosaUiState,
                        modifier = modifier,
                        windowsSize = windowsSize
                    )
            }

        }
}

/**
 * This is useful to save the first index shown in the lazy column in a variable type of Shared Preference
 */
@Composable
fun coroutineToEditLazyGridState(
    lazyGridStateToEdit: LazyGridState,
    variableToSaveTheData: SharedPreferences
) {
    LaunchedEffect(lazyGridStateToEdit) {
        snapshotFlow {
            lazyGridStateToEdit.firstVisibleItemIndex
        }
            .debounce(500L)

            .collectLatest { index ->

                variableToSaveTheData.edit()
                    .putInt("scroll_position", index)
                    .apply()
            }
    }
}