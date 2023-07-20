package com.example.reflectivephrases30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExpandLess
import androidx.compose.material.icons.rounded.ExpandMore
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reflectivephrases30.data.ReflexivePhraseData
import com.example.reflectivephrases30.data.ReflexivePhraseProperties
import com.example.reflectivephrases30.ui.theme.ReflectivePhrases30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReflectivePhrases30Theme (darkTheme = true){
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PhraseApp()
                }
            }
        }
    }
}
@Preview
@Composable
fun PhraseAppPreviewLightTheme(){
    ReflectivePhrases30Theme {
        PhraseApp()
    }
}

@Preview
@Composable
fun PhraseAppPreviewDarkTheme(){
    ReflectivePhrases30Theme(darkTheme = true){
        PhraseApp()
    }
}

@Preview(showSystemUi = true)
@Composable
fun PhraseCardPreviewDarkTheme(){
    ReflectivePhrases30Theme(darkTheme = true){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            PhraseCard(reflexive = ReflexivePhraseData[0], numberAdvice = 1)
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun PhraseApp(phrases_list : List<ReflexivePhraseProperties> = ReflexivePhraseData.shuffled()){
    Scaffold (
        topBar = {
            PhraseTopBarApp()
        }
    ){it ->
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = it,
            modifier = Modifier.fillMaxSize()
        ){

            itemsIndexed(phrases_list){index, item ->
                PhraseCard(reflexive = item, index)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhraseTopBarApp(){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    imageVector = Icons.Rounded.Person,
                    contentDescription = stringResource(R.string.app_name),
                    tint = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.headlineLarge,
                )

                Icon(
                    imageVector = Icons.Rounded.Person,
                    contentDescription = stringResource(R.string.app_name),
                    tint = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.size(35.dp)
                )
            }
        }
    )
}

@Composable
fun PhraseCard(
    reflexive : ReflexivePhraseProperties,
    numberAdvice : Int,
){
    var expand by  remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
    ){
            Box(modifier = Modifier.clickable { expand = !expand }
            ){
                Column(
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_medium))
                        .animateContentSize(
                            animationSpec = spring(
                                dampingRatio = 2f,
                            )
                        )
                    )
                {
                    Row(
                        modifier = Modifier.padding(
                        top = 8.dp,
                        end = 8.dp
                        )
                    ){

                        Text(
                            text = "Advice #${numberAdvice + 1}",
                            style = MaterialTheme.typography.bodyLarge
                        )

                        Spacer(Modifier.weight(1f))
                        PhraseButton(imageVector = if(expand) Icons.Rounded.ExpandLess else Icons.Rounded.ExpandMore){
                           expand = !expand
                        }
                    }

                    PhraseName(reflexive.name)

                    PhrasePicture(
                        picture = reflexive.picture,
                        name = reflexive.name,
                        modifier = Modifier.align(Alignment.End )
                    )

                    if(expand) PhraseText(advice = reflexive.phrase)
                }
            }
        }
}

@Composable
fun PhraseName (
    @StringRes name : Int
){
    Text(
        text = stringResource(name),
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium))
    )
}

@Composable
fun PhraseButton(
    imageVector : ImageVector,
    onClick : () -> Unit
){
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(17.dp)
            .padding(

            )
    ) {
        Icon(
            imageVector =  imageVector,
            contentDescription = null,
            modifier = Modifier
        )
    }
}


@Composable
fun PhrasePicture(
    @DrawableRes picture : Int,
    @StringRes name : Int,
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(picture),
        contentDescription = stringResource(name),
        modifier = Modifier
            .fillMaxWidth(),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun PhraseText(
    @StringRes advice : Int
){
    Text(
        text = stringResource(advice),
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
            .padding(top  = dimensionResource(R.dimen.padding_medium))
    )
}


