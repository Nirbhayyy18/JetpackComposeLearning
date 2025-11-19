package com.example.jetpackcomposecourse.Lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.E_Layouts.BottomAppBar
import com.example.jetpackcomposecourse.R

@Composable
fun scrolling_column()
{
    Column (
        modifier = Modifier.verticalScroll(rememberScrollState())
    ){
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showScrolling()
{
    scrolling_column()
}