package com.example.jetpackcomposecourse.G_Navigation_in_Compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    // 1: NavController
    // - Navigating between composables
    val navController = rememberNavController()

    // 2: NavHost
    // - Defines the nav Graph, start and composable destinations

    NavHost(
        navController = navController,
        startDestination = "firstScreen" // first screen to show
    ){
        composable("firstScreen"){FirstScreen(navController)} // 1st Destination: First Screen

        composable(
            route = "secondScreen/{name}",
            arguments = listOf(
                navArgument("name")
                {
                    type = NavType.StringType
                }
            )
        ){
            val nameArg = it.arguments?.getString("name").toString() // read Arguments from Navigation
            SecondScreen(navController, nameArg) // 2nd Destination: Second Screen
        }
    }
}

@Composable
fun FirstScreen(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("First Screen")

        var enteredText by remember { mutableStateOf("") }
        TextField(
            value = enteredText,
            onValueChange = {enteredText = it},
            label = {Text("Enter Name")}
        )

        Button(onClick = {
            navController.navigate("secondScreen/$enteredText") // 1) passing data as a parameter
        }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavController, name: String)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome $name")
        Button(onClick = {
            navController.navigate("firstScreen")
        }) {
            Text("Go to First Screen")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ScreenPreview()
{
   AppNavigation()
}