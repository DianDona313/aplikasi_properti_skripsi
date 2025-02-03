package com.example.belajar.ui.Screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R

@Composable
fun AktivitasUang(title:String,tanggal:String,jam:String,image:Int, nominal:String,jenis:String, pembayaran:String){
    Column (modifier = Modifier.fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()

                .background(Color(0xFFF4FDE3)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .padding(6.dp)
                    .background(Color(0xFFFDE5AF), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(image),
                    contentDescription = "Listrik",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .width(100.dp)
                        .padding(6.dp),
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = JakartaSansSemiBold,
                    color = Color(0xFF090A0B)
                )
                Text(
                    text = tanggal,
                    fontSize = 14.sp,
                    fontFamily = JakartaSansMedium,
                    color = Color.Gray
                )
                Text(
                    text = jam,
                    fontSize = 14.sp,
                    fontFamily = JakartaSansReguler,
                    color = Color.Gray
                )
            }

            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(6.dp)) {
                Text(
                    text = nominal,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = JakartaSansSemiBold,
                    color = Color(0xFF090A0B)
                )
                Text(
                    text = jenis,
                    fontSize = 14.sp,
                    fontFamily = JakartaSansMedium,
                    color = Color(0xFF398423) // Hijau
                )
                Text(
                    text = pembayaran,
                    fontSize = 14.sp,
                    fontFamily = JakartaSansReguler,
                    color = Color.Gray
                )
            }
        }
        Spacer(modifier = Modifier.padding(0.dp))
        HorizontalDivider(color = Color(0xffF09F38), thickness = 1.dp)
    }
}

@Composable
@Preview
fun AktivitasUangPreview(){
    AktivitasUang("Listrik Bulanan","12 Nov 2024","17.34",R.drawable.lampu,"Rp 1.500.000", "Pemasukan","Cash")
}