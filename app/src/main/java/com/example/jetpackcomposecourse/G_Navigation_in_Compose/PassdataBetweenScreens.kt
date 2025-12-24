package com.example.jetpackcomposecourse.G_Navigation_in_Compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNav2()
{
    // NavController
    val navController = rememberNavController()

    // NavHost
    NavHost(
        navController = navController,
        startDestination = "start"
    ){
        composable("start"){startScreen(navController)}
        composable(
            route ="home/{username}",
            arguments = listOf(
                navArgument("username")
                {
                    type = NavType.StringType
                }
            )
        )
        {
            val username = it.arguments?.getString("username").toString()
            HomeScreen(navController, username)}
    }
}

@Composable
fun startScreen(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Main Screen")
        Spacer(Modifier.height(20.dp))

        var enteredtext by remember {mutableStateOf("")}

        OutlinedTextField(
            value = enteredtext,
            onValueChange = {enteredtext = it},
            label = {Text("Enter Name")}
        )
        Spacer(Modifier.height(20.dp))
        Button(onClick={
            navController.navigate("home/$enteredtext")
        })
        {
            Text("SUBMIT")
        }
    }
}

@Composable
fun HomeScreen(navController: NavController, username: String)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome $username")
        Spacer(Modifier.height(20.dp))
        Button(onClick={
            navController.navigate("start")
           // navController.navigateUp() // To go back to previous screen
        })
        {
            Text("Go to First Screen")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Showw()
{
    AppNav2()
}
