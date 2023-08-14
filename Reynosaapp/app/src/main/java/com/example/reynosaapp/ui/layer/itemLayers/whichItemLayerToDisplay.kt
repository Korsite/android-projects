package com.example.reynosaapp.ui.layer.itemLayers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.mainProvider
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

@Composable
fun itemLayerLazyColumn(
    item: ItemData,
    reynosaUiState: ReynosaUiState,
    windowsSize: WindowWidthSizeClass,
    modifier: Modifier
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(20.dp)
        ) {
            LazyColumn(modifier = modifier) {
                item {
                    itemLayerForGoodPlaces(
                        item = item,
                        windowsSize = windowsSize,
                        reynosaUiState = reynosaUiState,
                    )
                }
            }
        }
    }
}

@Composable
fun itemLayerForGoodPlaces(
    item: ItemData,
    windowsSize: WindowWidthSizeClass,
    reynosaUiState: ReynosaUiState,
) {
    when (reynosaUiState.currentMainCategory) {
        MainCategories.GoodPlaces -> itemLayerForGoodPlaces(
            item = item,
            windowsSize = windowsSize
        )

        MainCategories.DangerousPlaces -> itemLayerForDangerousPlaces(item = item)

        else -> itemLayerForOpportunities(item = item)
    }
}


@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForGoodPlaces() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForGoodPlacesForCompactSize(
                item = mainProvider.Items[R.string.goodPlacesSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForDangerousPlaces() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForDangerousPlaces(
                item = mainProvider.Items[R.string.dangerousPlacesSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForOpportunities() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemLayerForOpportunities(
                item = mainProvider.Items[R.string.goodPlacesSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing)
            )
        }
    }
}