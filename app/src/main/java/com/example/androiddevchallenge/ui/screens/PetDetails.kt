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
package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.db.PetObj
import com.example.androiddevchallenge.db.PetRepo
import com.example.androiddevchallenge.ui.components.PetDescription
import com.example.androiddevchallenge.ui.components.TopCard

@Composable
fun PetDetails(
    pet: PetObj,
    navigateBack: () -> Unit
) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            TopCard(pet = pet)
            PetDescription(pet = pet)
        }
        IconButton(onClick = navigateBack) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                tint = MaterialTheme.colors.secondaryVariant
            )
        }
    }
}

@Preview
@Composable
fun ShowPreview() {
    PetDetails(pet = PetRepo().cerberus, navigateBack = { /*TODO*/ })
}