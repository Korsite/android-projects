package com.example.reynosaapp.ui.layer

import android.content.SharedPreferences
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.categoryLayer.categoryLayerLazyColumn
import com.example.reynosaapp.ui.layer.itemLayers.itemLayerLazyColumn
import com.example.reynosaapp.ui.layer.subCategoryLayer.subCategoryLayerLazyColumn
import com.example.reynosaapp.ui.topBar
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce


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
    rememberScrollPositionForParks: SharedPreferences,

    onClickSwitchMode: () -> Unit,
    isInDarkTheme: Boolean,
    modifier: Modifier,
) {

    val listOfScrollPosition = listOf(
        rememberScrollPositionForCoffeeShops.getInt("rememberPositionForCoffeeShops", 0),
        rememberScrollPositionForRestaurants.getInt("rememberPositionForRestaurants", 0),
        rememberScrollPositionForParks.getInt("rememberPositionForParks", 0)
    )

    val listOfGridStates = listOf(
        rememberLazyGridState(initialFirstVisibleItemIndex = listOfScrollPosition[0]),
        rememberLazyGridState(initialFirstVisibleItemIndex = listOfScrollPosition[1]),
        rememberLazyGridState(initialFirstVisibleItemIndex = listOfScrollPosition[2])
    )

    when (reynosaUiState.currentCategory) {
        R.string.goodPlacesCategoryName1 -> coroutineToEditLazyGridState(
            lazyGridStateToEdit = listOfGridStates[0],
            variableToSaveTheData = rememberScrollPositionForCoffeeShops,
            name = "rememberPositionForCoffeeShops"
        )

        R.string.goodPlacesCategoryName2 -> coroutineToEditLazyGridState(
            lazyGridStateToEdit = listOfGridStates[1],
            variableToSaveTheData = rememberScrollPositionForRestaurants,
            name = "rememberPositionForRestaurants"

        )
        R.string.goodPlacesCategoryName4 -> coroutineToEditLazyGridState(
            lazyGridStateToEdit = listOfGridStates[2],
            variableToSaveTheData = rememberScrollPositionForRestaurants,
            name = "rememberPositionForParks"

        )
    }

    val getTheCorrectGridState: (Int) -> LazyGridState = {
        when(it){
            R.string.goodPlacesCategoryName1 -> listOfGridStates[0]
            R.string.goodPlacesCategoryName2 -> listOfGridStates[1]
            else -> listOfGridStates[2]
        }
    }


// <----------------------------------------- If it is compact or medium size ---------------------------------->
    if (windowsSize != WindowWidthSizeClass.Expanded)
        if (!reynosaUiState.showingSubCategories)
            categoryLayerLazyColumn(
                reynosaUiState = reynosaUiState,
                currentCategory = currentCategory,
                onClickExtraCategory = onClickExtraCategory,
                windowsSize = windowsSize,
                modifier = modifier
            )
        else if (!reynosaUiState.showingAnItem)
            subCategoryLayerLazyColumn(
                reynosaUiState = reynosaUiState,
                subCategories =
                if (reynosaUiState.filtersToShow.any { it }) reynosaUiState.filter
                else reynosaUiState.currentSubCategories,
                currentItem = currentItem,
                onClickExtraOption = onClickExtraOption,
                lazyGridState = getTheCorrectGridState(reynosaUiState.currentCategory),
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
                currentCategory = currentCategory,
                onClickExtraCategory = onClickExtraCategory,
                windowsSize = windowsSize,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 15.dp)
            )

            Column(
                Modifier.weight(1.3f)
            ) {

                topBar(
                    subject = stringResource(reynosaUiState.subject),
                    reynosaUiState = reynosaUiState,
                    reynosaViewModel = reynosaViewModel,
                    windowsSize = windowsSize,
                    onClickSwitchMode = onClickSwitchMode,
                    isInDarkTheme = isInDarkTheme
                )

                if (!reynosaUiState.showingAnItem) {
                    subCategoryLayerLazyColumn(
                        reynosaUiState = reynosaUiState,
                        subCategories =
                        if (reynosaUiState.filtersToShow.any { it }) reynosaUiState.filter
                        else reynosaUiState.currentSubCategories,
                        currentItem = currentItem,
                        onClickExtraOption = onClickExtraOption,
                        lazyGridState = getTheCorrectGridState(reynosaUiState.currentCategory),
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
    variableToSaveTheData: SharedPreferences,
    name: String
) {
    LaunchedEffect(lazyGridStateToEdit) {
        snapshotFlow {
            lazyGridStateToEdit.firstVisibleItemIndex
        }
            .debounce(500L)

            .collectLatest { index ->

                variableToSaveTheData.edit()
                    .putInt(name, index)
                    .apply()
            }
    }
}