package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.data.extrainfo.ExtraInformationProviderCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

@Composable
fun categoryLayerLazyColumn(
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    currentCategory: (Int) -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val currentListOfSubCategory = reynosaUiState.currentCategories
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        items(currentListOfSubCategory, key = { category -> category.categoryName }) { category ->
            categoryLayer(
                category = category,
                onClick = { currentCategory(category.categoryName) },
                extraCategories = category.extraCategoriesType,
                reynosaViewModel = reynosaViewModel,
                onClickExtraCategory = onClickExtraCategory,
                reynosaUiState = reynosaUiState
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayer(
    @StringRes extraCategories: List<Int>,
    category: CategoryData,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    onClick: () -> Unit,
    onClickExtraCategory: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    when (reynosaUiState.currentMainCategory) {
        MainCategories.Opportunities -> categoryLayerForOpportunities(
            category = category,
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            reynosaViewModel = reynosaViewModel
        )

        MainCategories.ExtraInfo -> categoryLayerForExtraInfo(
            category = category,
            onClick = onClick
        )

        else -> categoryLayerLazyColumnForGoodPlacesBadPlaces(
            category = category,
            reynosaViewModel = reynosaViewModel,
            onClick = onClick
        )
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
            categoryLayerLazyColumnForGoodPlacesBadPlaces(
                GoodPlacesProviderCategories.Categories[0],
                reynosaViewModel = reynosaViewModel,
                onClick = {}
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewCategoryLayerLazyColumnForOpportunities() {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerForOpportunities(
                ExtraCategoriesForOpportunities.Work.extraCategories,
                category = OpportunitiesProviderCategories.Categories[0],
                onClickExtraCategory = {},
                reynosaViewModel = reynosaViewModel
            )
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
            categoryLayerForExtraInfo(
                ExtraInformationProviderCategories.Categories[0],
                onClick = {}
            )
        }
    }
}

