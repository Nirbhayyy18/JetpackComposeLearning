package com.example.jetpackcomposecourse.Z_Sample_Designs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.C_Components.text
import com.example.jetpackcomposecourse.components.TextFieldExamplePreview


@Composable
fun homepage()
{
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            text = "Hello, Nirbhay",
        )
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun show() {
    homepage()
}