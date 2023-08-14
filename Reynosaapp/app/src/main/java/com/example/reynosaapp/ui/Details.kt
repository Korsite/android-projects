package com.example.reynosaapp.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.extraOptions.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import java.time.LocalDateTime
import java.util.Calendar

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
    reynosaViewModel: ReynosaViewModel
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = subject)
        },
        actions = {
            filterIcon(reynosaUiState = reynosaUiState) {
                reynosaViewModel.updateFilterIsShow()
            }
        },
        navigationIcon = {
            navigationIcon(
                reynosaUiState = reynosaUiState
            ) {
                if (reynosaUiState.showingSubCategories && !reynosaUiState.showingAnItem) {
                    val currentMainCategory = reynosaUiState.currentMainCategory
                    val subject = reynosaUiState.currentMainCategoryName
                    reynosaViewModel.updateMainCategory(subject, currentMainCategory)
                } else {
                    val currentCategory = reynosaUiState.currentCategory
                    reynosaViewModel.updateCategory(currentCategory)
                }
            }
        }
    )
}

@Composable
fun navigationIcon(
    reynosaUiState: ReynosaUiState,
    onClick: () -> Unit
) {
    if (reynosaUiState.currentCategory != 0) {
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
    if (reynosaUiState.currentMainCategory == MainCategories.GoodPlaces &&
        reynosaUiState.showingSubCategories &&
        reynosaUiState.currentCategory == R.string.goodPlacesCategoryName2
    )
        IconButton(onClick = onClickFilterIcon) {
            Icon(imageVector = Icons.Filled.Settings, contentDescription = null)
        }
}

@Composable
fun HyperText(
    @StringRes link: Int,
    modifier: Modifier
) {
    val hyperText = buildAnnotatedString {
        // creating a string to display in the Text
        val string = stringResource(R.string.clickHere)

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
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun choicesToFilterGoodPlaces(
    reynosaUiState: ReynosaUiState,
    onClickExtraOption: (Boolean, ExtraCategoriesForGoodPlaces) -> Unit
) {

    ExtraCategoriesForGoodPlaces.values().forEach { currentExtraCategory ->
        if (currentExtraCategory != ExtraCategoriesForGoodPlaces.None) {
            var checked = rememberSaveable {
                mutableStateOf(false)
            }
            AnimatedVisibility(
                visible = reynosaUiState.isShowingFilters &&
                        reynosaUiState.currentCategory == R.string.goodPlacesCategoryName2 // if currently, we are in Restaurants
            ) {
                Row(
                    horizontalArrangement = Center,
                    verticalAlignment = CenterVertically
                ) {
                    Checkbox(
                        checked = checked.value,
                        onCheckedChange = {
                            checked.value = it
                            onClickExtraOption(checked.value, currentExtraCategory)
                        }
                    )

                    Text(text = currentExtraCategory.name)
                }
            }
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
        HyperText(link = R.string.good_places, modifier = Modifier)

        choicesToFilterGoodPlaces(reynosaUiState = viewModel(), onClickExtraOption = { _, _ -> })
    }
}
