package com.example.composeapplication.routes

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

private object Params {
    const val PRODUCT_ID = "productId"
    fun toPath(param: String) = "{${param}}"
}

sealed class Screen(val route: String, val navArguments: List<NamedNavArgument> = emptyList()) {
    object Login: Screen("login")
    object Home: Screen("home")

    object ProductDetail: Screen("details", navArguments = listOf(navArgument(Params.PRODUCT_ID) {
        type = NavType.StringType
    })) {
        fun createRoute(productId : String) = "details/$productId"
    }
}