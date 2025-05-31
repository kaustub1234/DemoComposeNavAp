package com.example.composenavigationapp.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenavigationapp.AUTHENTICATION_ROUTE
import com.example.composenavigationapp.LoginScreen
import com.example.composenavigationapp.Screen

fun NavGraphBuilder.authNavGraph(navController: NavHostController)
{
    navigation(startDestination = Screen.Login.route, route = AUTHENTICATION_ROUTE){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
    }
}