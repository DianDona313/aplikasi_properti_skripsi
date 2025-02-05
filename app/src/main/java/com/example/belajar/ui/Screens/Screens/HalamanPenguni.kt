package com.example.belajar.ui.Screens.Screens

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.belajar.ui.Screens.Components.CardPenghuni

@Composable

fun HalamanPenghuni (){
    Row {
        CardPenghuni("Kamar 100")
        CardPenghuni("Kamar 101")
    }
}

@Composable
@Preview
fun HalamanPenghuniPreview(){
    HalamanPenghuni()
}