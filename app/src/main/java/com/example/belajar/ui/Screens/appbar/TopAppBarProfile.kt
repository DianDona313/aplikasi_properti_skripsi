package com.example.belajar.ui.Screens.appbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.R
import com.example.belajar.ui.Screens.JakartaSansBold

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarProfile(
    onBackClick: () -> Unit,
    onProfileClick: () -> Unit,
    title: String = "Tambah Properti"
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color(0xFFFF9800), // Warna oranye sesuai desain
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = JakartaSansBold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFF4A8522) // Warna hijau sesuai desain
                )
            }
        },
        actions = {
            IconButton(onClick = onProfileClick) {
                    Image(
                        painter = painterResource(id = R.drawable.profileappbar),
                        contentDescription = title,
                        modifier = Modifier.size(28.dp)
                    )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White, // Latar belakang putih
            titleContentColor = Color(0xFFFF9800), // Warna teks judul
            navigationIconContentColor = Color(0xFF4A8522) // Warna ikon back
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun TopAppBarProfilePreview() {
    TopAppBarProfile(
        onBackClick = { },
        onProfileClick = { },
        title = "Tambah Properti"
    )
}
