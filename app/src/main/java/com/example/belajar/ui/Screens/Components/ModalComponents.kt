package com.example.belajar.ui.Screens.Components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun ModalComponents() {
    // State to control whether the dialog is open or not
    var showDialog by remember { mutableStateOf(false) }

    // A button to open the modal dialog
    Button(onClick = { showDialog = true }) {
        Text("Open Modal")
    }

    // Display the dialog if showDialog is true
    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                // This callback is invoked when the user clicks outside the dialog or on the back button
                showDialog = false
            },
            title = {
                Text(text = "Modal Title")
            },
            text = {
                Text("This is the modal content. Customize it as needed!")
            },
            confirmButton = {
                Button(
                    onClick = {
                        // Confirm action
                        showDialog = false
                    }
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        // Dismiss action
                        showDialog = false
                    }
                ) {
                    Text("Dismiss")
                }
            }
        )
    }
}