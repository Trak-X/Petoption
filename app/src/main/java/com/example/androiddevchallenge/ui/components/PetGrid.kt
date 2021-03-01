package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.db.PetObj

@Composable
fun PetGrid(names: List<PetObj>, onPetSelected: (PetObj) -> Unit) {
    LazyColumn {
        items(count = names.size) { pet ->
            PetCard(pet = names[pet], onPetSelected)
        }
    }
}