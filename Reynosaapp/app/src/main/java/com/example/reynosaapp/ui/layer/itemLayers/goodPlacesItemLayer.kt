package com.example.reynosaapp.ui.layer.itemLayers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.mainProvider
import com.example.reynosaapp.ui.HyperText
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

enum class DAYS_OF_THE_WEEK {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

@Composable
fun itemLayerForGoodPlaces(
    item: ItemData,
    windowsSize: WindowWidthSizeClass
) {
    when (windowsSize) {
        WindowWidthSizeClass.Compact -> itemLayerForGoodPlacesForCompactSize(item = item)
        else -> itemLayerForGoodPlacesForMediumSize(item = item)
    }
}

@Composable
fun itemLayerForGoodPlacesForCompactSize(
    item: ItemData,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Text(text = stringResource(item.itemDaysShopOpened))

        Image(
            painter = painterResource(item.itemPicture),
            contentDescription = stringResource(item.itemName),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        )

        Text(text = stringResource(item.itemDescription))

        displayDaysOfTheWeekAndCompleteSchedule(item = item)

        HyperText(link = item.itemGoogleMaps, modifier = Modifier)
    }
}

@Composable
fun itemLayerForGoodPlacesForMediumSize(
    item: ItemData
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(item.itemDaysShopOpened))

        Row {
            Image(
                painter = painterResource(item.itemPicture),
                contentDescription = stringResource(item.itemName),
                contentScale = ContentScale.Crop,
                modifier = Modifier.weight(1f)
            )
            
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                Text(text = stringResource(item.itemDescription))

                Spacer(modifier = Modifier.padding(10.dp))

                HyperText(link = item.itemGoogleMaps, modifier = Modifier)
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        displayDaysOfTheWeekAndCompleteSchedule(item = item)
    }
}

@Composable
fun displayDaysOfTheWeekAndCompleteSchedule(
    item: ItemData
) {
    item.itemSchedule.forEach { pairWhereComponent1IsDayAnd2IsHour ->
        Row(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(text = pairWhereComponent1IsDayAnd2IsHour.component1(), Modifier.weight(1f))

            Text(
                text =
                if (pairWhereComponent1IsDayAnd2IsHour.second is String)
                    pairWhereComponent1IsDayAnd2IsHour.second as String
                else
                    stringResource(pairWhereComponent1IsDayAnd2IsHour.second as Int),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewItemLayerForGoodPlacesForCompactSize() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForGoodPlaces(
                item = mainProvider.Items[R.string.goodPlacesCoffeeShopSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowsSize = WindowWidthSizeClass.Compact
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewItemLayerForGoodPlacesForMediumSize() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForGoodPlaces(
                item = mainProvider.Items[R.string.goodPlacesCoffeeShopSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowsSize = WindowWidthSizeClass.Medium
            )
        }
    }
}
