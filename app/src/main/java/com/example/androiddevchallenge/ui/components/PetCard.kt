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

package com.example.androiddevchallenge.ui.components

import android.graphics.Color.parseColor
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.db.Gender
import com.example.androiddevchallenge.db.PetObj
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetCard(
    pet: PetObj,
    onPetSelected: (PetObj) -> Unit
) {
    val color = when (pet.pupGender) {
        Gender.Male -> Color(parseColor("#5e92f3"))
        Gender.Female -> Color(parseColor("#ffc1e3"))
        Gender.Undefined -> Color.Green
    }

    Card(
        modifier = Modifier
            .padding(all = 10.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .clickable {
                onPetSelected(pet)
            },
        elevation = 5.dp,
        backgroundColor = color
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    pet.pupName,
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    pet.pupBreed,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 8.dp)
                )
            }

            CoilImage(
                fadeIn = true,
                data = pet.pupImgLocation,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .clip(shape = RoundedCornerShape(15.dp))
            )
        }
        Spacer(Modifier.height(16.dp))
    }
}