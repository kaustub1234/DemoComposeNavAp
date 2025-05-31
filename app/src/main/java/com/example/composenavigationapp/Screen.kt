package com.example.composenavigationapp

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Login : Screen(route = "login_screen")
    object Detail : Screen(route = "detail_screen/$DETAIL_ARGUMENT_KEY/$DETAIL_ARGUMENT_KEY2") {
        fun passNameAndId(id: Int = 0, name: String = ""): String {
//            return "detail_screen/$id/$name"
            return "detail_screen?id=$id&name=$name"
        }
    }
}
