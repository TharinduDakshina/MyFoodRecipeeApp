package com.example.myfoodrecipeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfoodrecipeeapp.ui.theme.MyFoodRecipeeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFoodRecipeeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val showDialog = remember { mutableStateOf(false) }
//
//                    if (showDialog.value) {
//
//                        SweetAlertDialog(
//                            title = "Confirmation",
//                            message = "Are you sure you want to delete this item?",
//                            confirmText1 = "Delete",
//                            confirmText3 = "Accsept",
//                            onConfirm ={
//                                showDialog.value=false
//                            }
//                        )
//                    }
//
//                    Button(
//                        onClick = {
//                            showDialog.value = true
//
//                        }
//                    ) {
//                        Text("Show Sweet Alert")
//                    }

//                    var loading = remember { mutableStateOf(false) }
//
//                   circularIndicatorProgressBar (
//                       onConfirm = {loading.value=false}
//                   )

                    InputFieldWithValidation()



                }
            }
        }
    }

    
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFoodRecipeeAppTheme {
       // IndeterminateCircularIndicator()
    }
}