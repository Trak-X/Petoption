package com.example.androiddevchallenge.backend

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationController() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Navigation.Dashboard.destination) {
        composable(Navigation.Dashboard.destination) {
            Dashboard(
                onPetSelected = { puppy ->
                    navController.navigate(Navigation.PupDetails.destination + "/${puppy.id}")
                }
            )
        }
        composable(Navigation.PupDetails.destination + "/{id}") { backStackEntry ->
            val pupId = backStackEntry.arguments?.getString("id")
            val pup = PetRepo().getPetById(id = pupId!!)
                ?: throw IllegalStateException("Doggo not found")
            PetDetails(
                pet = pup,
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}