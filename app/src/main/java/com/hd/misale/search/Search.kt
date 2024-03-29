package com.hd.misale.search

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SearchContent(){
    val fill = remember {
        mutableStateOf(true)
    }
    LocalDensity
    Surface {
        Row(Modifier.fillMaxSize()){


            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(if(!fill.value)1f else 3f)
                    .background(Color(0xFFD0BCFF))
                    .clickable { fill.value = !fill.value }
                    .animateContentSize())
            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(if(!fill.value)1f else 2f)
                    .background(Color(0xFFD0BCAA))
                    .clickable { fill.value = !fill.value }
                    .animateContentSize())
            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFD0BCCC))
                    .clickable { fill.value = !fill.value }
                    .animateContentSize())

            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFEFB8C8))
                    .clickable { fill.value = !fill.value }
                    .animateContentSize())

        }

    }
}

