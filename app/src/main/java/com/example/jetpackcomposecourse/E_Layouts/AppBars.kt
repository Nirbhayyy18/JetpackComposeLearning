package com.example.jetpackcomposecourse.E_Layouts

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

// Top App Bar
@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar()
{
    TopAppBar(
        title = {
            Text("NIrbhay")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red,
            titleContentColor = Color.White,
        ),
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        },
    )
}


// Bottom App Bar
@Composable
fun BottomAppBar()
{
    Scaffold(
        bottomBar ={
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Filled.Edit, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Filled.MoreVert, contentDescription = "Localized description")
                    }
                }
            )
        },
        floatingActionButton = {
            var context = LocalContext.current
            FloatingActionButton(onClick = { Toast.makeText(context, "FAB Clicked", Toast.LENGTH_SHORT).show()})
            {
                Icon(
                    Icons.Filled.Add,
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        }
    )
    {
            innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
    }
}


// Floating Action Button
@Composable
fun floatingbtn()
{
    var context = LocalContext.current
    FloatingActionButton(onClick = { Toast.makeText(context, "FAB Clicked", Toast.LENGTH_SHORT).show()})
    {
        Icon(
            Icons.Filled.Add,
            contentDescription = null,
            tint = Color.Black
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showAppBars()
{
    MyTopAppBar()
    //BottomAppBar()
    //floatingbtn()

}