package com.example.gandhisknownspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gandhisknownspaceapp.data.personInfo
import com.example.gandhisknownspaceapp.data.persons
import com.example.gandhisknownspaceapp.data.persons.personsInfo
import com.example.gandhisknownspaceapp.ui.theme.DarkColors
import com.example.gandhisknownspaceapp.ui.theme.GandhisKnownSpaceAppTheme
import com.example.gandhisknownspaceapp.ui.theme.LightColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GandhisKnownSpaceAppTheme (darkTheme = true) {
                personApp()
            }
        }
    }
}

@Composable
@Preview
fun preview (){
    GandhisKnownSpaceAppTheme {
        personCard(persons.personsInfo[0])
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun personTopBarApp(modifier : Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ){
               Image(
                   painter = painterResource(R.drawable.bola_de_disco),
                   contentDescription = null,
                   modifier = modifier
                       .size(dimensionResource(R.dimen.image_size))
                       .padding(dimensionResource(R.dimen.padding_small))
               )

                Text(text = stringResource(R.string.app_name), style = MaterialTheme.typography.displayMedium)
            }
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun personApp(
    modifier: Modifier = Modifier
){

    Scaffold(
        topBar = {
            personTopBarApp()
        }
    ){ it ->
        LazyColumn(contentPadding = it) {
            items(persons.personsInfo) {
                personCard(person = it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun personCard(
    person : personInfo,
) {
    var expanded by remember { mutableStateOf(false) }

    Card(modifier = Modifier
        .padding(10.dp)
        .clickable { expanded = !expanded }){
        Box(modifier = Modifier
            .padding(5.dp)
        ){
            Column(
                modifier = Modifier
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioNoBouncy,
                            stiffness = Spring.StiffnessMedium
                        )
                    )
            ){
                Row(modifier = Modifier.fillMaxWidth()) {

                    personIconDisplay(image = person.picture)

                    personNameAgeAndIconDisplay(
                        name = person.name,
                        age = person.age,
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    personBottom(
                        expanded = expanded,
                        onClick = { expanded = !expanded },
                    )
                }

                if(expanded){
                    Text(
                        text = stringResource(person.description),
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun personBottom(
    expanded : Boolean,
    onClick : () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}


@Composable
fun personIconDisplay(
    @DrawableRes image : Int,
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(image),
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = Modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.large)
    )
}

@Composable
fun personNameAgeAndIconDisplay(
    @StringRes name : Int,
    age : Int,
    modifier: Modifier = Modifier
){

        Column(modifier = modifier
            .padding(dimensionResource(R.dimen.padding_small))
        ) {
            Text(text = stringResource(name), style = MaterialTheme.typography.displayMedium)
            Text(text = "$age years old", style = MaterialTheme.typography.bodyLarge)
        }

}

