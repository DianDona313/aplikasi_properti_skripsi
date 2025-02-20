package com.example.belajar.ui.Screens.Screens

import android.widget.Space
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.Components.ButtonGandaGreen
import com.example.belajar.ui.Screens.JakartaSansExtraBoldItalic
import com.example.belajar.ui.Screens.JakartaSansReguler

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(R.drawable.logooo),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp)
        )
//        Spacer(modifier = Modifier.height(2.dp))
        Text(
            "KELOLA KOST",
            fontSize = 24.sp,
            fontFamily = JakartaSansExtraBoldItalic,
            letterSpacing = (-0.2).sp,
            color = Color(0xFF398423),
            lineHeight = 12.sp
        )
        Spacer(modifier = Modifier.height(40.dp))
        ButtonGandaGreen(
            "MASUK","REGISTRASI"
        )
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}