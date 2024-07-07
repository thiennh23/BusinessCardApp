package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun BusinessCardApp() {

}

@Composable
fun part1(
    imgPainter: Painter,
    name: String,
    title: String,
) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 180.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        Image(painter = imgPainter, contentDescription = null, alignment = Alignment.Center)
        Text(text = name, Modifier.padding(top = 16.dp), fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = title, Modifier.padding(top = 8.dp), fontSize = 20.sp, color = Color(0xFF167846))
    }
}

/*@Preview
@Composable
fun part1PReview() {
    part1(painterResource(id = R.drawable.android_logo), "Jennifer Doe", "Android Developer Extraordinary")
}*/

@Composable
fun part2(
    painter1: Painter,
    painter2: Painter,
    painter3: Painter,
    text1: String,
    text2: String,
    text3: String,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 230.dp, start = 77.dp),
        horizontalAlignment = Alignment.Start, // Align elements to start
        verticalArrangement = Arrangement.spacedBy(16.dp) // Space between rows
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp) // Add padding to the row
        ) {
            Image(painter = painter1, contentDescription = null)
            Text(text = text1, Modifier.padding(start = 10.dp), fontSize = 16.sp, color = Color(0xFF414e44))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Image(painter = painter2, contentDescription = null)
            Text(text = text2, Modifier.padding(start = 10.dp), fontSize = 16.sp, color = Color(0xFF414e44))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Image(painter = painter3, contentDescription = null)
            Text(text = text3, Modifier.padding(start = 10.dp), fontSize = 16.sp, color = Color(0xFF414e44))
        }
    }
}

/*@Preview
@Composable
fun part2PReview() {
    part2(
        painterResource(id = R.drawable.ic_phone),
        painterResource(id = R.drawable.ic_share),
        painterResource(id = R.drawable.ic_mail),
        "+11 (123) 444 555 666",
        "@AndroidDev",
        "jen.doe@gmail.com"
    )
}*/

@Preview
@Composable
fun BusinessCardPreview() {
    Column(
        Modifier.fillMaxSize()
            .background(Color(0xFFDFF5E9)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        part1(painterResource(id = R.drawable.android_logo), "Nguyen Huu Thien", "Android Developer Extraordinary")
        part2(
            painterResource(id = R.drawable.ic_phone),
            painterResource(id = R.drawable.ic_share),
            painterResource(id = R.drawable.ic_mail),
            "+11 (123) 444 555 666",
            "@AndroidDev",
            "thien.nguyen@gmail.com"
        )
    }
}
