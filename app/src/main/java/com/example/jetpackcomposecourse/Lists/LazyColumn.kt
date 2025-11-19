package com.example.jetpackcomposecourse.Lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnDemo()
{
    var myitems = listOf<String>(
        "Nirbhay", "Abhay","Chaitanya"
    )
//    LazyColumn(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//
//    ) {
//        items(myitems)
//        {
//            itemm ->
//            Text(text = itemm)
//        }
//    }
    Spacer(Modifier.height(30.dp))

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        items(100)
        {
            index->
            Text("Item $index")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showLazyColumn()
{
    LazyColumnDemo()
}