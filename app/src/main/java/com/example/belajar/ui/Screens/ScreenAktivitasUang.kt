package com.example.belajar.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajar.R

@Composable
fun ScreenAktivitasUang (){
    Row (modifier = Modifier.fillMaxSize().background(color = Color(0xFFF4FDE3))){
        Column (modifier = Modifier.padding(start = 8.dp, end = 8.dp)){
        SearchBar()
            AktivitasUang(
                title= "Sampah Bulanan",
                tanggal= "3 Feb 2025",
                jam = "12.00",
                image= R.drawable.mobil ,
                nominal= "Rp 30.000",
                jenis = "Pengeluaran",
                pembayaran= "Tunai"
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
@Composable
@Preview
fun ScreenAktivitasUangPreview(){
    ScreenAktivitasUang()
}