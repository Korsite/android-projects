package com.example.reynosaapp.ui.layer.subCategoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reynosaapp.R
import com.example.reynosaapp.data.checkHowMinutesLefToClose
import com.example.reynosaapp.data.checkHowMuchTimeLeftToClose
import com.example.reynosaapp.data.checkHowMuchTimeLeftToOpen
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.goodplaces.GoodPlacesProviderSubCategories
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop
import com.example.reynosaapp.data.returnCloseAndOpenTimeOfTheShop
import com.example.reynosaapp.ui.HyperText
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.data.ReynosaViewModel
import com.example.reynosaapp.ui.theme.ReynosaAppTheme

val scheduleUnknown = returnAPairDataTypeAboutTheScheduleOfAShop(
    "0:00 - 0:00",
    "0:00 - 0:00",
    "0:00 - 0:00",
    "0:00 - 0:00",
    "0:00 - 0:00",
    "0:00 - 0:00",
    "0:00 - 0:00",
)
@Composable
fun subCategoryLayerForGoodPlaces(
    subCategory: SubCategoryData,
    reynosaUiState: ReynosaUiState,
    numberOfCard: Int,
    modifier: Modifier = Modifier,
) {



    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier

        ) {
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
                    .padding(start = 5.dp)
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

                HyperText(
                    link = subCategory.subCategoryGoogleMaps,
                    message = R.string.clickHereToGoogleMaps,
                    modifier = modifier
                )

                if (subCategory.subCategoryCompleteSchedule != scheduleUnknown)
                    Text(
                        text = // if shop is opened
                        if (subCategory.isOpenedOrClosed == R.string.openedNow)
                            stringResource(
                                subCategory.isOpenedOrClosed,
                                checkHowMuchTimeLeftToClose(
                                    checkHowMinutesLefToClose(
                                        returnCloseAndOpenTimeOfTheShop(subCategory.subCategoryCompleteSchedule).component1(),
                                        returnCloseAndOpenTimeOfTheShop(subCategory.subCategoryCompleteSchedule).component2(),
                                        reynosaUiState
                                    )
                                )
                            )
                        else { // if shop is closed
                            val resourcesToDisplay =
                                checkHowMuchTimeLeftToOpen(
                                    subCategory.subCategoryCompleteSchedule
                                )
                            stringResource(
                                subCategory.isOpenedOrClosed,
                                resourcesToDisplay.component1(),
                                resourcesToDisplay.component2()
                            )
                        },
                        style = MaterialTheme.typography.labelLarge
                    )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewSubCategoryLayerForGoodPlaces() {
    val viewModel: ReynosaViewModel = viewModel()

    ReynosaAppTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            subCategoryLayerForGoodPlaces(
                GoodPlacesProviderSubCategories.SubCategories[R.string.goodPlacesCategoryName1]?.get(
                    1
                )
                    ?: SubCategoryData(-1, -1),
                reynosaUiState = viewModel.uiState.collectAsState().value,
                numberOfCard = 0
            )
        }
    }
}