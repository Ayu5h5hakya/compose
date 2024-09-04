package com.example.composeapplication

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    object Home: BottomNavItem("home", Icons.Default.Home, "Home")
    object Search: BottomNavItem("search", Icons.Default.Search, "Search")
    object Profile: BottomNavItem("profile", Icons.Default.Person, "Profile")
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        listOf(BottomNavItem.Home, BottomNavItem.Search, BottomNavItem.Profile).forEach {
            BottomNavigationItem(
                selected = ,
                onClick = { /*TODO*/ },
                icon = { /*TODO*/ }
            )
        }
    }
}