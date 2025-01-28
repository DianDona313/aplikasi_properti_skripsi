package com.example.belajar.ui.Screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

@Composable
fun FormScreen(modifier: Modifier){
    var email by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card (
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            ),
            modifier = Modifier.padding(5.dp).padding(top = 20.dp).width(350.dp).height(350.dp)
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Register Here....",
                    color = Color(0xFFFCBA03),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(25.dp)
                )
                Spacer(Modifier.padding(5.dp))

                Column(
                    modifier = Modifier.width(350.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextField(value = email, onValueChange = {
                        email = it
                    }, label = {Text("Email")})
                    Spacer(Modifier.padding(5.dp))
                    TextField(value = nama, onValueChange = {
                        nama = it
                    }, label = {Text("Nama")})
                    Spacer(Modifier.padding(5.dp))
                    TextField(value = password, onValueChange = {
                        password = it
                    }, label = {Text("Password")})
                    Spacer(Modifier.padding(5.dp))
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Button(colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF6200EE),
                            containerColor = Color(0xFFFDD25D)
                        ),onClick = {
                            print("send")
                        }) {
                            Text("submit")
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun FormScreenPreview(){
    FormScreen(modifier = Modifier.padding(0.dp))
}