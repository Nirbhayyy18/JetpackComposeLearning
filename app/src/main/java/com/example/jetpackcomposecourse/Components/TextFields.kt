package com.example.jetpackcomposecourse.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExample()
{
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        var text1 by remember { mutableStateOf("Hello") }
        // Basic TextField
        TextField(
            value = text1,
            onValueChange = { text1 = it },
            label = { Text("Enter your name") }
        )
        Spacer(Modifier.height(16.dp))
        // OutlinedTextField
        var text2 by remember { mutableStateOf("Hello") }
        OutlinedTextField(
            value = text2,
            onValueChange = { text2 = it },
            label = { Text("Enter your name") }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextFieldExamplePreview()
{
    TextFieldExample()
}