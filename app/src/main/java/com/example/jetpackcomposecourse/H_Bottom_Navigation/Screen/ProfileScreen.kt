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
import androidx.navigation.NavController

@Composable
fun ProfileScreen(
    navController: NavController, id: Int?, showDetails: Boolean?
)
{
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Profile Screen")

        Spacer(Modifier.height(20.dp))

        Text("Profile ID: $id")
        Spacer(Modifier.height(20.dp))
        Text("Profile Details: $showDetails")
        Spacer(Modifier.height(20.dp))
        Button(onClick = {navController.navigate("Setting")}) {
            Text(text = "Go to Settings")
        }
    }
}
