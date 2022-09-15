package com.example.android.wearable.composestarter.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import com.example.android.wearable.composestarter.presentation.home.HomeScreen
import com.example.android.wearable.composestarter.presentation.purse.PurseScreen

@Composable
fun WearNavHost(
    navController: NavHostController
) {
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = Destinations.HomeScreen.route
    ) {
        composable(route = Destinations.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Destinations.PurseScreen.route) {
            PurseScreen()
        }
    }
}
