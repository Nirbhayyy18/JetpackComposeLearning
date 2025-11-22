package com.example.jetpackcomposecourse.F_Lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnDemo()
{
    var myitems = listOf<String>(
        "Nirbhay", "Abhay","Chaitanya"
    )
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        items(myitems)
        {
            itemm -> CustomItem(itemm)
        }
    }
//    Spacer(Modifier.height(30.dp))
//    LazyColumn(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//
//    ) {
//        items(100)
//        {
//            index->
//            Text("Item $index")
//        }
//    }
}

@Composable
fun CustomItem(item: String)
{
    Row {
        Text(text = item,
            modifier = Modifier
                .fillMaxSize()
                .height(50.dp),
            fontFamily = FontFamily.Cursive
            )
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showLazyColumn()
{
    LazyColumnDemo()
}