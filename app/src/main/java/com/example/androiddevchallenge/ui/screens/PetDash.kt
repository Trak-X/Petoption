package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.db.PetObj
import com.example.androiddevchallenge.db.PetRepo
import com.example.androiddevchallenge.ui.components.PetGrid

@Composable
fun Dashboard(onPetSelected: (PetObj) -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            Row(
                modifier = Modifier.height(60.dp).fillMaxWidth().padding(end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            start = 24.dp,
                            end = 24.dp,
                            top = 24.dp,
                        )
                )
            }
            Text(
                text = stringResource(id = R.string.champion),
                style = MaterialTheme.typography.subtitle2,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        bottom = 8.dp
                    )
            )

            PetGrid(PetRepo().listOfPets, onPetSelected)
        }
    }
}

@Preview
@Composable
fun DashboardPreview() {
    Dashboard(onPetSelected = { /*TODO*/ })
}