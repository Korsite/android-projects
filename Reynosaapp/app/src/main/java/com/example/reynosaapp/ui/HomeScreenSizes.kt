package com.example.reynosaapp.ui

import android.content.SharedPreferences
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.layer.currentLayer
import com.example.reynosaapp.ui.layer.typesOfNavigation.bottomNavigation
import com.example.reynosaapp.ui.layer.typesOfNavigation.permanentNavigationDrawer
import com.example.reynosaapp.ui.layer.typesOfNavigation.railNavigation

@Composable
fun HomeScreenForCompactSize(
    reynosaViewModel: ReynosaViewModel,
    reynosaUiState: ReynosaUiState,
    listOfNavigationIcons: List<NavigationToDisplay>,
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences
) {


    Column {
        topBar(
            subject = stringResource(reynosaUiState.subject),
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            windowsSize = windowsSize
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
            windowsSize = windowsSize,
            rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
            rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants
        )

        bottomNavigation(
            listOfNavigationIcons = listOfNavigationIcons,
            selected = reynosaUiState.currentMainCategory,
            onClick = { subject: Int, currentCategory: MainCategories ->
                reynosaViewModel.updateMainCategory(subject, currentCategory)
            },
            modifier = Modifier
        )
    }
}


@Composable
fun HomeScreenForMediumSize(
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    listOfNavigationIcons: List<NavigationToDisplay>,
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences,
) {


    Row {
        railNavigation(
            selected = reynosaUiState.currentMainCategory,
            onClickNavigationIcon = { subject: Int, currentCategory: MainCategories ->
                reynosaViewModel.updateMainCategory(subject, currentCategory)
            },
            listOfNavigationIcons = listOfNavigationIcons,
            modifier = Modifier.padding(top = 20.dp)
        )

        Column {
            topBar(
                subject = stringResource(reynosaUiState.subject),
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                windowsSize = windowsSize
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
                onClickExtraOption = { check, currentExtraOption ->
                    reynosaViewModel.addOrRemoveExtraCategory(check, currentExtraOption)
                },
                reynosaUiState = reynosaUiState,
                reynosaViewModel = reynosaViewModel,
                windowsSize = windowsSize,
                modifier = Modifier.weight(1f),
                rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
                rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants
            )
        }
    }
}

@Composable
fun HomeScreenForExpandedSize(
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    listOfNavigationIcons: List<NavigationToDisplay>,
    windowsSize: WindowWidthSizeClass,
    rememberScrollPositionForCoffeeShops: SharedPreferences,
    rememberScrollPositionForRestaurants: SharedPreferences,
) {
    permanentNavigationDrawer(
        listOfNavigationIcons = listOfNavigationIcons,
        selected = reynosaUiState.currentMainCategory,
        onClickNavigationIcon = { subject, currentMainCategory ->
            /*
            I also update here for the 1st [0] category of the main Category
            If main category is Opportunities, then the 1st extraCategory is shown
             */
            reynosaViewModel.updateMainCategory(subject, currentMainCategory)
            reynosaViewModel.updateCategory(
                if (currentMainCategory != MainCategories.Opportunities) currentMainCategory.Categories[0]
                else R.string.opportunitiesEducationExtraCategoryName1
            )
        }
    ) {
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
            onClickExtraOption = { check, currentExtraOption ->
                reynosaViewModel.addOrRemoveExtraCategory(check, currentExtraOption)
            },
            reynosaUiState = reynosaUiState,
            reynosaViewModel = reynosaViewModel,
            windowsSize = windowsSize,
            rememberScrollPositionForCoffeeShops = rememberScrollPositionForCoffeeShops,
            rememberScrollPositionForRestaurants = rememberScrollPositionForRestaurants,
            modifier = Modifier,
        )
    }
}