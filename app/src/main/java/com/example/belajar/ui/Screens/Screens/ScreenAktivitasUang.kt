package com.example.belajar.ui.Screens.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.Components.AktivitasUang
import com.example.belajar.ui.Screens.JakartaSansBold
import com.example.belajar.ui.Screens.Components.SearchBar
import com.example.belajar.ui.Screens.JakartaSansMedium
import com.example.belajar.ui.Screens.appbar.TopAppBarApps

@Composable
fun ScreenAktivitasUang(paddingValues: PaddingValues) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF4FDE3))
    ) {
        Column {
            TopAppBarApps(
                onBackClick = { /* Handle back click */ },
                title = "Pemasukan & Pengeluaran"
            )
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {

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
                Spacer(modifier = Modifier.height(10.dp))
                SearchBar()
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp) // Jarak antar tombol
                ) {
                    Button(
                        onClick = { },
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
                        onClick = { },
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

            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFEAECEE), shape = RoundedCornerShape(8.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Bulan Ini",
                    fontFamily = JakartaSansMedium,
                    modifier = Modifier.padding(16.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B860)),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.padding(end = 12.dp)
                ) {
                    Text(
                        text = "Pengeluaran",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B860)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "Pemasukan",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            SelectionContainer(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    AktivitasUang(
                        title = "Sampah Bulanan",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
                    AktivitasUang(
                        "Listrik Bulanan",
                        "12 Nov 2024",
                        "17.34", R.drawable.lampu,
                        "Rp 1.500.000",
                        "Pemasukan",
                        "Cash"
                    )
                    AktivitasUang(
                        title = "Sampah Bulanan",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
                    AktivitasUang(
                        "Listrik Bulanan",
                        "12 Nov 2024",
                        "17.34", R.drawable.lampu,
                        "Rp 1.500.000",
                        "Pemasukan",
                        "Cash"
                    )
                    AktivitasUang(
                        title = "Sampah Bulanan",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
                    AktivitasUang(
                        "Listrik Bulanan",
                        "12 Nov 2024",
                        "17.34", R.drawable.lampu,
                        "Rp 1.500.000",
                        "Pemasukan",
                        "Cash"
                    )
                    AktivitasUang(
                        title = "Sampah Bulanan",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
                    AktivitasUang(
                        "Listrik Bulanan",
                        "12 Nov 2024",
                        "17.34", R.drawable.lampu,
                        "Rp 1.500.000",
                        "Pemasukan",
                        "Cash"
                    )
                    AktivitasUang(
                        title = "Sampah Bulanan",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
                    AktivitasUang(
                        "Listrik Bulanan",
                        "12 Nov 2024",
                        "17.34", R.drawable.lampu,
                        "Rp 1.500.000",
                        "Pemasukan",
                        "Cash"
                    )
                    AktivitasUang(
                        title = "Dian Dona Adelia",
                        tanggal = "3 Feb 2025",
                        jam = "12.00",
                        image = R.drawable.mobil,
                        nominal = "Rp 30.000",
                        jenis = "Pengeluaran",
                        pembayaran = "Tunai"
                    )
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

    }
}

@Composable
fun ButtonBeranda() {
    Box (modifier = Modifier.fillMaxWidth()
        .background(color = Color(0xFFF4FDE3)))
        {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B860)),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(36.dp)
        ) {
            Text(
                text = "Beranda",
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun MainHomePageScreeen() {
    Scaffold(
        bottomBar = { ButtonBeranda() }
    ) { paddingValues ->
        ScreenAktivitasUang(paddingValues)
    }
}

@Composable
@Preview
fun ScreenAktivitasUangPreview() {
    MainHomePageScreeen()
}