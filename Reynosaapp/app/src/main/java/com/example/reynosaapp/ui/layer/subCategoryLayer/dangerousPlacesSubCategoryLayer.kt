package com.example.reynosaapp.ui.layer.subCategoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reynosaapp.R
import com.example.reynosaapp.data.dangerousplaces.DangerousPlacesProviderSubCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@Composable
fun subCategoryLayerForDangerousPlaces(
    subCategory: SubCategoryData,
    numberOfCard: Int
) {
    Box {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(2f)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = numberOfCard.toString(),
                    )
                    Text(
                        text = stringResource(subCategory.subCategoryName),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f)
                    )
                }
                Text(
                    text = stringResource(subCategory.subCategoryContentDescription),
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Center
                )
            }
            Image(
                painter = painterResource(subCategory.subCategoryPicture),
                contentDescription = stringResource(subCategory.subCategoryName),
                modifier = Modifier.weight(2f),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForDangerousPlaces() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForDangerousPlaces(
                subCategory = DangerousPlacesProviderSubCategories.subCategories[R.string.dangerousPlacesCategoryName1]?.component1()
                    ?: SubCategoryData(R.string.useForNoThing, R.drawable.usefornothing),
                numberOfCard = 1
            )
        }
    }
}