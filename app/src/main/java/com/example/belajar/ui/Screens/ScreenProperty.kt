package com.example.belajar.ui.Screens


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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R

@Composable
fun ScreenProperty(modifier: Modifier) {
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
                    Row(modifier = Modifier.padding(top = 8.dp)) {
                        Text("Kost Floral",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = JakartaSansReguler,
                            lineHeight = 2.sp
                        )
                        Spacer(modifier = Modifier.width(4.dp)) // Jarak antar teks horizontal
                        Text(
                            "Jl Flora Medium",
                            fontSize = 13.sp,
                            letterSpacing = (-0.2).sp,
                            fontFamily = JakartaSansReguler,
                            lineHeight = 12.sp, modifier = Modifier.padding(top = 3.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp)) // Jarak antar teks vertikal
                    Text(
                        "Rp 400.000-650.000",
                        fontSize = 12.sp,
                        color = Color(0xFF398423),
                        fontStyle = FontStyle.Italic,
                        fontFamily = JakartaSansReguler,
                        lineHeight = 16.sp,
                        maxLines = 2
                    )
                    Spacer(modifier = Modifier.height(2.dp)) // Jarak antar teks
                    Text(
                        "Sisa 1 Kamar",
                        fontSize = 12.sp,
                        color = Color(0xFFE4626F),
                        lineHeight = 12.sp
                        )
                    Spacer(modifier = Modifier.height(4.dp)) // Jarak antar teks dan card
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(1.dp),
                        colors = androidx.compose.material3.CardDefaults.cardColors(
                            containerColor = Color(0xFFFCBA03)
                        )
                    ) {
                        Text(
                            text = "Campur",
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp) // Padding dalam card
                        )
                    }
                }
            }

        }
    }
}

@Composable
@Preview
fun ScreenPropertyPreview() {
    ScreenProperty(modifier = Modifier)
}