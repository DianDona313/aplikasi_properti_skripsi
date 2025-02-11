package com.example.navbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
                    "Beranda" to R.drawable.home, // Ganti dengan nama ikon yang sesuai
                    "Properti" to R.drawable.properti,
                    "Penghuni" to R.drawable.penyewa,
                    "Jadwal" to R.drawable.jadwal,
                    "Statistik" to R.drawable.statistik
                ),
                containerColor = Color.White,
                selectedColor = Color(0xFF398423), // Warna hijau untuk tab aktif
                unselectedColor = Color(0xFF828F9B)
            )
        }
    }
}

@Composable
fun BottomNavBar(
    items: List<Pair<String, Int>>, // Menggunakan resource ID gambar
    iconSize: androidx.compose.ui.unit.Dp = 24.dp, // Parameter untuk ukuran ikon
    containerColor: Color = Color.White,
    selectedColor: Color = Color.Blue,
    unselectedColor: Color = Color.Gray
) {
    var selectedTab by remember { mutableStateOf(0) }

    NavigationBar(

        containerColor = containerColor, // Warna latar belakang navbar
        contentColor = unselectedColor
    ) {
        items.forEachIndexed { index, (title, iconRes) ->
            NavigationBarItem(
                icon = {
                    Image(
                        painter = painterResource(id = iconRes), // Menggunakan painterResource untuk ikon
                        contentDescription = title,
                        modifier = Modifier.padding(0.dp).size(iconSize)
                    )
                    if (selectedTab == index) {
                        Divider(
                            color = selectedColor,
                            thickness = 3.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp)
                        )
                    }
                },
                label = {
                    Text(
                        text = title,
                        style = TextStyle(
                            fontSize = 12.sp, // Ubah ukuran teks
                            fontFamily = JakartaSansSemiBold, // Gunakan font kustom
                            fontWeight = FontWeight.Bold, // Tebal
                            color = if (selectedTab == index) selectedColor else unselectedColor
                        )
                    )
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
        iconSize = 30.dp, // Ukuran ikon diubah untuk preview
        containerColor = Color.White,
        selectedColor = Color(0xFF398423), // Warna hijau untuk tab aktif
        unselectedColor = Color(0xFF828F9B)
    )
}
