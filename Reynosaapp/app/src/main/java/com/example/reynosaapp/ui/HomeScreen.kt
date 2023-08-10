package com.example.reynosaapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.MainCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProvider
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderCategories
import com.example.reynosaapp.ui.layer.ReynosaUiState
import com.example.reynosaapp.ui.layer.ReynosaViewModel


@Composable
fun currentLayer(
    currentCategory: (Int) -> Unit,
    reynosaUiState: ReynosaUiState,
    modifier: Modifier,
) {
    if (!reynosaUiState.showingSubCategories)
        categoryLayerLazyColumn(
            reynosaUiState = reynosaUiState,
            currentCategory = currentCategory,
            modifier = modifier
        )
    else
        subCategoryLayerLazyColumn(
            reynosaUiState = reynosaUiState,
            subCategories = reynosaUiState.currentSubCategories,
            modifier = modifier
        )

}

@Composable
fun HomeScreen(
    reynosaViewModel: ReynosaViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val reynosaUiState = reynosaViewModel.uiState.collectAsState().value
    val context = LocalContext.current

    val list = listOf(
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
            DangerousPlacesProvider.Categories
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

    Row {
        Column {
            topBar(
                subject = stringResource(reynosaUiState.subject),
                reynosaUiState = reynosaUiState,
                onClick = {
                    val currentMainCategory = reynosaUiState.currentMainCategory
                    val subject = reynosaUiState.currentMainCategoryName
                    reynosaViewModel.updateMainCategory(subject, currentMainCategory)
                }
            )

            currentLayer(
                currentCategory = { currentCategory ->
                    reynosaViewModel.updateCategory(currentCategory)
                },
                reynosaUiState = reynosaUiState,
                modifier = Modifier.weight(1f)
            )

            bottomNavigation(
                navigationIcon = list,
                selected = reynosaUiState.currentMainCategory,
                reynosaViewModel = reynosaViewModel,
                onClick = { subject: Int, currentCategory: MainCategories ->
                    reynosaViewModel.updateMainCategory(subject, currentCategory)
                },
                modifier = modifier
            )
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar(
    subject: String,
    reynosaUiState: ReynosaUiState,
    onClick: () -> Unit
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = subject)
        },
        navigationIcon = {
            navigationIcon(
                reynosaUiState = reynosaUiState,
                onClick = onClick
            )
        }
    )
}

@Composable
fun navigationIcon(
    reynosaUiState: ReynosaUiState,
    onClick: () -> Unit
){
    if(reynosaUiState.currentCategory != 0){
        IconButton(onClick =  onClick ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = stringResource(R.string.back)
            )
        }
    }
}
@Composable
fun bottomNavigation(
    selected: MainCategories,
    navigationIcon: List<NavigationToDisplay>,
    onClick: (Int, MainCategories) -> Unit,
    reynosaViewModel: ReynosaViewModel,
    modifier: Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {

        for (navigationIcons in navigationIcon)
            NavigationBarItem(
                selected = selected == navigationIcons.category,
                onClick = {
                    onClick(
                        navigationIcons.contentDescription,
                        navigationIcons.category,
                    )
                },
                icon = {
                    Icon(
                        imageVector = navigationIcons.imageIcon,
                        contentDescription = stringResource(navigationIcons.contentDescription)
                    )
                }
            )
    }
}

data class NavigationToDisplay(
    val category: MainCategories,
    val imageIcon: ImageVector,
    @StringRes val contentDescription: Int,
    val subCategoriesContent: List<CategoryData>?
)