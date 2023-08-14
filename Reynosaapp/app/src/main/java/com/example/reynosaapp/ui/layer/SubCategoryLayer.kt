package com.example.reynosaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.checkHowMinutesLefToClose
import com.example.reynosaapp.data.checkHowMuchTimeLeftToClose
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderSubCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderSubCategories
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderSubCategories
import com.example.reynosaapp.ui.layer.ReynosaUiState
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import java.util.Calendar

@Composable
fun subCategoryLayerLazyColumn(
    subCategories: List<SubCategoryData>,
    reynosaUiState: ReynosaUiState,
    currentItem: (Int) -> Unit,
    modifier: Modifier
) {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .padding(10.dp)

    ) {
        items(subCategories) { subCategory ->
            subCategoryLayer(
                subCategory = subCategory,
                reynosaUiState = reynosaUiState,
                currentItem = { currentItem(subCategory.subCategoryName) }
            )
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
    currentItem: () -> Unit
) {
    Card(
        onClick = currentItem
    ) {
        when (reynosaUiState.currentMainCategory) {
            MainCategories.GoodPlaces -> subCategoryLayerForGoodPlaces(
                subCategory = subCategory,
                reynosaUiState = reynosaUiState,
            )

            MainCategories.DangerousPlaces -> subCategoryLayerForDangerousPlaces(
                subCategory = subCategory
            )

            MainCategories.Opportunities -> subCategoryLayerForOpportunities(
                subCategory = subCategory,
            )

            else ->
                subCategoryLayerForExtraInfo(subCategory = subCategory)
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun subCategoryLayerForGoodPlaces(
    subCategory: SubCategoryData,
    reynosaUiState: ReynosaUiState,
    modifier: Modifier = Modifier
) {
    val getInstance = reynosaUiState.currentTime
    val currentTime =
        getInstance[Calendar.HOUR_OF_DAY].toDouble() + getInstance[Calendar.MINUTE].toDouble() / 100

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
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
                    text = stringResource(subCategory.subCategorySchedule),
                )

                HyperText(
                    link = subCategory.subCategoryGoogleMaps,
                    modifier = modifier
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = stringResource(
                        subCategory.isOpenedOrClosed,
                        checkHowMuchTimeLeftToClose(
                            checkHowMinutesLefToClose(currentTime, subCategory.closeTime)
                        ),
                    )
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
                modifier = Modifier.weight(1.5f),
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
                GoodPlacesProviderSubCategories.SubCategories[R.string.goodPlacesCategoryName1]?.component1()
                    ?: SubCategoryData(-1, -1),
                reynosaUiState = ReynosaUiState(),
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
