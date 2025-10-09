package com.example.jetpackcomposecourse.FundamentalConcepts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecourse.R

@Composable  // Tells the compiler that this function is for UI.
fun AccessResource()
{
    Column(
        modifier = Modifier  // Used to customize composables → size, padding, background, click, shape, etc.
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
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
