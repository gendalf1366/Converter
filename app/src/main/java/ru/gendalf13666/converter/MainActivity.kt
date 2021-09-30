package ru.gendalf13666.converter

import android.os.Bundle
import com.github.terrakok.cicerone.androidx.AppNavigator
import io.reactivex.disposables.CompositeDisposable
import moxy.MvpAppCompatActivity
import ru.gendalf13666.converter.Navigator.Navigation.navigatorHolder
import ru.gendalf13666.converter.Navigator.Navigation.router
import ru.gendalf13666.converter.presentation.converter.ConverterScreen

class MainActivity : MvpAppCompatActivity() {

    private val navigator = AppNavigator(this, android.R.id.content)

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        savedInstanceState ?: router.newRootScreen(ConverterScreen)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()

        disposables.dispose()
    }
}
