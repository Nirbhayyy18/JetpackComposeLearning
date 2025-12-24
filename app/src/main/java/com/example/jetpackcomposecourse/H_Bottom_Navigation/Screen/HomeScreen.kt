package com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToProfile: (Int, Boolean) -> Unit,
    onNavigateToSettings: () -> Unit
)
{
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Button(onClick = {onNavigateToProfile(18,true)}) {
            Text("Profile")
        }

        Spacer(Modifier.height(20.dp))

        Button(onClick = {onNavigateToSettings()}) {
            Text("Settings")
        }
    }
}