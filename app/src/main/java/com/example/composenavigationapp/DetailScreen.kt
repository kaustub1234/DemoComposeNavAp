package com.example.composenavigationapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Detail.route)
                {
                    popUpTo(
                        Screen.Home.route
                    )
                    {
                        inclusive = true
                    }
                }
//                navController.popBackStack()
            },
            text = "DetailScreen",
            color = Color.Red,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
    }
}