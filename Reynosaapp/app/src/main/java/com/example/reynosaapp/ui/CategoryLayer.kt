package com.example.reynosaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.SubCategoryData
import com.example.reynosaapp.data.extraInformationProvider
import com.example.reynosaapp.data.goodPlacesProvider
import com.example.reynosaapp.ui.layer.ReynosaUiState
import com.example.reynosaapp.ui.layer.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@Composable
fun subCategoryLazyColumn(
    reynosaUiState: ReynosaUiState,
    modifier: Modifier = Modifier
) {
    val currentListOfSubCategory = reynosaUiState.currentSubCategories
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
            items(currentListOfSubCategory) { subCategory ->
                subCategoryLayer(
                    subCategory = subCategory,
                    reynosaUiState = reynosaUiState
                )
            }

    }

}


@Composable
fun subCategoryLayer(
    subCategory: SubCategoryData,
    reynosaUiState: ReynosaUiState,
    modifier: Modifier = Modifier
) {
    Card {
        if (reynosaUiState.currentSubCategories == extraInformationProvider.subCategories)
            subCategoryLayerForExtraInfo(subCategory = subCategory)
        else
            subCategoryLayerForGoodPlacesBadPlacesAndOpportunities(subCategory = subCategory)
    }
}

@Composable
fun subCategoryLayerForGoodPlacesBadPlacesAndOpportunities(
    subCategory: SubCategoryData
) {
    Row {
        Column(
            modifier = Modifier.weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(subCategory.categoryName))
            Text(text = stringResource(subCategory.categoryDescription))
        }
        Image(
            painter = painterResource(subCategory.categoryPicture),
            contentDescription = stringResource(subCategory.categoryName),
            modifier = Modifier
                .weight(1.5f)
                .height(150.dp),
            contentScale = ContentScale.Crop,

            )
    }
}

@Composable
fun subCategoryLayerForExtraInfo(
    subCategory: SubCategoryData
) {
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Text(text = stringResource(subCategory.categoryName))
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForGoodPlacesBadPlacesAndOpportunities() {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLazyColumn(reynosaUiState)
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForExtraInfo(){
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLazyColumn(reynosaUiState = reynosaUiState)
        }
    }
}