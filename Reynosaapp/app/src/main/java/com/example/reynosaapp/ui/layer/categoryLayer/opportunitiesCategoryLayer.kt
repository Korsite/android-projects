package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.data.framework.ExtraCategoriesForOpportunities
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderCategories
import com.example.reynosaapp.ui.theme.ReynosaAppTheme
import kotlin.math.exp

@Composable
fun categoryLayerForOpportunities(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
    windowsSize: WindowWidthSizeClass,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    when (windowsSize) {
        WindowWidthSizeClass.Compact -> categoryLayerForOpportunitiesForCompactSize(
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            category = category,
            expanded = expanded
        ){ expanded = !expanded }

        else -> categoryLayerForOpportunitiesForMediumSize(
            extraCategories = extraCategories,
            onClickExtraCategory = onClickExtraCategory,
            category = category,
            expanded = expanded
        ){ expanded = !expanded }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunitiesForCompactSize(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
    expanded: Boolean,
    onClickCard: () -> Unit
) {

    Card(
        onClick = onClickCard,
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
                    horizontalAlignment = CenterHorizontally,
                    modifier = Modifier.weight(2f)
                ) {
                    Text(
                        text = stringResource(category.categoryName),
                    )
                    Text(
                        text = stringResource(category.categoryDescription),
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(5.dp)
                    )
                }
            }

            displayExtraCategoriesForOpportunities(
                extraCategories = extraCategories,
                expanded = expanded,
            ){ onClickExtraCategory(it) }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunitiesForMediumSize(
    @StringRes extraCategories: List<Int>,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
    expanded: Boolean,
    onClickCard: () -> Unit
) {

    Card(
        onClick = onClickCard,
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
                    horizontalAlignment = CenterHorizontally,
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
            displayExtraCategoriesForOpportunities(
                extraCategories = extraCategories,
                expanded = expanded,
            ){ onClickExtraCategory(it) }
        }
    }
}
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun displayExtraCategoriesForOpportunities(
    @StringRes extraCategories: List<Int>,
    expanded: Boolean,
    onClickExtraCategory: (Int) -> Unit
){

    extraCategories.forEach { extraCategory ->
        AnimatedVisibility(
            visible = expanded,
            enter = expandVertically(
                animationSpec = SpringSpec(
                    stiffness = Spring.StiffnessLow
                )
            ),
            exit = shrinkVertically (
                animationSpec = SpringSpec(
                    stiffness = Spring.StiffnessLow
                )
            )
        ) {
            Box(
                modifier = Modifier
                .clickable { onClickExtraCategory(extraCategory) }
            ){
                Text(
                    text = stringResource(extraCategory),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
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
            horizontalAlignment = CenterHorizontally
        ) {
            categoryLayerForOpportunities(
                ExtraCategoriesForOpportunities.Work.extraCategories,
                category = OpportunitiesProviderCategories.Categories[0],
                windowsSize = WindowWidthSizeClass.Compact,
                onClickExtraCategory = {}
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
            horizontalAlignment = CenterHorizontally
        ) {
            categoryLayerForOpportunities(
                ExtraCategoriesForOpportunities.Work.extraCategories,
                category = OpportunitiesProviderCategories.Categories[0],
                windowsSize = WindowWidthSizeClass.Medium,
                onClickExtraCategory = {}
            )
        }
    }
}