package com.example.businesscard

import android.graphics.Paint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.invalidateGroupsWithKey
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardPreview(
                        name = "Gandhi SS.",
                        job = "Android Developer Extraordinaire",
                        cellphone = "(+52) 899 149 6408",
                        nameInInstagram = "@Zobroas Sanchez",
                        gmail = "hsr49rsh@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardPreview(
    name : String, job : String, modifier: Modifier = Modifier,
    cellphone : String, nameInInstagram : String, gmail : String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color = Color(0xFFccdde3))


    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .weight(3f)
        ) {
            ImageBusinessCard(
                name = name,
                job = job,
                modifier = Modifier
                    .align(CenterHorizontally)
            )
        }

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .weight(1f)
        ){
            InfoDeveloper(
                cellphone = cellphone,
                nameInInstagram = nameInInstagram,
                gmail = gmail
            )
        }
    }
}


@Composable
fun ImageBusinessCard(
    name : String, job : String, modifier: Modifier = Modifier
    ){
    val image = painterResource(id = R.drawable.android_logo)

//    Icon(Icons.Rounded.Call, contentDescription = null)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .background(Color(0xFF142333))
            .size(100.dp),
    )
    Text(
        text = name,
        fontSize = 30.sp,
        modifier = modifier
    )
    Text(
        text = job,
        color = Color(0xFF29913d),
        fontWeight = FontWeight.Bold
    )

}

@Composable
fun InfoDeveloper(cellphone : String, nameInInstagram : String, gmail : String, modifier : Modifier = Modifier){
    Column(
    ){
        Row(
            modifier = modifier
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Call,
                tint = Color(0xFF29913d),
                contentDescription = null
            )
            Text(
                text = cellphone,
                modifier = modifier
                    .padding(
                        start = 15.dp
                    ),
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = modifier
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                tint = Color(0xFF29913d),
                contentDescription = null
            )
            Text(
                text = nameInInstagram,

                modifier = modifier
                    .padding(
                        start = 15.dp
                    ),
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = modifier
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                tint = Color(0xFF29913d),
                contentDescription = null
            )
            Text(
                text = gmail,
                modifier = modifier
                    .padding(
                        start = 15.dp
                    ),
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardPreview(
            name = "Gandhi SS.",
            job = "Android Developer Extraordinaire",
            cellphone = "(+52) 899 149 6408",
            nameInInstagram = "@Zobroas Sanchez",
            gmail = "hsr49rsh@gmail.com"
        )
    }
}

@Composable
@Preview(
    showBackground = true
)
fun GreetingInfoDeveloper(){
    InfoDeveloper(cellphone = "899 149 6408", nameInInstagram = "@Zobroas", gmail = "hsr49rsh")
}