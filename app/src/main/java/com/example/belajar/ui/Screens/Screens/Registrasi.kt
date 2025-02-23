package com.example.belajar.ui.Screens.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.belajar.ui.Screens.Components.BottomBarGreen
import com.example.belajar.ui.Screens.appbar.TopAppBarApps
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.example.belajar.ui.Screens.JakartaSansMedium
import com.example.belajar.ui.Screens.JakartaSansReguler

@Composable
fun Registrasi(paddingValues: PaddingValues) {
    var fullName by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var agreePrivacy by remember { mutableStateOf(false) }
    var agreeInfo by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        InputField(
            label = "Nama lengkap",
            value = fullName,
            onValueChange = { fullName = it })
        InputField(
            label = "Username",
            value = username,
            onValueChange = { username = it })
        InputField(
            label = "Nomor handphone",
            value = phoneNumber,
            onValueChange = { phoneNumber = it })
        InputField(
            label = "Email",
            value = email,
            onValueChange = { email = it })
        Text(
            text = "Alamat lengkap (opsional)",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp),
            shape = RoundedCornerShape(6.dp),
            placeholder = { Text("Masukkan alamat anda") },
            maxLines = 3
        )

        InputField(
            label = "Kata sandi",
            value = password,
            onValueChange = { password = it },
            isPassword = true
        )
        InputField(
            label = "Konfirmasi kata sandi",
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            isPassword = true
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = agreePrivacy, onCheckedChange = { agreePrivacy = it })
            Text(
                text = "Saya setuju mengenai seluruh kebijakan privasi",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = agreeInfo, onCheckedChange = { agreeInfo = it })
            Text(
                text = "Saya setuju untuk menerima seluruh rangkaian kegiatan informasi",
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Composable
fun InputField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
) {
    Text(
        text = label,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = JakartaSansMedium,
        modifier = Modifier.padding(bottom = 2.dp)
        
    )
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp), // Sesuaikan tinggi agar lebih rapat
        shape = RoundedCornerShape(4.dp), // Kurangi radius sudut
        placeholder = {
            Text(
                "Masukkan $label anda",
                fontSize = 14.sp,
                fontFamily = JakartaSansReguler
            )
        },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        singleLine = true,

        textStyle = TextStyle(fontSize = 14.sp), // Ukuran teks lebih kecil agar pas
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Gray,
            cursorColor = Color.Black
        )
    )
}

@Composable
fun ScreenRegistrasi() {
    Scaffold(
        bottomBar = {
            BottomBarGreen("Registrasi")
        },
        topBar = {
            TopAppBarApps(
                onBackClick = { },
                title = "Refistrasi"
            )
        }
    ) { paddingValues ->
        Registrasi(paddingValues)
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenRegistrasiPreview() {
    ScreenRegistrasi()
}