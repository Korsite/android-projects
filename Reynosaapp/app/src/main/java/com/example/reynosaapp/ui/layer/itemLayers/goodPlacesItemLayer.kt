package com.example.reynosaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
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
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.mainProvider
import com.example.reynosaapp.ui.layer.ReynosaUiState
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

enum class DaysOfTheWeek {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

val DAYS_OF_THE_WEEK = DaysOfTheWeek.values()

@Composable
fun itemLayerLazyColumn(
    item: ItemData,
    reynosaUiState: ReynosaUiState,
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
                    itemLayer(
                        item = item,
                        reynosaUiState = reynosaUiState,
                    )
                }
            }
        }
    }
}

@Composable
fun itemLayer(
    item: ItemData,
    reynosaUiState: ReynosaUiState,
) {
    when (reynosaUiState.currentMainCategory) {
        MainCategories.GoodPlaces -> itemLayerForGoodPlaces(
            item = item,
        )

        MainCategories.DangerousPlaces -> itemLayerForDangerousPlaces(item = item)

        else -> itemLayerForOpportunities(item = item)
    }
}

@Composable
fun itemLayerForGoodPlaces(
    item: ItemData,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Text(text = stringResource(item.itemSchedule))

        Image(
            painter = painterResource(item.itemPicture),
            contentDescription = stringResource(item.itemName),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        )

        Text(text = stringResource(item.itemDescription))

        DAYS_OF_THE_WEEK.forEach {
            Text(
                text = it.name,
                modifier = Modifier.align(Alignment.Start)
            )
        }

        HyperText(link = item.itemGoogleMaps, modifier = Modifier)
    }
}



@Composable
fun itemLayerForDangerousPlaces(
    item: ItemData
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(item.itemPicture),
            contentDescription = stringResource(item.itemName),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )

        Text(text = stringResource(item.itemDescription))
        Row {
            Image(
                painter = painterResource(item.itemPictureOptional),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier.weight(1f),
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(item.itemDescriptionOptional),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
fun itemLayerForOpportunities(
    item: ItemData,
) {
    Column {
        Image(
            painter = painterResource(item.itemPicture),
            contentDescription = stringResource(item.itemName),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = stringResource(item.itemDescription))

        Row(modifier = Modifier) {
            Image(
                painter = painterResource(item.itemPicture),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier
                    .weight(1f),
                contentScale = ContentScale.Crop
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
            ) {

                HyperText(link = item.itemWebsite, modifier = Modifier)
                HyperText(link = item.itemGoogleMaps, modifier = Modifier)

                Image(
                    painter = painterResource(item.itemPictureOptional2),
                    contentDescription = stringResource(item.itemName),
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
            }
        }
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
            itemLayerForGoodPlaces(
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