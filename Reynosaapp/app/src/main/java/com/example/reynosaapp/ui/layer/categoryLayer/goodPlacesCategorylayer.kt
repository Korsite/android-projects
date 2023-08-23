package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForGoodPlacesBadPlaces(
    cardSelected: Boolean,
    category: CategoryData,
    reynosaViewModel: ReynosaViewModel,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = if(cardSelected) MaterialTheme.colorScheme.primaryContainer
            else MaterialTheme.colorScheme.surfaceVariant
        )
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

@Composable
@Preview(showSystemUi = true)
fun previewCategoryLayerLazyColumnForGoodPlacesBadPlaces() {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerForGoodPlacesBadPlaces(
                cardSelected = false,
                GoodPlacesProviderCategories.Categories[0],
                reynosaViewModel = reynosaViewModel,
                onClick = {}
            )
        }
    }
}