package com.example.reynosaapp.ui.layer.typesOfNavigation

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.ui.NavigationToDisplay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun permanentNavigationDrawer(
    listOfNavigationIcons: List<NavigationToDisplay>,
    selected: MainCategories,
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    content: @Composable () -> Unit
) {
    PermanentNavigationDrawer(
        drawerContent = {
            PermanentDrawerSheet(
                Modifier
                    .width(250.dp)
                    .padding(top = 20.dp)) {
                NavigationDrawerContent(
                    onClickNavigationIcon = onClickNavigationIcon,
                    selected = selected,
                    listOfNavigationIcons = listOfNavigationIcons
                )
            }
        },
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerContent(
    onClickNavigationIcon: (Int, MainCategories) -> Unit,
    selected: MainCategories,
    listOfNavigationIcons: List<NavigationToDisplay>
) {
    for (navigationIcon in listOfNavigationIcons) {
        NavigationDrawerItem(
            label = {
                Text(
                    text = stringResource(navigationIcon.contentDescription),
                    style = MaterialTheme.typography.titleLarge,

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
            modifier = Modifier.padding(10.dp)
        )
    }
}