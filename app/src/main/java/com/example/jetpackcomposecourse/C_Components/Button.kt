package com.example.jetpackcomposecourse.C_Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// Button Composable
@Composable
fun Button()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        // Filled button
        // - It is filled with a solid color by default.
        Button( onClick = { }) {
            Text("Filled Button")
        }

        // Filled tonal button
        // - It is filled with a tonal color.
        FilledTonalButton(onClick = {}) {
            Text("Tonal Button")
        }

        // Outlined button
        // - It appears with an outline by default.
        OutlinedButton(onClick = {}) {
            Text("Outlined Button")
        }

        // Elevated button
        // - It is a filled button that includes a shadow.
        ElevatedButton(onClick = {}) {
            Text("Elevated Button")
        }

        // Text button
        // - It appears as only text until pressed.
        // - It does not have a solid fill or outline by default.
        TextButton(onClick ={} ) {
            Text("Text Button")
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun showw()
{
    Button()
}