package com.example.reynosaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.extraInformationProvider
import com.example.reynosaapp.ui.layer.ReynosaUiState
import com.example.reynosaapp.ui.layer.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@Composable
fun categoryLayerLazyColumn(
    reynosaUiState: ReynosaUiState,
    currentCategory: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val currentListOfSubCategory = reynosaUiState.currentCategories
    val context = LocalContext.current
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        items(currentListOfSubCategory) { category ->
            categoryLayerLazyColumn(
                category = category,
                onClick = { currentCategory(category.categoryName)},
                reynosaUiState = reynosaUiState
            )
        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerLazyColumn(
    category: CategoryData,
    reynosaUiState: ReynosaUiState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick
    ) {
        if (reynosaUiState.currentCategories == extraInformationProvider.Categories)
            categoryLayerLazyColumnForExtraInfo(subCategory = category)
        else
            categoryLayerLazyColumnForGoodPlacesBadPlacesAndOpportunities(category = category)
    }
}

@Composable
fun categoryLayerLazyColumnForGoodPlacesBadPlacesAndOpportunities(
    category: CategoryData
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
                .height(150.dp),
            contentScale = ContentScale.Crop,

            )
    }
}

@Composable
fun categoryLayerLazyColumnForExtraInfo(
    subCategory: CategoryData
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = stringResource(subCategory.categoryName))
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewCategoryLayerLazyColumnForGoodPlacesBadPlacesAndOpportunities() {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerLazyColumn(reynosaUiState, currentCategory = {it})
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewCategoryLayerLazyColumnForExtraInfo() {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerLazyColumn(reynosaUiState = reynosaUiState, currentCategory = {it})
        }
    }
}