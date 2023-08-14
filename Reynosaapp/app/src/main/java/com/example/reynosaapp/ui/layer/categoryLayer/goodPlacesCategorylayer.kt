package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.ui.choicesToFilterGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerLazyColumnForGoodPlacesBadPlaces(
    category: CategoryData,
    reynosaViewModel: ReynosaViewModel,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick
    ) {
        Row {
            Column(
                modifier = Modifier.weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(category.categoryName))
                Text(text = stringResource(category.categoryDescription))
            }
            Image(
                painter = painterResource(category.categoryPicture),
                contentDescription = stringResource(category.categoryName),
                modifier = Modifier
                    .weight(1.5f)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop,

                )
        }
    }
}