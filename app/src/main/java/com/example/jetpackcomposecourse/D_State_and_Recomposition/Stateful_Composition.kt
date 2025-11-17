package com.example.jetpackcomposecourse.D_State_and_Recomposition

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Stateful_Composable_Example()
{
    var text by remember() { mutableStateOf("") }

}