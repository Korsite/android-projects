package com.example.reynosaapp.ui

import android.content.res.Resources
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.currentLayer
import com.example.reynosaapp.ui.layer.typesOfNavigation.railNavigation

@Composable
fun ReynosaApp(
    windowsSize: WindowWidthSizeClass
) {
    val reynosaViewModel: ReynosaViewModel = viewModel()
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    val listOfIcons = listOf(
        NavigationToDisplay(
            MainCategories.GoodPlaces,
            Icons.Filled.Build,
            R.string.good_places,
            GoodPlacesProviderCategories.Categories
        ),
        NavigationToDisplay(
            MainCategories.DangerousPlaces,
            Icons.Filled.Build,
            R.string.dangerous_places,
            DangerousPlacesProviderCategories.Categories
        ),
        NavigationToDisplay(
            MainCategories.Opportunities,
            Icons.Filled.Build,
            R.string.opportunities,
            null
        ),
        NavigationToDisplay(
            MainCategories.ExtraInfo,
            Icons.Filled.Build,
            R.string.extra_info,
            null
        )
    )

    when (windowsSize) {
        WindowWidthSizeClass.Compact -> HomeScreen(
            reynosaViewModel = reynosaViewModel,
            reynosaUiState = reynosaUiState,
            listOfIcons = listOfIcons,
            windowsSize = windowsSize
        )

        else -> HomeScreenForMediumSize(
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            listOfIcons = listOfIcons,
            windowsSize = windowsSize
        )
    }
}

@Composable
fun HomeScreenForMediumSize(
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    listOfIcons: List<NavigationToDisplay>,
    windowsSize: WindowWidthSizeClass
) {
    Row{
        railNavigation(
            selected = reynosaUiState.currentMainCategory,
            onClickNavigationIcon = { subject: Int, currentCategory: MainCategories ->
                reynosaViewModel.updateMainCategory(subject, currentCategory)
            },
            listOfIcons = listOfIcons,
            modifier = Modifier.padding(top = 20.dp)
        )

        Column{
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
                onClickExtraOption = {check, currentExtraOption ->
                    reynosaViewModel.addOrRemoveExtraCategory(check, currentExtraOption)
                },
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                windowsSize = windowsSize,
                modifier = Modifier.weight(1f)
            )
        }
    }


}

data class NavigationToDisplay(
    val category: MainCategories,
    val imageIcon: ImageVector,
    @StringRes val contentDescription: Int,
    val subCategoriesContent: List<CategoryData>?
)