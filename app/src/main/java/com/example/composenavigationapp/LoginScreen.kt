package com.example.composenavigationapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
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
        color = Color.Green,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold
    )
    /*
        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.navigate(HOME_ROUTE) {
                        popUpTo(HOME_ROUTE)
                    }
                },
            text = "go back",
            color = Color.Black,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )*/
    Text(
        modifier = Modifier
            .padding(top = 150.dp)
            .clickable {
                navController.popBackStack()
                navController.navigate(Screen.Detail.passNameAndId())
            },
        text = "Open Detail Screen",
        color = Color.Black,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold
    )
}