package com.example.jetpackcomposecourse.Components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*


// Sample Text
@Composable
fun text(name: String)
{
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            text = "Hello $name!",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Blue,
                    blurRadius = 20f,
                    offset = Offset(5.0f, 10.0f)
                )
            )
        )
    }
}

// Multiple Colors on Text
@Composable
fun MultipleColor()
{
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        var rainbow = listOf(
            Color.Red,
            Color.Cyan,
            Color.DarkGray,
            Color.Yellow,
            Color.Blue,
            Color.LightGray,
            Color.Green
        )

        Text(
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                       brush = Brush.linearGradient(
                           colors = rainbow
                    )
                )
                )
                {
                    append("My Name is Nirbhay")
                }
            }
        )
    }

}

@Composable
fun text2() {
    Text(
        text = "Nirbhay Raut",
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
    )
}

@Composable
fun text3()
{
    Text(
        text = "Hello Nirbhay",
        color = Color.Blue,
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        fontSize = 30.sp,
        fontFamily = FontFamily.Cursive,
        textDecoration = TextDecoration.combine(
            listOf(
                TextDecoration.Underline,
                TextDecoration.LineThrough
            )
        ),

    )
}


//
@Preview(showSystemUi = true)
@Composable
fun TextPreview()
{
    //  text("Nirbhay")
    //  MultipleColor()
       // text2()
    text3()
}