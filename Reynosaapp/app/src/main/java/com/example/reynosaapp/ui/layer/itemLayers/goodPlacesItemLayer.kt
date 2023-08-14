package com.example.reynosaapp.ui.layer.itemLayers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.ui.HyperText

enum class DAYS_OF_THE_WEEK {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

@Composable
fun itemLayerForGoodPlaces(
    item: ItemData,
    windowsSize: WindowWidthSizeClass
){
    when(windowsSize){
        WindowWidthSizeClass.Compact -> itemLayerForGoodPlacesForCompactSize(item = item)
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
fun itemLayerForGoodPlacesForMediumSize(){

}

@Composable
fun displayDaysOfTheWeekAndCompleteSchedule(
    item: ItemData
){

    item.itemSchedule.forEach { pairWhereComponent1IsDayAnd2IsHour ->
        Row {
            Text(
                text =
                if (pairWhereComponent1IsDayAnd2IsHour.second is String)
                    pairWhereComponent1IsDayAnd2IsHour.second as String
                else
                    stringResource(pairWhereComponent1IsDayAnd2IsHour.second as Int)
            )
        }
    }
}


