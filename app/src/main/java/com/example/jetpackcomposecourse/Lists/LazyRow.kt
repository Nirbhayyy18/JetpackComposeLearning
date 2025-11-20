package com.example.jetpackcomposecourse.Lists

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LazyRowDemo()
{
    var itemsList = listOf<String>("NIrbhay", "Abhay", "Chaitanya","NIrbhay", "Abhay", "Chaitanya")
    LazyRow {
        items(itemsList){

            item ->
            Text("  $item")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ShowLazyRow()
{
    LazyRowDemo()
}