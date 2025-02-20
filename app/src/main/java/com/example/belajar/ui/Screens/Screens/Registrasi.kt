package com.example.belajar.ui.Screens.Screens

import androidx.compose.material3.*
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text

@Composable
fun Registrasi() {
    var nama_product by remember { mutableStateOf("") }
    var stock by remember { mutableStateOf("") }
    var harga by remember { mutableStateOf("") }
    var expired_date by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .background(color = Color.White)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center
//        horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Create Product", fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp),
                value = nama_product,
                shape = RoundedCornerShape(6.dp),
                onValueChange = { nama_product = it },
                label = {
                    Text(
                        "Nama Product",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                },
                placeholder = { Text("Masukkan Nama Products") }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                value = stock,
                shape = RoundedCornerShape(12.dp),
                onValueChange = { stock = it },
                label = {
                    Text(
                        "Stock Product",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                },
                placeholder = { Text("Masukkan Jumlah Stock Products") }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                value = harga,
                shape = RoundedCornerShape(12.dp),
                onValueChange = { harga = it },
                label = {
                    Text(
                        "Harga Product",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                },
                placeholder = { Text("Masukkan Harga Products") }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                value = expired_date,
                shape = RoundedCornerShape(12.dp),
                onValueChange = { expired_date = it },
                label = {
                    Text(
                        "Expired Date Product",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                },
                placeholder = { Text("Masukkan Expired Date Products") }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                modifier = Modifier.width(300.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                FilledTonalButton(
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(12.dp),
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = "Submit Icon",
                        tint = Color.Magenta
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text("Submit", color = Color.Magenta)
                }
            }

        }
    }
}


@Preview
@Composable
fun RegistrasiPreview() {
    Registrasi()
}