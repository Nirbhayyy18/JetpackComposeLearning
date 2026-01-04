package com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.G_Navigation_in_Compose.AppNav

@Composable
fun AppNavv()
{
    var navController = rememberNavController();

    Scaffold(
        bottomBar = {
        BottomBar(navController)
    }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home"
        ){
            composable("Home"){HomeScreen(navController)};

            composable(
                route ="Profile/{id}/{showdetails}",
                arguments = listOf(
                    navArgument("id")
                    {
                        type = NavType.IntType
                    },
                    navArgument("showdetails")
                    {
                        type = NavType.BoolType
                    }
                )
            )
            {
                val id: Int? = it.arguments?.getInt("id")
                val  showdetails= it.arguments?.getBoolean("showdetails")
                ProfileScreen(navController,id,showdetails)
            }

            composable("Setting"){SettingsScreen(navController)}
        }
    }


}

@Composable
fun BottomBar(navController: NavHostController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("Home")
            },
            label = { Text("Home") },
            icon = { Icon(Icons.Default.Home, contentDescription = null) }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("Profile/1/true")
            },
            label = { Text("Profile") },
            icon = { Icon(Icons.Default.Person, contentDescription = null) }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("Setting")
            },
            label = { Text("Settings") },
            icon = { Icon(Icons.Default.Settings, contentDescription = null) }
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowNav()
{
    AppNavv()
}
