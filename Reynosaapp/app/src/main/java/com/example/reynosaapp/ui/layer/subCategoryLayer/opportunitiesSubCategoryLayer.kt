package com.example.reynosaapp.ui.layer.subCategoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.opportunities.OpportunitiesProviderSubCategories
import com.example.reynosaapp.ui.HyperText
import com.example.reynosaapp.ui.theme.ReynosaAppTheme


@Composable
fun subCategoryLayerForOpportunities(
    subCategory: SubCategoryData,
    numberOfCard: Int
) {
    Box {
        Row {
            Image(
                painter = painterResource(subCategory.subCategoryPicture),
                contentDescription = stringResource(subCategory.subCategoryName),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(1.5f)
                    .height(150.dp)
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
            ) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(subCategory.subCategoryName),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f)
                    )

                    Text(
                        text = numberOfCard.toString(),
                    )
                }
                Text(text = stringResource(subCategory.subCategoryIsPrivateOrPublic))

                HyperText(
                    link = subCategory.subCategoryGoogleMaps,
                    message = R.string.clickHereToGoogleMaps,
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForOpportunities() {
    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForOpportunities(
                subCategory = OpportunitiesProviderSubCategories.subCategories[R.string.opportunitiesEducationExtraCategoryName1]?.component1()
                    ?: SubCategoryData(R.string.useForNoThing, R.drawable.usefornothing),
                numberOfCard = 1
            )
        }
    }
}
