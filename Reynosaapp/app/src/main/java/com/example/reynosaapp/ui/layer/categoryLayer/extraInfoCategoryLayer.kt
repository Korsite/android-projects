package com.example.reynosaapp.ui.layer.categoryLayer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.data.extrainfo.ExtraInformationProviderCategories
import com.example.reynosaapp.data.framework.CategoryData
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun categoryLayerForExtraInfo(
    category: CategoryData,
    cardSelected: Boolean,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = if (cardSelected) MaterialTheme.colorScheme.primaryContainer
            else MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(text = stringResource(category.categoryName))
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun previewCategoryLayerForExtraInfo() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            categoryLayerForExtraInfo(
                ExtraInformationProviderCategories.Categories[0],
                onClick = {},
                cardSelected = false
            )
        }
    }
}

