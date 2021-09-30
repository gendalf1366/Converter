package ru.gendalf13666.converter.models

import android.content.Context

object ConverterFactory {

    fun create(context: Context): Converter {
        return ConverterImpl(context)
    }
}
