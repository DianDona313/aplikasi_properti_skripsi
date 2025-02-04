package com.example.belajar.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.appbar.TopAppBarApps

@Composable
fun ScreenAktivitasUang() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF4FDE3))
    ) {
        Column {
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                TopAppBarApps(
                    onBackClick = { /* Handle back click */ },
                    title = "Tambah Properti"
                )
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Kos Floral",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF184E0D),
                        lineHeight = 1.sp,
                        fontFamily = JakartaSansBold
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                SearchBar()
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp) // Jarak antar tombol
                ) {
                    Button(
                        onClick = { /* TODO: Handle print action */ },
                        modifier = Modifier
                            .weight(1f) // Membuat tombol memiliki ukuran yang sama
                            .height(37.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4A8522)
                        ),
                        shape = RoundedCornerShape(8.dp) // Membuat tombol membulat
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward, // Gunakan ikon print
                            contentDescription = "Print",
                            tint = Color(0xFFEFE4B0) // Warna ikon
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Print")
                    }

                    Button(
                        onClick = { /* TODO: Handle share action */ },
                        modifier = Modifier
                            .weight(1f)
                            .height(37.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4A8522)
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("Share")
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.Share, // Gunakan ikon share
                            contentDescription = "Share",
                            tint = Color(0xFFEFE4B0)
                        )
                    }
                }

//            AktivitasUang(
//                title = "Sampah Bulanan",
//                tanggal = "3 Feb 2025",
//                jam = "12.00",
//                image = R.drawable.mobil,
//                nominal = "Rp 30.000",
//                jenis = "Pengeluaran",
//                pembayaran = "Tunai"
//            )
//            AktivitasUang(
//                "Listrik Bulanan",
//                "12 Nov 2024",
//                "17.34", R.drawable.lampu,
//                "Rp 1.500.000",
//                "Pemasukan",
//                "Cash"
//            )
            }
            SelectionContainer(
                modifier = Modifier.padding(2.dp)
            ) {
                AktivitasUang(
                    title = "Sampah Bulanan",
                    tanggal = "3 Feb 2025",
                    jam = "12.00",
                    image = R.drawable.mobil,
                    nominal = "Rp 30.000",
                    jenis = "Pengeluaran",
                    pembayaran = "Tunai"
                )
            }
            AktivitasUang(
                "Listrik Bulanan",
                "12 Nov 2024",
                "17.34", R.drawable.lampu,
                "Rp 1.500.000",
                "Pemasukan",
                "Cash"
            )
        }

    }
}

@Composable
@Preview
fun ScreenAktivitasUangPreview() {
    ScreenAktivitasUang()
}