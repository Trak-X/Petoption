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
import androidx.compose.ui.graphics.Color
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
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun showPreview() {
    PetDetails(pet = PetRepo().cerberus, navigateBack = { /*TODO*/ })
}