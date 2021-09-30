package ru.gendalf13666.converter

import android.view.View

fun View.click(click: () -> Unit) = setOnClickListener { click() }
