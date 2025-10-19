package com.example.jetpackcomposecourse.Components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Practice()
{
    Column (
        modifier = Modifier
            .padding(16.dp)
            .border(4.dp, color = Color.Red)
            .padding(16.dp)
            .border(1.dp, color = Color.Blue)
    ){
        Text(
            text = "Hello I am Nirbhay",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            ),
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(start = 16.dp)
        )
        Text(
            text = "Download it from Playstore",
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview(showBackground = true)
@Composable
fun show()
{
    Practice()
}