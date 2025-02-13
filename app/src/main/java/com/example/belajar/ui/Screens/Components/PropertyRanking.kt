package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.example.belajar.ui.Screens.JakartaSansMedium
import com.example.belajar.ui.Screens.JakartaSansReguler

@Composable
fun PropertyRanking(rankingValue: Int, imageRanking: Int, nama_kost: String, alamatKost: String) {
    ElevatedCard(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        ),
        modifier = Modifier
            .size(width = 193.dp, height = 185.dp)
//            .padding(8.dp)
            .padding(start = 8.dp, end = 1.dp, top = 8.dp, bottom = 8.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp),

            ) {
                Image(
                    painter = painterResource(imageRanking),

                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .clip(RoundedCornerShape(16.dp)),
                )
                Box(
                    modifier = Modifier
                        .size(40.dp) // Ukuran ikon ranking
                        .padding(4.dp),
                    contentAlignment = Alignment.Center // Pusatkan isi Box
                ) {
                    Image(
                        painter = painterResource(
                            when (rankingValue) {
                                1 -> R.drawable.star1
                                2 -> R.drawable.star2
                                3 -> R.drawable.star3
                                else -> R.drawable.ic_launcher_background
                            }
                        ),
                        contentDescription = "star",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(2.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = rankingValue.toString(),
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontFamily = JakartaSansMedium,
                        fontSize = 14.sp,
                    )
                }
            }
            Text(
                nama_kost,
                fontWeight = FontWeight.Bold,
                fontFamily = JakartaSansReguler,
                fontSize = 14.sp,
                lineHeight = 5.sp
            )
            Text(
                alamatKost,
                fontSize = 12.sp,
//                fontWeight = FontWeight.Bold,
                fontFamily = JakartaSansReguler,
                color = Color(0xFF398423),
                lineHeight = 2.sp

            )
        }
    }
}


@Composable
@Preview
fun PropertyRankingPreview() {
    PropertyRanking(
        2,
        R.drawable.kost2,
        "Kost A",
        "palembang")
}