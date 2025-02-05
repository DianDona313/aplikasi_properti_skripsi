package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.belajar.R
import com.google.android.datatransport.Event

@Composable
fun ConfirmationPopup(onDismiss: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFDF2D8) // Warna background sesuai gambar
        ),
        modifier = Modifier
            .size(width = 304.dp, height = 376.dp) // Ukuran tetap
            .padding(0.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            // Tombol Close (X)
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(
                    onClick = { onDismiss() },
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Icon(Icons.Default.Close, contentDescription = "Tutup")
                }
            }

            // Nama Pengguna
            Text(
                text = "Ade Prayogo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Foto Profil
            Image(
                painter = painterResource(id = R.drawable.orang1), // Ganti dengan gambar yang sesuai
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(2.dp, Color.Gray, RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Informasi Status Bayar, Jadwal Tagihan, Masa Sewa
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                InfoItem(Icons.Default.CheckCircle, "Status Bayar", "Belum lunas", Color.Red)
                InfoItem(Icons.Default.DateRange, "Jadwal Tagihan", "4 Nov 2024", Color.Black)
                InfoItem(Icons.Default.Create, "Masa Sewa", "4 Nov - 4 Apr 2024", Color.Black)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Tombol Aksi
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                ActionButton("Ingatkan Tagihan", Color(0xFF2D9634)) // Warna hijau sesuai gambar
                ActionButton("Tambah Durasi Sewa", Color(0xFF1B7B60)) // Hijau lebih gelap
            }
        }
    }
}

@Composable
fun InfoItem(icon: ImageVector, title: String, value: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(icon, contentDescription = title, tint = color, modifier = Modifier.size(24.dp))
        Text(text = title, fontSize = 12.sp, color = Color.Gray)
        Text(text = value, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = color)
    }
}

@Composable
fun ActionButton(text: String, backgroundColor: Color) {
    Button (
        onClick = { /* Tambahkan aksi */ },
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(horizontal = 4.dp)
    ) {
        Text(text, color = Color.White)
    }
}

@Preview
@Composable
fun PreviewPopup() {
    ConfirmationPopup(onDismiss = {})
}
