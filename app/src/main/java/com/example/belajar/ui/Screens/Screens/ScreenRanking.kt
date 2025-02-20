package com.example.belajar.ui.Screens.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajar.R
import com.example.belajar.ui.Screens.Components.PropertyRanking

@Composable
fun ScreenRanking(){
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 0.dp)
            .background(Color.White),
        horizontalArrangement = Arrangement.spacedBy(0.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        PropertyRanking(
            rankingValue = 1,
            imageRanking = R.drawable.kost2,
            nama_kost = "Kost Laeli Sesat",
            alamatKost = "Jl.Soekarno Hatta, Plg"
        )
        PropertyRanking(
            rankingValue = 2,
            imageRanking = R.drawable.kost3,
            nama_kost = "Kost Leelii",
            alamatKost = "Jl. Sudirman, Plg"
        )
        PropertyRanking(
            rankingValue = 3,
            imageRanking = R.drawable.kost3,
            nama_kost = "Kost Donaa",
            alamatKost = "Jl. Indra Jaya, Plg"
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}


@Preview
@Composable
fun ScreenRankingPreview(){
    ScreenRanking()
}