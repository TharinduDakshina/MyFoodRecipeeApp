package com.example.myfoodrecipeeapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val textStyle5=TextStyle(
    fontFamily= FontFamily.Serif,
    fontWeight = FontWeight.Medium,
    letterSpacing = 0.15.sp,
    fontSize = 32.sp,
    color = Color.Red
)


@Composable
fun SweetAlertDialog(
    title: String,
    message: String,
    confirmText1: String?,
    confirmText3:String?,
    onConfirm: () -> Unit
) {
    var refreshTrigger by remember { mutableStateOf(0) }


    AlertDialog(
        onDismissRequest = { /* Nothing to do here */ },
        title = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = title,
                    style = textStyle5,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = message,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        },
        confirmButton = {

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                if (confirmText1.isNullOrEmpty() || confirmText3.isNullOrEmpty()){
                    Button(
                        onClick = onConfirm,
                        colors = ButtonDefaults.buttonColors(Color.Gray)
                    ) {
                        if (confirmText1 != null) {
                            Text(text = confirmText1)
                        }
                    }
                }else{
                    Button(
                        modifier = Modifier.weight(1f),
                        onClick = onConfirm,
                        colors = ButtonDefaults.buttonColors(Color.Green)
                    ) {
                        if (confirmText1 != null) {
                            Text(text = confirmText1)
                        }
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Button(
                        modifier = Modifier.weight(1f).align(Alignment.CenterVertically),
                        onClick = {
                            refreshTrigger++
                        },
                        colors = ButtonDefaults.buttonColors(Color.Green)
                    ) {
                        if (confirmText3 != null) {
                            Text(text = confirmText3)
                        }
                    }
                }


            }
        }
    )
}