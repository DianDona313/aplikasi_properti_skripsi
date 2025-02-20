package com.example.belajar.ui.Screens.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomBarYellow(Teks: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFF4FDE3))
    )
    {
       Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B860)),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(36.dp)
        ) {
            Text(
                text = Teks,
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun ButtonGandaGreen(Button1 : String, Button2 : String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(36.dp)
    ) {
        Button(
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(6.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF398423), // Warna latar belakang
                contentColor = Color(0xFFFDE5AF) // Warna teks dan ikon
            )
        ) {
            Text(Button1)
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(6.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF398423), // Warna latar belakang
                contentColor = Color(0xFFFDE5AF) // Warna teks dan ikon
            )
        ) {
            Text(Button2)
        }
    }
}


@Composable
fun BottomBarGreen(Teks: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    )
    {
        Button(
            onClick = { },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFF398423),
                    contentColor = Color(0xFFFDE5AF)
                    ),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(36.dp)
        ) {
//            Icon(
//                imageVector = Icons.Default.Send,
//                contentDescription = "Submit Icon",
//                tint = Color.Magenta
//            )
//            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = Teks,
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun ButtonSingleIconYellow(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
    )
    {
        Button(
            onClick = { },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFFF4B860),
                    contentColor = Color(0xFF398423)
                ),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(36.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Submit Icon",
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Preview
@Composable
fun ButtonPreview() {
    ButtonSingleIconYellow()
}