package com.example.composenavigationapp.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.composenavigationapp.HOME_ROUTE
import com.example.composenavigationapp.ROOT_ROUTE
import com.example.composenavigationapp.Screen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = HOME_ROUTE, route = ROOT_ROUTE)
    {
        homeNavGraph(navController)
        authNavGraph(navController)
    }
}