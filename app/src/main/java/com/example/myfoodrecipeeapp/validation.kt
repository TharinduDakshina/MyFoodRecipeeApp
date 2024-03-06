package com.example.myfoodrecipeeapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun InputFieldWithValidation() {
    var text by remember { mutableStateOf(TextFieldValue()) }
    var errorText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
                errorText = if (it.text.length < 5) "Input must be at least 5 characters" else ""
            },
            label = { Text("Enter text") },
            isError = errorText.isNotEmpty(),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        if (errorText.isNotEmpty()) {
            Text(
                text = errorText,
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}


