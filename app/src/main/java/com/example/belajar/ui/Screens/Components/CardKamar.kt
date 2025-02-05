package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.JakartaSansReguler


@Composable
fun CardKamar(modifier: Modifier) {
//    Card (
//        modifier = Modifier.height(350.dp)
//    ){
//        Column()
//        {
//            Row(modifier = Modifier.fillMaxWidth()){
//                Image(
//                    painter = painterResource(R.drawable.kost2),
//                    contentDescription = null,
//                    modifier = Modifier.fillMaxWidth()
//                )
//            }
//            Text("Kost Floral", fontSize = 15.sp, color = Color.Black, fontWeight = FontWeight.Bold)
//            Text("Fasilitas: Ac, Single Bed, Rak Buku", fontSize = 12.sp, color = Color(0xFF398423))
//
//
//        }
//
//    }

    ElevatedCard(
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 12.dp
//        ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        ),
        modifier = Modifier
            .size(width = 170.dp, height = 200.dp)
            .padding(8.dp)
            .shadow(elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .clip(RoundedCornerShape(12.dp))
//            .clip(RoundedCornerShape(12.dp))

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.perumahangriya),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.padding(top = 2.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 0.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                "Kamar 10A",
                fontWeight = FontWeight.Bold,
                fontFamily = JakartaSansReguler,
                lineHeight = 14.sp
            )
//            Spacer(modifier = Modifier.padding(top = 5.dp))
            Text(
                "Fasilitas: Ac, Single Bed, Rak Buku, Wifi, Meja, Kursi, dll",
                fontSize = 10.sp,
                fontFamily = JakartaSansReguler,
                letterSpacing = (-0.2).sp,
                color = Color(0xFF398423),
                lineHeight = 12.sp
            )
            Spacer(modifier = Modifier.padding(top = 5.dp))
        }
    }
}

@Composable
@Preview
fun CardKamarPreview() {
    CardKamar(modifier = Modifier)
}
