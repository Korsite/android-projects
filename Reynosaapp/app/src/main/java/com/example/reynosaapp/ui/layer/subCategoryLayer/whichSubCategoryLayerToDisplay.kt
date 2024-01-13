package com.example.reynosaapp.ui.layer.subCategoryLayer

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.choicesToFilterGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState

@Composable
fun subCategoryLayerLazyColumn(
    subCategories: List<SubCategoryData>,
    reynosaUiState: ReynosaUiState,
    currentItem: (Int) -> Unit,
    onClickExtraOption: (Boolean, ExtraCategoriesForGoodPlaces) -> Unit,
    lazyGridState: LazyGridState,
    modifier: Modifier
) {

    if (reynosaUiState.currentCategory == R.string.goodPlacesCategoryName2) //if it's in restaurants
        LazyVerticalGrid(columns = GridCells.Adaptive(200.dp)) {
            itemsIndexed(ExtraCategoriesForGoodPlaces.values().toList()) { index, extraCategory ->
                AnimatedVisibility(
                    visible = reynosaUiState.isShowingFilters
                ) {
                    choicesToFilterGoodPlaces(
                        reynosaUiState = reynosaUiState,
                        onClickExtraOption = onClickExtraOption,
                        whichFilterToShow = index,
                        extraCategoryForGoodPlaces = extraCategory
                    )
                }
            }
        }
        if(reynosaUiState.currentMainCategory != MainCategories.ExtraInfo)
            LazyVerticalGrid(
                columns = GridCells.Adaptive(250.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                contentPadding = PaddingValues(10.dp),
                state = lazyGridState,
                modifier = modifier
            ) {

                itemsIndexed(
                    subCategories
                ) { index, subCategory ->

                    subCategoryLayer(
                        subCategory = subCategory,
                        reynosaUiState = reynosaUiState,
                        currentItem = { currentItem(subCategory.subCategoryName) },
                        numberOfCard = index + 1
                    )
                    // if var has no filter then we must ignore the 9 filters to start index 1 in the 1st restaurant
                }
            }
        else
            subCategoryLayerForExtraInfo(
                reynosaUiState = reynosaUiState,
                modifier = modifier
            )
}

/**
 * Choose which layer to display
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun subCategoryLayer(
    subCategory: SubCategoryData,
    reynosaUiState: ReynosaUiState,
    numberOfCard: Int,
    currentItem: () -> Unit
) {
        when (reynosaUiState.currentMainCategory) {
            MainCategories.GoodPlaces -> Card(onClick = currentItem){
                subCategoryLayerForGoodPlaces(
                    subCategory = subCategory,
                    reynosaUiState = reynosaUiState,
                    numberOfCard = numberOfCard
                )
            }

            MainCategories.DangerousPlaces -> Card(onClick = currentItem){
                subCategoryLayerForDangerousPlaces(
                    subCategory = subCategory,
                    numberOfCard = numberOfCard
                )
            }

            else ->  Card(onClick = currentItem){
                subCategoryLayerForOpportunities(
                    subCategory = subCategory,
                    numberOfCard = numberOfCard
                )
            }
        }
}