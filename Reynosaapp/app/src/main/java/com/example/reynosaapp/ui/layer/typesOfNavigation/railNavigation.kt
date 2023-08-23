package com.example.reynosaapp.ui.layer.typesOfNavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.NavigationToDisplay

@Composable
fun railNavigation(
    selected: MainCategories,
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    listOfNavigationIcons: List<NavigationToDisplay>,
    modifier : Modifier
) {
    NavigationRail(modifier = modifier) {
        for (navigationIcon in listOfNavigationIcons)
            NavigationRailItem(
                selected = selected == navigationIcon.category,
                onClick = {
                    onClickNavigationIcon(
                        navigationIcon.contentDescription,
                        navigationIcon.category
                    )
                },
                icon = {
                    Icon(
                        imageVector = navigationIcon.imageIcon, contentDescription = stringResource(
                            navigationIcon.contentDescription
                        )
                    )
                }
            )
    }
}