package com.schaefer.basicstatecodelab.ui.widgets

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.schaefer.basicstatecodelab.data.getWellnessTasks
import com.schaefer.basicstatecodelab.domain.WellnessTask

@Composable
fun WellnessTasksList(modifier: Modifier = Modifier, list: List<WellnessTask> = remember { getWellnessTasks() }) {
    LazyColumn(modifier = modifier) {
        items(list){ task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}