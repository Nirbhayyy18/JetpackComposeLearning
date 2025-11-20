package com.example.jetpackcomposecourse.Lists

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Display Contents in Card

@Composable
fun CardDemo()
{
    Card(
        modifier = Modifier
            .padding(16.dp),
            //.fillMaxSize(),
        elevation = CardDefaults.cardElevation(8.dp),
    ) {
        Text(text = "Hello",
            modifier = Modifier.padding(16.dp)
            )
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ShowCards()
{
    CardDemo()
}