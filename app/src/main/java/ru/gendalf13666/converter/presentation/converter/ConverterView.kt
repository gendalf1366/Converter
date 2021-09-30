package ru.gendalf13666.converter.presentation.converter

import android.net.Uri
import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.gendalf13666.converter.presentation.ScreenView

interface ConverterView : ScreenView {

    @AddToEndSingle
    fun showContent(uri: Uri?)

    @AddToEndSingle
    fun showLoading()
}
