package dev.roberth.appdpa.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import dev.roberth.appdpa.presentation.auth.LoginScreen
import dev.roberth.appdpa.presentation.auth.RegisterScreen
import dev.roberth.appdpa.presentation.home.HomeScreen
import dev.roberth.appdpa.presentation.permissions.GalleryPermissionsScreen

@Composable
fun AppNavegation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "register") {
        composable("register") { RegisterScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("home") {
            DrawerScaffold(navController) {
                HomeScreen()
            }
        }
        composable("permissions") {
            DrawerScaffold(navController) {
                GalleryPermissionsScreen()
            }
        }

    }
}