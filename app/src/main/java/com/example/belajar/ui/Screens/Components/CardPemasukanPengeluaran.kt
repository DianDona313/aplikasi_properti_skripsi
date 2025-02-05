package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun CardPemasukanPengeluaran(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            ),
        ) {
            Row(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(R.drawable.perumahangriya),
                    contentDescription = "perumahan griya",
                    modifier = Modifier
                        .width(130.dp)
                        .height(130.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
//                Spacer(modifier = Modifier.height(35.dp))
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(start = 15.dp) // Sesuaikan padding di sekitar column
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally ,

                    ) {
                        Text("Kost Floral",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff013958),
                            fontFamily = JakartaSansReguler,
                            lineHeight = 1.sp
                        )
                        Spacer(modifier = Modifier.height(0.dp))
                        Text(
                            "Jl Flora Medium",
                            fontSize = 13.sp,
                            letterSpacing = (-0.2).sp,
                            fontFamily = JakartaSansReguler,
                            lineHeight = 1.sp, modifier = Modifier.padding(top = 3.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    HorizontalDivider(color = Color(0xffF09F38), thickness = 2.dp)
                    Spacer(modifier = Modifier.height(4.dp))
                    Column(
                        modifier = Modifier.padding(start = 15.dp)
                    ){
                        Text(
                        "Pemasukkan : Rp. 7.000.000",
                        fontSize = 12.sp,
                            color = Color(0xff013958),
                        fontFamily = JakartaSansReguler,
                        lineHeight = 16.sp,
                        maxLines = 2
                    )
                        Text(
                            "Pengeluaran : Rp. 7.000.000",
                            fontSize = 12.sp,
                            color = Color(0xff013958),
                            fontFamily = JakartaSansReguler,
                            lineHeight = 16.sp,
                            maxLines = 2
                        )
                        Text(
                            "Keuntungan : Rp. 7.000.000",
                            fontSize = 12.sp,
                            color = Color(0xff013958),
                            fontFamily = JakartaSansReguler,
                            lineHeight = 16.sp,
                            maxLines = 2
                        )
                        Text(
                            "Kerugian : Rp. 7.000.000",
                            fontSize = 12.sp,
                            color = Color(0xff013958),
                            fontFamily = JakartaSansReguler,
                            lineHeight = 16.sp,
                            maxLines = 2
                        )
                    }

                }
            }

        }
    }

}
@Preview
@Composable
fun CardPemasukanPengeluaranPreview(){
    CardPemasukanPengeluaran()
}