package com.example.reynosaapp.ui.layer.itemLayers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.ui.HyperText

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