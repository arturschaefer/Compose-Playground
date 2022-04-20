package com.schaefer.basicstatecodelab.data

import com.schaefer.basicstatecodelab.domain.WellnessTask

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }