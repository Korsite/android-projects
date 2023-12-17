package com.example.reynosaapp.ui.layer.itemLayers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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

/**
 * properties used from Item Data instance in Item Layer for Opportunities:
 * itemName
 * itemPicture
 * itemDescription
 * itemWebsite
 * itemGoogleMaps
 * itemPictureOptional
 * itemPictureOptional2
 *
 */
@Composable
fun itemLayerForOpportunities(
    item: ItemData,
    windowSize: WindowWidthSizeClass
) {
    when (windowSize) {
        WindowWidthSizeClass.Compact -> itemLayerForOpportunitiesForCompactSize(item = item)
        else -> itemLayerForOpportunitiesForMediumSize(item = item)
    }
}

@Composable
fun itemLayerForOpportunitiesForCompactSize(
    item: ItemData
) {
    Column {
        Image(
            painter = painterResource(item.itemPicture),
            contentDescription = stringResource(item.itemName),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = stringResource(item.itemDescription))

        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(item.itemPictureOptional),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier
                    .weight(1f),
                contentScale = ContentScale.Crop
            )

            Text(text = stringResource(item.itemDescriptionOptional))

            Spacer(modifier = Modifier.padding(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
            ) {

                if(item.itemWebsite != R.string.useForNoThing)
                    HyperText(link = item.itemWebsite, message = R.string.goToWebsite, modifier = Modifier)
                HyperText(link = item.itemGoogleMaps, message = R.string.clickHereToGoogleMaps, modifier = Modifier)

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

@Composable
fun itemLayerForOpportunitiesForMediumSize(
    item: ItemData
) {
    Row {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Image(
                painter = painterResource(item.itemPicture),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Text(text = stringResource(item.itemDescriptionOptional))

            Spacer(modifier = Modifier.padding(10.dp))

            if(item.itemWebsite != R.string.useForNoThing)
                HyperText(link = item.itemWebsite, message = R.string.goToWebsite, modifier = Modifier)

            Spacer(modifier = Modifier.padding(10.dp))

            HyperText(link = item.itemGoogleMaps, message = R.string.clickHereToGoogleMaps, modifier = Modifier)
        }
        Column(
            Modifier.weight(1f)
        ) {
            Text(text = stringResource(item.itemDescription))
            Image(
                painter = painterResource(item.itemPictureOptional),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(item.itemPictureOptional2),
                contentDescription = stringResource(item.itemName),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForOpportunitiesForCompactSize() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemLayerForOpportunities(
                item = mainProvider.Items[R.string.goodPlacesCoffeeShopSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowSize = WindowWidthSizeClass.Compact
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForOpportunitiesForMediumSize() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemLayerForOpportunities(
                item = mainProvider.Items[R.string.goodPlacesCoffeeShopSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowSize = WindowWidthSizeClass.Medium
            )
        }
    }
}