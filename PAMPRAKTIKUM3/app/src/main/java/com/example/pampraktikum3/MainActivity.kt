package com.example.pampraktikum3

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pampraktikum3.ui.theme.PAMPRAKTIKUM3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMPRAKTIKUM3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "RIZQI INDAH PRATIWI",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp)
        )

        Spacer(modifier = Modifier.padding(13.dp))
        statusbox()
        Spacer(modifier = Modifier.padding(13.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(13.dp))
        BoxKeterangan()


    }
}

@Composable
fun statusbox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Cyan)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.background
                ),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Rain",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(13.dp)
            )
        }
    }
}

@Composable
fun Lokasi() {
    Text(text = "19°C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "location"
        )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(
            text = "Yogyakarta",
            fontSize = 35.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.padding(8.dp))
    Text(
        text = "Tamantirto, Kaishan, Bantul, Daerah Istimewa Yogyakarta",
        fontSize = 20.sp,
        textAlign = TextAlign.Center,

    )
}
@Composable
fun BoxKeterangan() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp))
            .background(color = Color.Cyan)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(30.dp)

        ) {
            Spacer(modifier = Modifier.padding(8.dp))
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Humidity",
                    fontSize = 18.sp,

                    )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = "UV Index",
                    fontSize = 18.sp,

                    )
            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = "98%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Spacer(modifier = Modifier.width(147.dp))
                Text(
                    text = "9 / 10",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(modifier = Modifier.padding(18.dp))

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Sunrise",
                    fontSize = 18.sp,

                    )
                Spacer(modifier = Modifier.width(136.dp))
                Text(
                    text = "Sunset",
                    fontSize = 18.sp,

                    )
            }
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(0.dp))
                Text(
                    text = "05.00 AM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Spacer(modifier = Modifier.width(105.dp))
                Text(
                    text = "05.40 PM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAMPRAKTIKUM3Theme {
        Home()
    }
}