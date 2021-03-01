package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.db.PetObj
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun TopCard(pet: PetObj) {
    Column {
        CoilImage(
            fadeIn = true,
            data = pet.pupImgLocation,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier =
                Modifier
                    .height(250.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = CornerSize(0.dp),
                            topEnd = CornerSize(0.dp),
                            bottomEnd = CornerSize(20.dp),
                            bottomStart = CornerSize(20.dp)
                        )
                    )
        )
    }
}