package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadePreview()
                }
            }
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        LemonadeDrink(tittle = "Lemonade")

    }
}

@Composable
fun LemonadeDrink(
    tittle: String,
    modifier: Modifier = Modifier

) {
    var result by remember {
        mutableStateOf(0)
    }
    var randomNumber by remember{
        mutableStateOf((2..5).random())
    }

    var painterResource = when(result){
        in 1..randomNumber -> R.drawable.lemon_squeeze
        randomNumber + 1         -> R.drawable.lemon_drink
        randomNumber + 2         -> R.drawable.lemon_restart
        else -> {
            result = 0
            R.drawable.lemon_tree
        }
    }

    var stringResource = when(result){
        in 1..randomNumber -> R.string.keep_tapping
        randomNumber + 1         -> R.string.tap_the_lemonade
        randomNumber + 2         -> R.string.empty_glass
        else -> {
            result = 0
            R.string.tap_the_tree
        }
    }


    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFe7f739)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(15f)
                .wrapContentSize(Alignment.Center)

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = painterResource),
                    modifier = modifier
                        .clip(RoundedCornerShape(35.dp))
                        .background(Color(0xFFbaeaff))
                        .clickable(
                            enabled = true,
                            onClickLabel = null,
                            role = null,

                            onClick = {
                                result++
                            },
                        )
                        .padding(36.dp),
                    contentDescription = painterResource.toString(),
                )
                Spacer(modifier.height(20.dp))
                Text(
                    text = stringResource(stringResource),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
