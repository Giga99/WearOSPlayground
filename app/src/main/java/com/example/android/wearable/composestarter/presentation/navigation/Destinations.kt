package com.example.android.wearable.composestarter.presentation.navigation

sealed class Destinations(val route: String) {
    object HomeScreen : Destinations("home")
    object PurseScreen : Destinations("purse")
}
