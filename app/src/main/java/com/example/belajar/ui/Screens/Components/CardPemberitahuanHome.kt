package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.JakartaSansMedium
import com.example.belajar.ui.Screens.JakartaSansReguler

@Composable
fun CardPemberitahuanHome(judul: String, uang: String){
    Card(
        modifier = Modifier
            .width(240.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EBED))
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lampu), // Ganti dengan ikon lampu
                    contentDescription = "Ikon Lampu",
                    modifier = Modifier.size(32.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = judul,
                        fontSize = 12.sp,
                        fontFamily = JakartaSansMedium,
                        color = Color.Black
                    )
                    Text(
                        text = uang,
                        fontSize = 12.sp,
                        fontFamily = JakartaSansReguler,
                        color = Color.Black
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.arrowcircleright), // Ganti dengan ikon panah kanan
                contentDescription = "Ikon Arah",
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Preview
@Composable
fun CardPemberitahuanHomePreview(){
    CardPemberitahuanHome("Tagihan Listrik Bulan Ini","Rp 1.200.000")
}