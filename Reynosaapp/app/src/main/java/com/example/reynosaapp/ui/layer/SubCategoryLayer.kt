package com.example.reynosaapp.ui.layer

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.withInfiniteAnimationFrameMillis
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.checkHowMinutesLefToClose
import com.example.reynosaapp.data.checkHowMuchTimeLeftToClose
import com.example.reynosaapp.data.checkHowMuchTimeLeftToOpen
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderSubCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderSubCategories
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderSubCategories
import com.example.reynosaapp.data.returnCloseAndOpenTimeOfTheShop
import com.example.reynosaapp.ui.HyperText
import com.example.reynosaapp.ui.choicesToFilterGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import java.util.Calendar

@Composable
fun subCategoryLayerLazyColumn(
    subCategories: List<SubCategoryData>,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
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
    Card(
        onClick = currentItem
    ) {
        when (reynosaUiState.currentMainCategory) {
            MainCategories.GoodPlaces -> subCategoryLayerForGoodPlaces(
                subCategory = subCategory,
                reynosaUiState = reynosaUiState,
                numberOfCard = numberOfCard
            )

            MainCategories.DangerousPlaces -> subCategoryLayerForDangerousPlaces(
                subCategory = subCategory
            )

            MainCategories.Opportunities -> subCategoryLayerForOpportunities(
                subCategory = subCategory,
            )

            else -> subCategoryLayerForExtraInfo(subCategory = subCategory)
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun subCategoryLayerForGoodPlaces(
    subCategory: SubCategoryData,
    reynosaUiState: ReynosaUiState,
    numberOfCard: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier

        ){
            Image(
                painter = painterResource(subCategory.subCategoryPicture),
                contentDescription = stringResource(subCategory.subCategoryName),
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .weight(1.5f)
                    .height(150.dp)
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
            ) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(subCategory.subCategoryName),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f)
                    )

                    Text(
                        text = numberOfCard.toString(),
                    )
                }

                HyperText(
                    link = subCategory.subCategoryGoogleMaps,
                    modifier = modifier
                )


                Text(
                    text = // if shop is opened
                    if (subCategory.isOpenedOrClosed == R.string.openedNow)
                        stringResource(
                            subCategory.isOpenedOrClosed,
                            checkHowMuchTimeLeftToClose(
                                checkHowMinutesLefToClose(
                                    returnCloseAndOpenTimeOfTheShop(subCategory.subCategoryCompleteSchedule).component1(),
                                    returnCloseAndOpenTimeOfTheShop(subCategory.subCategoryCompleteSchedule).component2(),
                                    reynosaUiState
                                )
                            )
                        )
                    else { // if shop is closed
                        val resourcesToDisplay =
                            checkHowMuchTimeLeftToOpen(
                                subCategory.subCategoryCompleteSchedule
                            )
                        stringResource(
                            subCategory.isOpenedOrClosed,
                            resourcesToDisplay.component1(),
                            resourcesToDisplay.component2()
                        )
                    },
                    style = MaterialTheme.typography.labelLarge

                )
            }
        }
    }
}

@Composable
fun subCategoryLayerForDangerousPlaces(
    subCategory: SubCategoryData
) {
    Box {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(2f)
            ) {
                Text(
                    text = stringResource(subCategory.subCategoryName),
                )
                Text(
                    text = stringResource(subCategory.subCategoryContentDescription),
                    modifier = Modifier.align(Alignment.Start)
                )
            }
            Image(
                painter = painterResource(subCategory.subCategoryPicture),
                contentDescription = stringResource(subCategory.subCategoryName),
                modifier = Modifier.weight(2f),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun subCategoryLayerForOpportunities(
    subCategory: SubCategoryData,
) {
    Box {
        Row {
            Image(
                painter = painterResource(subCategory.subCategoryPicture),
                contentDescription = stringResource(subCategory.subCategoryName),
                modifier = Modifier
                    .weight(1.5f),
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
            ) {

                Text(
                    text = stringResource(subCategory.subCategoryName),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )


                Text(
                    text = stringResource(subCategory.subCategoryContentDescription),
                )

                Text(text = stringResource(subCategory.subCategoryIsPrivateOrPublic))

                HyperText(
                    link = subCategory.subCategoryGoogleMaps,
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun subCategoryLayerForExtraInfo(
    subCategory: SubCategoryData
) {
    Text(text = stringResource(subCategory.subCategoryContentDescription))
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForGoodPlaces() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForGoodPlaces(
                GoodPlacesProviderSubCategories.SubCategories[R.string.goodPlacesCategoryName1]?.get(17)
                    ?: SubCategoryData(-1, -1),
                reynosaUiState = ReynosaUiState(),
                numberOfCard = 0
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForDangerousPlaces() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForDangerousPlaces(
                DangerousPlacesProviderSubCategories.subCategories[R.string.dangerousPlacesCategoryName1]?.component1()
                    ?: SubCategoryData(R.string.useForNoThing, R.drawable.usefornothing)
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForOpportunities() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForOpportunities(
                OpportunitiesProviderSubCategories.subCategories[R.string.opportunitiesEducationExtraCategoryName1]?.component1()
                    ?: SubCategoryData(R.string.useForNoThing, R.drawable.usefornothing),
            )
        }
    }
}
