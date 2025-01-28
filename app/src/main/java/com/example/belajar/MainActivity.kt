package com.example.belajar

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajar.ui.Screens.CardKamar
import com.example.belajar.ui.Screens.CardPenghuni
import com.example.belajar.ui.Screens.FormScreen
import com.example.belajar.ui.Screens.PemasukanPengeluaran
import com.example.belajar.ui.Screens.Products.CreateProduct
import com.example.belajar.ui.Screens.PropertyRanking
import com.example.belajar.ui.Screens.ScreenProperty
import com.example.belajar.ui.Screens.ScreenRanking
import com.example.belajar.ui.theme.ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray // Tambahkan warna latar belakang
                ) {
                    PemasukanPengeluaran()
                }
            }
        }
    }
}
