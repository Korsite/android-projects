package com.example.reynosaapp.ui

import android.content.SharedPreferences
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaViewModel

@Composable
fun ReynosaApp(
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences,
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
        WindowWidthSizeClass.Compact -> {

            HomeScreenForCompactSize(
                reynosaViewModel = reynosaViewModel,
                reynosaUiState = reynosaUiState,
                listOfNavigationIcons = listOfIcons,
                windowsSize = windowsSize,
                rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants
                )
        }

        WindowWidthSizeClass.Medium -> {

            HomeScreenForMediumSize(
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                listOfNavigationIcons = listOfIcons,
                windowsSize = windowsSize,
                rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants
                )
        }

        else ->
            HomeScreenForExpandedSize(
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                listOfNavigationIcons = listOfIcons,
                windowsSize = windowsSize,
                rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants
            )

    }
}


data class NavigationToDisplay(
    val category: MainCategories,
    val imageIcon: ImageVector,
    @StringRes val contentDescription: Int,
    val subCategoriesContent: List<CategoryData>?
)