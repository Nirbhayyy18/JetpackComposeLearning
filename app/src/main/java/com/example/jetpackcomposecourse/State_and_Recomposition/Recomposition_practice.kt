package com.example.jetpackcomposecourse.State_and_Recomposition

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
 ** Recomposition **
 - Recomposition is the process of updating the UI when the data changes.
 - It is triggered when the data changes.

 - 'remember' tells Compose to remember a value even after recomposition happens.
        Without remember, the value of count would go back to 0 every time the UI redraws.
        That means — if you clicked 5 times, it would still show 0 after recomposition 😅

 - 'mutableStateOf(0)' :
     👉 It’s like saying:
        “Hey Compose, I have a number (0).
        If I change this number later, you should automatically update the UI where it’s used.”

        🎯 Why:
        In normal variables, if the value changes, UI doesn’t update automatically.
        With mutableStateOf, Compose listens 👂 to it.



 */

@Composable
fun Recomposition()
{
    var count by remember { mutableStateOf(0)}
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(
            "Count: $count",
            fontSize = 30.sp

            )
        Spacer(Modifier.height(20.dp))
        Button(onClick = {count++}) {
            Text("Click Me")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun show()
{
    Recomposition()
}