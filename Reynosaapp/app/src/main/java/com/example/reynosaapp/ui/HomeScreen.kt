package com.example.reynosaapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.extraOptions.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.categoryLayer.categoryLayerLazyColumn
import com.example.reynosaapp.ui.layer.currentLayer
import com.example.reynosaapp.ui.layer.itemLayers.itemLayerLazyColumn
import com.example.reynosaapp.ui.layer.subCategoryLayerLazyColumn
import com.example.reynosaapp.ui.layer.typesOfNavigation.bottomNavigation

@Composable
fun HomeScreen(
    reynosaViewModel: ReynosaViewModel,
    reynosaUiState: ReynosaUiState,
    listOfIcons: List<NavigationToDisplay>,
    windowsSize: WindowWidthSizeClass,
) {
    Column {
        topBar(
            subject = stringResource(reynosaUiState.subject),
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel
        )

        currentLayer(
            currentCategory = { currentCategory ->
                reynosaViewModel.updateCategory(currentCategory)
            },
            currentItem = { currentSubCategory ->
                reynosaViewModel.updateSubCategory(currentSubCategory)
            },
            onClickExtraCategory = { currentExtraCategory ->
                reynosaViewModel.updateCategory(currentExtraCategory)
            },
            onClickExtraOption = { checked, currentExtraOption ->
                reynosaViewModel.addOrRemoveExtraCategory(checked, currentExtraOption)
            },
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            modifier = Modifier.weight(1f),
            windowsSize = windowsSize
        )

        bottomNavigation(
            navigationIcon = listOfIcons,
            selected = reynosaUiState.currentMainCategory,
            onClick = { subject: Int, currentCategory: MainCategories ->
                reynosaViewModel.updateMainCategory(subject, currentCategory)
            },
            modifier = Modifier
        )
    }
}



