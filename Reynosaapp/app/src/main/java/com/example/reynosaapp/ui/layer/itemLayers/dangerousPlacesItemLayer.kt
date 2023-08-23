package com.example.reynosaapp.ui.layer.itemLayers

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
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
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.mainProvider
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

/**
 * properties used from Item Data instance in Item Layer for Dangerous Places:
 * itemName
 * itemPicture
 * itemDescription
 * itemPictureOptional1
 * itemDescriptionOptional
 */
@Composable
fun itemLayerForDangerousPlaces(
    item: ItemData,
    windowsSize: WindowWidthSizeClass
) {
    when (windowsSize) {
        WindowWidthSizeClass.Compact -> itemLayerForDangerousPlacesForCompactSize(item = item)
        else -> itemLayerForDangerousPlacesForMediumSize(item = item)
    }
}

@Composable
fun itemLayerForDangerousPlacesForCompactSize(
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
fun itemLayerForDangerousPlacesForMediumSize(
    item: ItemData
) {
    Column {
        Row {
            Text(
                text = stringResource(item.itemDescription),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(item.itemPicture),
                contentDescription = stringResource(item.itemName),
                contentScale = ContentScale.Crop,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            Image(
                painter = painterResource(item.itemPicture),
                contentDescription = stringResource(item.itemName),
                contentScale = ContentScale.Crop,
                modifier = Modifier.weight(1f)
            )

            Text(
                text = stringResource(item.itemDescription),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForDangerousPlacesForCompactSize() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForDangerousPlaces(
                item = mainProvider.Items[R.string.dangerousPlacesSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowsSize = WindowWidthSizeClass.Compact
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previewItemLayerForDangerousPlacesForMediumSize() {
    ReynosaAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            itemLayerForDangerousPlaces(
                item = mainProvider.Items[R.string.dangerousPlacesSubCategoryName1]
                    ?: ItemData(R.string.useForNoThing, R.drawable.usefornothing),
                windowsSize = WindowWidthSizeClass.Medium
            )
        }
    }
}
