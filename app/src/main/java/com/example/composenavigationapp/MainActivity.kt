package com.example.composenavigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composenavigationapp.navGraph.SetUpNavGraph

class MainActivity : ComponentActivity() {
    lateinit var navigationController:NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navigationController = rememberNavController();
            SetUpNavGraph(navController = navigationController)
        }
    }
}