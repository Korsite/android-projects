package com.example.reynosaapp.ui.layer.typesOfNavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.NavigationToDisplay

@Composable
fun bottomNavigation(
    selected: MainCategories,
    listOfNavigationIcons: List<NavigationToDisplay>,
    onClick: (Int, MainCategories) -> Unit,
    modifier: Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        for (navigationIcon in listOfNavigationIcons)
            NavigationBarItem(
                selected = selected == navigationIcon.category,
                onClick = {
                    onClick(
                        navigationIcon.contentDescription,
                        navigationIcon.category,
                    )
                },
                icon = {
                    Icon(
                        imageVector = navigationIcon.imageIcon,
                        contentDescription = stringResource(navigationIcon.contentDescription)
                    )
                }
            )
    }
}

