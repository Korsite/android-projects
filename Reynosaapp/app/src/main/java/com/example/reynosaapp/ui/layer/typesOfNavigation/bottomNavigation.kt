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
    navigationIcon: List<NavigationToDisplay>,
    onClick: (Int, MainCategories) -> Unit,
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

