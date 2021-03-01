package com.example.androiddevchallenge.backend

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.db.PetRepo
import com.example.androiddevchallenge.ui.screens.Dashboard
import com.example.androiddevchallenge.ui.screens.PetDetails

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
            val pet = PetRepo().getPetById(id = pupId!!)
                ?: throw IllegalStateException("Pet not found")
            PetDetails(
                pet = pet,
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}