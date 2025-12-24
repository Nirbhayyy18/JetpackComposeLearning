package com.example.jetpackcomposecourse.E_Layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

// SCAFFOLD
/*
A pre-built layout template for screens.

It gives you:
    TopBar
    BottomBar
    FAB
    Drawer
    Content area
    SnackbarHost
All in one.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffoldScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Home") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text("+")
            }
        },
        bottomBar = {
            BottomAppBar { Text("Bottom Bar") }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.
        padding(innerPadding)) {
            Text("This is the screen content")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun showScaffold()
{
    MyScaffoldScreen()
}

