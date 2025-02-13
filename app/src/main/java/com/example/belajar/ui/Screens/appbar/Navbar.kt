package com.example.navbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.JakartaSansSemiBold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBar(
                items = listOf(
                    "Beranda" to R.drawable.home,
                    "Properti" to R.drawable.properti,
                    "Penghuni" to R.drawable.penyewa,
                    "Jadwal" to R.drawable.jadwal,
                    "Statistik" to R.drawable.statistik
                ),
                containerColor = Color.White,
                selectedColor = Color(0xFF398423),
                unselectedColor = Color(0xFF828F9B)
            )
        }
    }
}

@Composable
fun BottomNavBar(
    items: List<Pair<String, Int>>,
    iconSize: androidx.compose.ui.unit.Dp = 24.dp,
    containerColor: Color = Color.White,
    selectedColor: Color = Color(0xFF398423),
    unselectedColor: Color = Color.White
) {
    var selectedTab by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = containerColor,
        contentColor = unselectedColor
    ) {
        items.forEachIndexed { index, (title, iconRes) ->
            NavigationBarItem(
                icon = {
                    Image(
                        painter = painterResource(id = iconRes),
                        contentDescription = title,
                        modifier = Modifier.size(iconSize)
                    )
                },
                label = {
                    Column (modifier = Modifier){
                        Text(
                            text = title,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = JakartaSansSemiBold,
                                fontWeight = FontWeight.Bold,
                                color = if (selectedTab == index) selectedColor else unselectedColor
                            )
                        )
                        if (selectedTab == index) {
                            Divider(
                                color = selectedColor,

                                thickness = 3.dp,
                                modifier = Modifier
                                    .width(50.dp)
                                    .padding(top = 4.dp)
                                    .align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                },
                selected = selectedTab == index,
                onClick = { selectedTab = index },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = selectedColor,
                    unselectedIconColor = unselectedColor
                )
            )
        }
    }
}

@Preview
@Composable
fun BottomNavbarPreview() {
    BottomNavBar(
        items = listOf(
            "Beranda" to R.drawable.home,
            "Properti" to R.drawable.properti,
            "Penghuni" to R.drawable.penyewa,
            "Jadwal" to R.drawable.jadwal,
            "Statistik" to R.drawable.statistik
        ),
        iconSize = 30.dp,
        containerColor = Color.White,
        selectedColor = Color(0xFF398423),
        unselectedColor = Color(0xFF828F9B)
    )
}
