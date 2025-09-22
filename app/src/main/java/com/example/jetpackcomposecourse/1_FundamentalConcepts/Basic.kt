package com.example.jetpackcomposecourse.`1_FundamentalConcepts`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


// Composable Function
// - Composable Function is represented in code by using @Composable annotation
// - used to define UI elements

@Composable
fun Greet(name: String)
{
    Text(
        text = "Hello $name!",
    )
}

// Preview Function (Used to preview composable function in Android Studio)
//@Preview(showSystemUi = true)
//@Composable
//fun GreetPreview()
//{
//    Greet("Android")
//}
