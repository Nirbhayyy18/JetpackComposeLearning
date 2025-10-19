package com.example.jetpackcomposecourse.Layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Column (Vertical Arrangement)
// - Components align vertically one by one
/*
@Composable
fun ColumnDemo()
{
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text("Nirbhay", Modifier.padding(16.dp))
        Text("Rajendra",Modifier.padding(16.dp))
        Text("Raut",Modifier.padding(16.dp))
    }
}

// Row (Horizontal Alignment)
// - Components align horizontally one after another
@Composable
fun RowDemo()
{
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),

    )
    {
        Text("Nirbhay")
        //Spacer(Modifier.width(12.dp))
        Text("Abhay")
       // Spacer(Modifier.width(12.dp))
        Text("Chaitanya")
    }
}
*/

// Box Layout
// - Components Overlap means component set on another component
@Composable
fun BoxDemo()
{
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null, modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "STAR",
            color = colorResource(R.color.white),
            modifier = Modifier.align(Alignment.Center),
            fontSize = 40.sp
        )

    }

}




@Preview(showSystemUi = true, device = Devices.NEXUS_10)
@Composable
fun show()
{
    //ColumnDemo()
    //RowDemo()
    BoxDemo()
}
