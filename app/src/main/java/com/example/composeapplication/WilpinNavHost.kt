package com.example.composeapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.example.composeapplication.features.splash.presentation.SplashScreen
import com.example.composeapplication.routes.Screen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navigateToLogin = {navController.navigate("login")})}
        composable("login") { LoginScreen(navigateToHome = { navController.navigate("home") })}
        composable("home") { HomeScreen(navigateToDetails = {
            val route = Screen.ProductDetail.createRoute("12")
            navController.navigate(route)
        })}
        dialog("details") {
            ProductDetail()
        }
    }
}