package com.example.belajar.ui.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen(){
    Column  {
        Text("Register Screen", color = Color.White)
        Text("Register Screen", color = Color.White)
        Text("Register Screen", color = Color.White)

       Row {
           Button(onClick = {}) {
               Text("Submit")
           }
           Button(onClick = {}) {
               Text("Submit")
           }
       }
    }
}

@Composable
@Preview
fun RegisterScreenPreview(){
    RegisterScreen()
}