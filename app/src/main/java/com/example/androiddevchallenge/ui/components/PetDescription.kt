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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.db.PetObj
import com.example.androiddevchallenge.db.PetRepo

@Composable
fun PetDescription(pet: PetObj) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 10.dp,
                end = 10.dp
            )
    ) {

        Spacer(modifier = Modifier.height(24.dp))
        Text("About me")
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = pet.pupDesc,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 0.dp, 16.dp, 0.dp),
            style = MaterialTheme.typography.body2,
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Age: ${pet.pupAge} y/o")

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Gender: ${pet.pupGender}")

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                shape = CircleShape,
                onClick = { },
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(200.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.label_takemehome),
                )
            }
        }
    }
}

@Preview
@Composable
fun ShowPreviewDescription() {
    PetDescription(pet = PetRepo().cerberus)
}
