package com.example.jetpackcomposecourse.H_Bottom_Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost

import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen.HomeScreen
import com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen.ProfileScreen
import com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen.SettingsScreen

@Composable
fun AppNavExample()
{
    val navController = rememberNavController()
    NavGraph(navController = navController)
}


@Composable
fun NavGraph(navController: NavHostController)
{

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.path
    )
    {
        addHomeScreen(navController, this)
        addProfileScreen(navController, this)
        addSettingsScreen(navController, this)
    }
}

fun addHomeScreen(navController: NavHostController,
                 navGraphBuilder: NavGraphBuilder)
{
   navGraphBuilder.composable(
       route = NavRoutes.Home.path
   )
   {
       HomeScreen(
           onNavigateToProfile = {
               id, showDetails ->
               navController.navigate(
                   NavRoutes.Profile.path.plus(id.toString()).plus(showDetails.toString())
               )
           },

           onNavigateToSettings = {
               navController.navigate(NavRoutes.Settings.path)
           }
       )
   }
}


private fun addProfileScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        // Define the arguments the route will accept
        route = NavRoutes.Profile.path + "/{id}?showDetails={showDetails}",
        arguments = listOf(
            navArgument("id") { type = NavType.IntType },
            navArgument("showDetails") { type = NavType.BoolType; defaultValue = false }
        )
    ) { backStackEntry ->
        // Retrieve the arguments
        val id = backStackEntry.arguments?.getInt("id") ?: 0
        val showDetails = backStackEntry.arguments?.getBoolean("showDetails") ?: false

        ProfileScreen(
            id = id,
            showDetails = showDetails,
            onNavigateToHome = {
                navController.navigate(NavRoutes.Home.path)
            },
            onNavigateToSettings = TODO()
        )
    }
}

private fun addSettingsScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoutes.Settings.path) {
        SettingsScreen(
            onNavigateToHome = {
                navController.navigate(NavRoutes.Home.path)
            }
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Showww()
{
    AppNavExample()
}
