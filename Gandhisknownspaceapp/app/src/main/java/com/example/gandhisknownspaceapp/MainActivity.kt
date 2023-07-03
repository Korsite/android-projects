package com.example.gandhisknownspaceapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRailDefaults.ContainerColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gandhisknownspaceapp.ui.theme.GandhisKnownSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GandhisKnownSpaceAppTheme {
                SpaceAppPreview()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpaceApp(modifier: Modifier = Modifier) {

    var count by remember {
        mutableStateOf(0)
    }

    var color_count by remember {
        mutableStateOf((1..11).random())
    }

    val description = when(count){
        -1 -> {
            count = 10
            R.drawable.marco
        }
        0 -> R.drawable.elsy
        1 -> R.drawable.daza
        2 -> R.drawable.paola
        3 -> R.drawable.pepe
        4 -> R.drawable.alejandro
        5 -> R.drawable.alin
        6 -> R.drawable.daniel
        7 -> R.drawable.david
        8 -> R.drawable.gilberto
        9 -> R.drawable.karla
        10 -> R.drawable.marco
        else -> {
            count = 0
            R.drawable.elsy
        }
    }

    val name = when(count){
        0 -> R.string.elsy_name
        1 -> R.string.daza_name
        2 -> R.string.paola_name
        3 -> R.string.pepe_name
        4 -> R.string.alejandro_name
        5 -> R.string.alin_name
        6 -> R.string.daniel_name
        7 -> R.string.david_name
        8 -> R.string.gilberto_name
        9 -> R.string.karla_name
        10 -> R.string.marco_name
        else -> {
            count = 0
            R.drawable.elsy
        }
    }

    val year = when(count){
        0 -> R.string.elsy_year
        1 -> R.string.daza_year
        2 -> R.string.paola_year
        3 -> R.string.pepe_year
        4 -> R.string.alejandro_year
        5 -> R.string.alin_year
        6 -> R.string.daniel_year
        7 -> R.string.david_year
        8 -> R.string.gilberto_year
        9 -> R.string.karla_year
        10 -> R.string.marco_year
        else -> {
            count = 0
            R.drawable.elsy
        }
    }

    var color = when (color_count){
        1 -> Color(0XFFd5d7db)
        2 -> Color(0XFF79f2e3)
        3 -> Color(0XFFffb580)
        4 -> Color(0XFFfaed8e)
        5 -> Color(0XFFd1ff91)
        6 -> Color(0XFF92fcb0)
        7 -> Color(0XFF92bbfc)
        8 -> Color(0XFFa992fc)
        9 -> Color(0XFFd792fc)
        10 -> Color(0XFFcc75ff)
        else -> Color(0xFFF77F7F)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            fontSize = 20.sp,
            text = "Gandhi's known persons",
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(0.7f)
                .background(color)
                .wrapContentSize(Center),
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = modifier
                .wrapContentWidth(CenterHorizontally)
                .padding(30.dp)
                .shadow(5.dp)
                .weight(8f)
        ){
            Image(
                painter = painterResource(id = description),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Center)
                    .fillMaxSize()
                    .padding(30.dp),
                contentScale = ContentScale.FillHeight
            )
        }

        Row(
            modifier = modifier
                .wrapContentSize(Center)
                .padding(20.dp)
                .background(color)
                .weight(3f),
            horizontalArrangement = Arrangement.Start

        ){
            personDescription(
                name = stringResource(name),
                year = stringResource(year),
            )
        }
        

        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(
                    start = 10.dp,
                    end = 10.dp
                )
        ) {

            Button(
                onClick = {
                    count--
                    color_count = (1..11).random()
                          },
                modifier = modifier
                    .weight(1f)
                    .wrapContentSize(Center)
                    .width(140.dp),
                colors =  ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text(text = "Previous")
            }


            Button(
                onClick = {
                    count++
                    color_count = (1..11).random()
                },
                modifier = modifier
                    .weight(1f)
                    .wrapContentSize(Center)
                    .width(140.dp),
                colors =  ButtonDefaults.buttonColors(Color.Black)
                )
            {
                Text(text = "Next")
            }
        }
    }
}

@Composable
fun personDescription(
    name : String,
    year : String,
        modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(10.dp)
    ) {
        Text(
            text = name,
            fontSize = 25.sp,
            modifier = modifier
                .padding(10.dp),
            style = MaterialTheme.typography.labelMedium,

        )

        Text(text = year)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SpaceAppPreview() {
    GandhisKnownSpaceAppTheme {
        SpaceApp()
    }
}