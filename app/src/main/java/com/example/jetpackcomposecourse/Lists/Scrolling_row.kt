package com.example.jetpackcomposecourse.Lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.R

@Composable
fun scroll_row()
{
    Row (
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ){
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showScrollingRow()
{
    scroll_row()
}