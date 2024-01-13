package com.example.reynosaapp.ui.layer.typesOfNavigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.NavigationToDisplay
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.switchThemeMode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun permanentNavigationDrawer(
    listOfNavigationIcons: List<NavigationToDisplay>,
    selected: MainCategories,
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    windowsSize: WindowWidthSizeClass,
    reynosaUiState: ReynosaUiState,
    isInDarkTheme: Boolean,
    onClickSwitchMode: () -> Unit,
    content: @Composable () -> Unit
) {
    PermanentNavigationDrawer(
        drawerContent = {
            PermanentDrawerSheet(
                Modifier
                    .width(200.dp)
                    .padding(top = 20.dp)
            ) {
                NavigationDrawerContent(
                    onClickNavigationIcon = onClickNavigationIcon,
                    selected = selected,
                    listOfNavigationIcons = listOfNavigationIcons,
                    reynosaUiState = reynosaUiState,
                    isInDarkTheme = isInDarkTheme,
                    onClickSwitchMode = onClickSwitchMode
                )
            }
        },
        content = content,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerContent(
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    selected: MainCategories,
    listOfNavigationIcons: List<NavigationToDisplay>,
    reynosaUiState: ReynosaUiState,
    isInDarkTheme: Boolean,
    onClickSwitchMode: () -> Unit,
    modifier: Modifier = Modifier
        .padding(10.dp)
) {
    for (navigationIcon in listOfNavigationIcons) {
        NavigationDrawerItem(
            label = {
                Text(
                    text = stringResource(navigationIcon.contentDescription),
                    style = MaterialTheme.typography.titleMedium,

                )
            },
            selected = selected == navigationIcon.category,
            onClick = {
                onClickNavigationIcon(
                    navigationIcon.contentDescription,
                    navigationIcon.category
                )
            },
            icon = {
                Icon(
                    imageVector = navigationIcon.imageIcon,
                    contentDescription = stringResource(navigationIcon.contentDescription)
                )
            },
            modifier = modifier
        )
    }

    switchThemeMode(
        reynosaUiState = reynosaUiState,
        isInDarkTheme = isInDarkTheme,
        onClickSwitchMode = onClickSwitchMode,
        modifier = Modifier.padding(start = 25.dp)
    )


}