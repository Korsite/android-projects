package com.example.reynosaapp.ui

import android.content.SharedPreferences
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@Composable
fun ReynosaApp(
    isInDarkMode: SharedPreferences,
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences,
    rememberScrollPositionForParks: SharedPreferences,
) {
    var isInDarkTheme =
        remember {
            mutableStateOf(isInDarkMode.getBoolean("isInDarkMode", false))
        }

    val onClickSwitchMode = {
        isInDarkMode.edit()
            .putBoolean("isInDarkMode", !isInDarkTheme.value)
            .apply()
        isInDarkTheme.value = !isInDarkTheme.value
    }


    ReynosaAppTheme(darkTheme = isInDarkTheme.value) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {

            val reynosaViewModel: ReynosaViewModel = viewModel()
            val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
            val listOfIcons = listOf(
                NavigationToDisplay(
                    MainCategories.GoodPlaces,
                    Icons.Filled.ThumbUp,
                    R.string.good_places,
                    GoodPlacesProviderCategories.Categories
                ),
                NavigationToDisplay(
                    MainCategories.DangerousPlaces,
                    Icons.Filled.Warning,
                    R.string.dangerous_places,
                    DangerousPlacesProviderCategories.Categories
                ),
                NavigationToDisplay(
                    MainCategories.Opportunities,
                    Icons.Filled.Star,
                    R.string.opportunities,
                    null
                ),
                NavigationToDisplay(
                    MainCategories.ExtraInfo,
                    Icons.Filled.Info,
                    R.string.extra_info,
                    null
                )
            )

            when (windowsSize) {
                WindowWidthSizeClass.Compact ->
                    HomeScreenForCompactSize(
                        reynosaViewModel = reynosaViewModel,
                        reynosaUiState = reynosaUiState,
                        listOfNavigationIcons = listOfIcons,
                        windowsSize = windowsSize,
                        rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                        rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants,
                        rememberScrollPositionForParks = rememberScrollPositionForParks,
                        onClickSwitchMode = onClickSwitchMode,
                        isInDarkTheme = isInDarkTheme.value
                    )

                WindowWidthSizeClass.Medium ->
                    HomeScreenForMediumSize(
                        reynosaUiState = reynosaUiState,
                        reynosaViewModel = reynosaViewModel,
                        listOfNavigationIcons = listOfIcons,
                        windowsSize = windowsSize,
                        rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                        rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants,
                        rememberScrollPositionForParks = rememberScrollPositionForParks,
                        onClickSwitchMode = onClickSwitchMode,
                        isInDarkTheme = isInDarkTheme.value
                    )

                else ->
                    HomeScreenForExpandedSize(
                        reynosaUiState = reynosaUiState,
                        reynosaViewModel = reynosaViewModel,
                        listOfNavigationIcons = listOfIcons,
                        windowsSize = windowsSize,
                        rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                        rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants,
                        rememberScrollPositionForParks = rememberScrollPositionForParks,
                        onClickSwitchMode = onClickSwitchMode,
                        isInDarkTheme = isInDarkTheme.value
                    )
            }
        }
    }
}


data class NavigationToDisplay(
    val category: MainCategories,
    val imageIcon: ImageVector,
    @StringRes val contentDescription: Int,
    val subCategoriesContent: List<CategoryData>?,
)