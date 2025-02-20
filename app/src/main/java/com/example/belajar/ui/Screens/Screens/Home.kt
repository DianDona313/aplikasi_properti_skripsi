package com.example.belajar.ui.Screens.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.belajar.R
import com.example.belajar.ui.Screens.Components.CardPemberitahuanHome
import com.example.belajar.ui.Screens.JakartaSansBold
import com.example.belajar.ui.Screens.JakartaSansReguler
import com.example.belajar.ui.Screens.JakartaSansSemiBold
import com.example.belajar.ui.Screens.appbar.TopAppBarProfile
import com.example.navbar.BottomNavBar

@Composable
fun Home(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(paddingValues)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.perumahangriya),
            contentDescription = "Foto Home",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )
        {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    "Properti Anda yang banyak diminati",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    fontFamily = JakartaSansSemiBold,
                    lineHeight = 25.sp,
                    modifier = Modifier.width(230.dp)
                )
            }
            Column {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    "Selengkapnya",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0XFF828F9B),
                    fontFamily = JakartaSansSemiBold,
                    lineHeight = 20.sp
                )
            }
        }
        ScreenRanking()
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp),
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .shadow(8.dp, shape = CircleShape)
                    .clip(CircleShape)
            ) {
                Image(
                    painter = painterResource(R.drawable.charthome),
                    contentDescription = "Chart Home",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)

                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {
                Text(
                    "Keuangan Terkini",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0XFF2D3339),
                    fontFamily = JakartaSansSemiBold,
                    lineHeight = 20.sp,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF398423))

                ) {
                    Row(
                        modifier = Modifier.padding(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.downloadsimple),
                            contentDescription = "Deskripsi Ikon",
                            modifier = Modifier.size(25.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(
                                text = "Pemasukkan",
                                fontSize = 14.sp,
                                fontFamily = JakartaSansReguler,
                                color = Color.White
                            )
                            Text(
                                text = "Rp 1.000.000",
                                fontFamily = JakartaSansBold,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF398423))

                ) {
                    Row(
                        modifier = Modifier.padding(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.uploadsimple),
                            contentDescription = "Deskripsi Ikon",
                            modifier = Modifier.size(25.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(
                                text = "Pengeluaran",
                                fontSize = 14.sp,
                                fontFamily = JakartaSansReguler,
                                color = Color.White
                            )
                            Text(
                                text = "Rp 500.000",
                                fontFamily = JakartaSansBold,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color.White
                            )
                        }
                    }
                }

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 2.dp)
        )
        {
            Text(
                "Pemberitahuan",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                fontFamily = JakartaSansSemiBold,
                lineHeight = 25.sp,
                modifier = Modifier.fillMaxWidth()
            )

            Row (modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(rememberScrollState())){
                CardPemberitahuanHome(
                    "Tagihan Air",
                    "Rp 234.000"
                )
                CardPemberitahuanHome(
                    "Tagihan Air",
                    "Rp 234.000"
                )
            }


        }

    }
}

@Composable
fun ScreenHome() {
    Scaffold(
        bottomBar = {
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
        },
        topBar = {
            TopAppBarProfile(
                onBackClick = { },
                onProfileClick = { },
                title = "MyKost"
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                containerColor = Color(0xFF398423),
                modifier = Modifier
                    .padding(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.buttontambah),
                    contentDescription = "Tambah",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    ) { paddingValues ->
        Home(paddingValues)
    }
}


@Preview
@Composable
fun HomePreview() {
    ScreenHome()
}
