package com.example.typesafenavigationcompose.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {
    @Serializable
    data object Home : Screen
    @Serializable
    data class Profile(val name: String) : Screen
    @Serializable
    data object Settings : Screen
}