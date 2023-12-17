package com.example.reynosaapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel

/**
 * Some simple components the app needs:
 * App Bar
 * Back Icon Navigation
 * Hyper text
 * Filter check boxes
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar(
    subject: String,
    reynosaUiState: ReynosaUiState,
    reynosaViewModel: ReynosaViewModel,
    windowsSize: WindowWidthSizeClass
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = subject, textAlign = TextAlign.Center)
        },
        actions = {
            filterIcon(reynosaUiState = reynosaUiState) {
                reynosaViewModel.updateFilterIsShow()
            }
        },
        navigationIcon = {
            navigationIcon(
                reynosaUiState = reynosaUiState,
                windowsSize = windowsSize
            ) {
                if (reynosaUiState.showingSubCategories && !reynosaUiState.showingAnItem) {
                    val currentMainCategory = reynosaUiState.currentMainCategory
                    val subject = reynosaUiState.currentMainCategoryName
                    reynosaViewModel.updateMainCategory(subject, currentMainCategory)
                } else {
                    val currentCategory =
                        if (reynosaUiState.currentCategory != 0)
                            reynosaUiState.currentCategory
                        else reynosaUiState.currentMainCategory.Categories[0]
                    reynosaViewModel.updateCategory(currentCategory)
                }
            }
        },
    )
}

@Composable
fun navigationIcon(
    reynosaUiState: ReynosaUiState,
    windowsSize: WindowWidthSizeClass,
    onClick: () -> Unit
) {
    if (
        windowsSize == WindowWidthSizeClass.Compact && reynosaUiState.currentCategory != 0 ||
        windowsSize == WindowWidthSizeClass.Medium && reynosaUiState.currentCategory != 0 ||
        windowsSize == WindowWidthSizeClass.Expanded && reynosaUiState.showingAnItem
    ) {
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = stringResource(R.string.back)
            )
        }
    }
}

@Composable
fun filterIcon(
    reynosaUiState: ReynosaUiState,
    onClickFilterIcon: () -> Unit
) {
    // filter icon is only shown in Good Places / Restaurants
    if (
        reynosaUiState.currentMainCategory == MainCategories.GoodPlaces &&
        reynosaUiState.showingSubCategories &&
        reynosaUiState.currentCategory == R.string.goodPlacesCategoryName2 &&
        !reynosaUiState.showingAnItem
    )
        IconButton(onClick = onClickFilterIcon) {
            Icon(imageVector = Icons.Filled.Settings, contentDescription = null)
        }
}

@Composable
fun HyperText(
    @StringRes link: Int,
    message: Int,
    modifier: Modifier
) {
    val hyperText = buildAnnotatedString {
        // creating a string to display in the Text
        val string = stringResource(message)

        // word and span to be hyperlinked
        val startIndex = 0
        val endIndex = string.lastIndex + 1

        append(string)
        addStyle(
            style = SpanStyle(
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                textDecoration = TextDecoration.Underline
            ), start = startIndex, end = endIndex
        )

        // attach a string annotation that
        // stores a URL to the text "link"
        addStringAnnotation(
            tag = "URL",
            annotation = stringResource(link),
            start = startIndex,
            end = endIndex
        )
    }

    val mUriHandler = LocalUriHandler.current

    ClickableText(
        text = hyperText,
        onClick = {
            hyperText
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    mUriHandler.openUri(stringAnnotation.item)
                }
        },
        style = MaterialTheme.typography.labelLarge,
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun choicesToFilterGoodPlaces(
    reynosaUiState: ReynosaUiState,
    onClickExtraOption: (Boolean, ExtraCategoriesForGoodPlaces) -> Unit,
    whichFilterToShow: Int,
    extraCategoryForGoodPlaces: ExtraCategoriesForGoodPlaces,
) {

    if (extraCategoryForGoodPlaces != ExtraCategoriesForGoodPlaces.None) {

        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = CenterVertically
        ) {
            Checkbox(
                checked = reynosaUiState.filtersToShow[whichFilterToShow],
                onCheckedChange = {
                    reynosaUiState.filtersToShow[whichFilterToShow] = it
                    onClickExtraOption(
                        reynosaUiState.filtersToShow[whichFilterToShow],
                        extraCategoryForGoodPlaces
                    )
                }
            )

            Text(text = extraCategoryForGoodPlaces.name)
        }

    }
}

@Composable
@Preview(showSystemUi = true)
fun previewHyperTextAndChoicesToFilterGoodPlaces() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HyperText(link = R.string.good_places, message = R.string.clickHereToGoogleMaps, modifier = Modifier)

        choicesToFilterGoodPlaces(
            reynosaUiState = viewModel(),
            onClickExtraOption = { _, _ -> },
            whichFilterToShow = 0,
            extraCategoryForGoodPlaces = ExtraCategoriesForGoodPlaces.Asian
        )
    }
}
