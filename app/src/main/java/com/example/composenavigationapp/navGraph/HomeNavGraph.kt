package com.example.composenavigationapp.navGraph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.composenavigationapp.DETAIL_ARGUMENT_KEY
import com.example.composenavigationapp.DETAIL_ARGUMENT_KEY2
import com.example.composenavigationapp.DetailScreen
import com.example.composenavigationapp.HOME_ROUTE
import com.example.composenavigationapp.HomeScreen
import com.example.composenavigationapp.Screen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    navigation(startDestination = Screen.Home.route, route = HOME_ROUTE) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    nullable = true
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.IntType
                    nullable = true
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController)
        }
    }
}