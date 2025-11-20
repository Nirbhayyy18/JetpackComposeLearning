package com.example.jetpackcomposecourse.Lists

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ClickableItemDemo()
{
    var itemList = listOf<String>("A","B","C","D","E","F","G","H")
    LazyColumn {
        items(itemList)
        {
            item ->
            CustomItems(item)
        }
    }
}

@Composable
fun CustomItems(item: String)
{
    Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
        var context = LocalContext.current
        Text(text = item,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .pointerInput(Unit)     // To Apply CLickable Events and to add multiple event at same time
                {
                    this.detectTapGestures(
                       onLongPress = {
                           Toast.makeText(context, "$item Long Clicked", Toast.LENGTH_SHORT).show()
                    }
                    )
                },
//                .clickable{
//                    Toast.makeText(context, "$item Clicked", Toast.LENGTH_SHORT).show()
//                },
            fontFamily = FontFamily.Monospace,
            fontSize = 24.sp
        )
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ShowClickableItems()
{
    ClickableItemDemo()
}