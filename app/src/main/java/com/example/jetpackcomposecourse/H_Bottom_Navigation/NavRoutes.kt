package com.example.jetpackcomposecourse.H_Bottom_Navigation


sealed class NavRoutes(val path: String)
{
    object Home: NavRoutes("home")

    object Profile: NavRoutes("profile"){
        val id = "id"
        val showDetails = "showDetails"
    }

    object Settings: NavRoutes("settings")
}