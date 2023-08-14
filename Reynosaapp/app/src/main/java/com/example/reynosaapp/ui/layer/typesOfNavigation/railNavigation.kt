package com.example.reynosaapp.ui.typesOfNavigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.NavigationToDisplay
import com.example.reynosaapp.ui.layer.ReynosaUiState

@Composable
fun railNavigation(
    selected: MainCategories,
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    listOfIcons: List<NavigationToDisplay>,
    modifier : Modifier
) {
    NavigationRail(modifier = modifier) {
        for (listOfIcon in listOfIcons)
            NavigationRailItem(
                selected = selected == listOfIcon.category,
                onClick = {
                    onClickNavigationIcon(
                        listOfIcon.contentDescription,
                        listOfIcon.category
                    )
                },
                icon = {
                    Icon(
                        imageVector = listOfIcon.imageIcon, contentDescription = stringResource(
                            listOfIcon.contentDescription
                        )
                    )
                }
            )
    }
}