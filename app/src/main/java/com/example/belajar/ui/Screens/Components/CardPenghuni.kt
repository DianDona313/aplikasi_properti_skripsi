package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun CardPenghuni (nama:String){
    var showDialog by remember { mutableStateOf(false) }
    ElevatedCard(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        ),
        modifier = Modifier
            .size(width = 180.dp, height = 200.dp)
            .padding(8.dp)
            .shadow(elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .clip(RoundedCornerShape(12.dp)).clickable {
                showDialog = true
            }

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
                nama,
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

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                // This callback is invoked when the user clicks outside the dialog or on the back button
                showDialog = false
            },
            title = {
                Text(text = "Modal Title")
            },
            text = {
                Text("This is the modal content. Customize it as needed!")
            },
            confirmButton = {
                Button(
                    onClick = {
                        // Confirm action
                        showDialog = false
                    }
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        // Dismiss action
                        showDialog = false
                    }
                ) {
                    Text("Dismiss")
                }
            }
        )
    }
}
@Composable
@Preview
fun CardPenghuniPreview(){
    CardPenghuni("Kamar 100")
}