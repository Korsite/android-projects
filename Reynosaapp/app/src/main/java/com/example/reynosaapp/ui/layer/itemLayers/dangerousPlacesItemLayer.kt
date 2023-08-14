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