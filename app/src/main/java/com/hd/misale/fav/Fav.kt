package com.hd.misale.fav

import androidx.compose.foundation.background
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun FavContent(){
    Surface {
        Text(text = "This is Fav", fontSize = 29.sp , fontWeight = FontWeight.Bold, modifier = Modifier.background(MaterialTheme.colorScheme.background))

    }
}