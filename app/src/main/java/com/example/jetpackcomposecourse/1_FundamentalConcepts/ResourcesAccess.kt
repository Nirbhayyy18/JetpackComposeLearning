package com.example.jetpackcomposecourse.`1_FundamentalConcepts`

import android.R.attr.contentDescription
import android.print.PrintAttributes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecourse.R

@Composable
fun AccessResource()
{
    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.TopCenter
    )
    {
        Text(
            text = stringResource(R.string.person),
            color = colorResource(id = R.color.Orange),
            fontSize = 50.sp
        )

        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = "Star Image"
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun show()
{
    AccessResource()
}