/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
