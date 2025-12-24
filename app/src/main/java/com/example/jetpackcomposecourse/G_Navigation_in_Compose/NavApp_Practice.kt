package com.example.jetpackcomposecourse.G_Navigation_in_Compose

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav()
{
    // NavController
    val navController = rememberNavController()

    // NavHost
    NavHost(
        navController = navController,
        startDestination = "first"
    ){
        composable("first"){Firstscreen(navController)}
        composable("second"){SecondScreen(navController)}
    }

}

@Composable
fun Firstscreen(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is First Screen")
        Spacer(Modifier.height(20.dp))
        Button(onClick={
            navController.navigate("second")
        })
        {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is Second Screen")
        Spacer(Modifier.height(20.dp))
        Button(onClick={
            //navController.navigate("first")
            navController.navigateUp() // To go back to previous screen
        })
        {
            Text("Go to First Screen")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Show()
{
    AppNav()
}
