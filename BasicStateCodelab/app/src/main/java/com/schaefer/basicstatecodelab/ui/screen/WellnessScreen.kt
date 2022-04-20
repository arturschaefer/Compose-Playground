package com.schaefer.basicstatecodelab.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.schaefer.basicstatecodelab.ui.widgets.StatefulCounter
import com.schaefer.basicstatecodelab.ui.widgets.WaterCounter
import com.schaefer.basicstatecodelab.ui.widgets.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}