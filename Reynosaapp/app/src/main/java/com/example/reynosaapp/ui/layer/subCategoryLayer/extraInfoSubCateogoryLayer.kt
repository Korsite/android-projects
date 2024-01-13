package com.example.reynosaapp.ui.layer.subCategoryLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.reynosaapp.R
import com.example.reynosaapp.ui.data.ReynosaUiState
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import java.time.format.TextStyle


@Composable
fun subCategoryLayerForExtraInfo(
    reynosaUiState: ReynosaUiState,
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = 8.dp, end = 8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        when (reynosaUiState.currentCategory) {
            R.string.extraInformationCategory1 -> displayExtraInformationCategory1()
            R.string.extraInformationCategory2 -> displayExtraInformationCategory2()
            else -> displayExtraInformationCategory3()
        }
    }
}

/**
 * Displays history of Reynosa
 */
@Composable
fun displayExtraInformationCategory1() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = stringResource(R.string.historyOfReynosaPart1))

        Spacer(modifier = Modifier.height(15.dp))

        Image(
            painter = painterResource(R.drawable.extrainfohistorypicture1),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillBounds,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = stringResource(R.string.historyOfReynosaPart2))

        Spacer(modifier = Modifier.height(15.dp))

        Image(
            painter = painterResource(R.drawable.extrainfohistorypicture2),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillBounds,
        )
    }
}

/**
 * Displays Valentin Elizalde history
 */

@Composable
fun displayExtraInformationCategory2() {

    Column {
        Row {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.extrainfovalentinelizaldepicture1),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = stringResource(R.string.valentinElizaldePart2),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Spacer(Modifier.width(10.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(R.string.valentinElizaldePart1),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Image(
                    painter = painterResource(R.drawable.extrainfohistorypicture1),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = stringResource(R.string.valentinElizaldePart3))

        Image(
            painter = painterResource(R.drawable.extrainfovalentinelizaldepicture3),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

    }
}

/**
 * Displays important places
 */
@Composable
fun displayExtraInformationCategory3() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.importantplacespicture1),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.importanPlacesName1),
            style = typography.headlineSmall
        )

        Text(text = stringResource(R.string.importantPlacesPart1))

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.importantplacespicture2),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.importanPlacesName2),
            style = typography.headlineSmall
        )

        Text(text = stringResource(R.string.importantPlacesPart2))

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.importantplacespicture3),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.importanPlacesName3),
            style = typography.headlineSmall
        )

        Text(text = stringResource(R.string.importantPlacesPart3))
    }
}

@Preview(showBackground = true, heightDp = 2000)
@Composable
fun previewExtraInformationCategories() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {

        displayExtraInformationCategory1()

        Spacer(modifier = Modifier.height(50.dp))

        displayExtraInformationCategory2()

        Spacer(modifier = Modifier.height(50.dp))

        displayExtraInformationCategory3()
    }
}
