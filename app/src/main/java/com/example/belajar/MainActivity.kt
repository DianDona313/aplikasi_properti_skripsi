package com.example.belajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.belajar.ui.Screens.Screens.Home
import com.example.belajar.ui.Screens.Screens.ScreenHome
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
                    ScreenHome()
                }
            }
        }
    }
}
