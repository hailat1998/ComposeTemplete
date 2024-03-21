package com.hd.misale.home

import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun HomeContent(){
    Surface {
     Text(text = "Say may name", fontSize = 29.sp , fontWeight = FontWeight.Bold)
    }
}