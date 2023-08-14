package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.ui.data.ReynosaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForOpportunities(
    @StringRes extraCategories: List<Int>,
    reynosaViewModel: ReynosaViewModel,
    onClickExtraCategory: (Int) -> Unit,
    category: CategoryData,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Card(
        onClick = { expanded = !expanded }
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
                    Box(modifier = Modifier.fillMaxWidth().clickable { onClickExtraCategory(extraCategory) }){
                        Text(
                            text = stringResource(extraCategory),
                        )
                    }
                }
            }

        }
    }
}
