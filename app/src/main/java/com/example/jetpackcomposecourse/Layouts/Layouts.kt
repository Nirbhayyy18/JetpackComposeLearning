package com.example.jetpackcomposecourse.Layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Column (Vertical Arrangement)

@Composable
fun ColumnDemo()
{
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text("Nirbhay", Modifier.padding(16.dp))
        Text("Abhay",Modifier.padding(16.dp))
        Text("Chaitanya",Modifier.padding(16.dp))
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),

    )
    {
        Text("Nirbhay")
        //Spacer(Modifier.width(12.dp))
        Text("Abhay")
       // Spacer(Modifier.width(12.dp))
        Text("Chaitanya")
    }
}

@Preview(showSystemUi = true)
@Composable
fun show()
{
    ColumnDemo()
}
