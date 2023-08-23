package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderCategories
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import kotlin.math.exp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunities(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
    windowsSize: WindowWidthSizeClass,
) {
    when (windowsSize) {
        WindowWidthSizeClass.Compact -> categoryLayerForOpportunitiesForCompactSize(
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            category = category,
        )

        else -> categoryLayerForOpportunitiesForMediumSize(
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            category = category,
            )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunitiesForCompactSize(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Card(
        onClick = {
            expanded = !expanded

        },
        colors = CardDefaults.cardColors(
            containerColor = if (expanded) MaterialTheme.colorScheme.primaryContainer
            else MaterialTheme.colorScheme.surfaceVariant

        )
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(category.categoryPicture),
                    contentDescription = stringResource(category.categoryName),
                    modifier = Modifier.weight(1.5f),
                    contentScale = ContentScale.Crop
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(2f)
                ) {
                    Text(
                        text = stringResource(category.categoryName),
                    )
                    Text(
                        text = stringResource(category.categoryDescription),
                        modifier = Modifier.align(Alignment.Start)
                    )
                }
            }
            extraCategories.forEach { extraCategory ->
                AnimatedVisibility(visible = expanded) {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onClickExtraCategory(extraCategory) }) {
                        Text(
                            text = stringResource(extraCategory),
                        )
                    }
                }
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunitiesForMediumSize(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Card(
        onClick = { expanded = !expanded },
        colors = CardDefaults.cardColors(
            containerColor = if (expanded) MaterialTheme.colorScheme.primaryContainer
            else MaterialTheme.colorScheme.surfaceVariant

        )
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(2f)
                ) {
                    Text(
                        text = stringResource(category.categoryName),
                    )
                    Text(
                        text = stringResource(category.categoryDescription),
                        modifier = Modifier.align(Alignment.Start)
                    )
                }

                Image(
                    painter = painterResource(category.categoryPicture),
                    contentDescription = stringResource(category.categoryName),
                    modifier = Modifier.weight(2f),
                    contentScale = ContentScale.Crop
                )

            }
            extraCategories.forEach { extraCategory ->
                AnimatedVisibility(visible = expanded) {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onClickExtraCategory(extraCategory)
                            expanded = !expanded

                        }) {
                        Text(
                            text = stringResource(extraCategory),
                        )
                    }
                }
            }

        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun previewCategoryForOpportunitiesForCompactSize() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerForOpportunities(
                ExtraCategoriesForOpportunities.Work.extraCategories,
                category = OpportunitiesProviderCategories.Categories[0],
                onClickExtraCategory = {},
                windowsSize = WindowWidthSizeClass.Compact,
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewCategoryForOpportunitiesForMediumSize() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerForOpportunities(
                ExtraCategoriesForOpportunities.Work.extraCategories,
                category = OpportunitiesProviderCategories.Categories[0],
                onClickExtraCategory = {},
                windowsSize = WindowWidthSizeClass.Medium,
            )
        }
    }
}