package dev.weazyexe.dagger2sample.ui

import android.widget.Toast
import dev.weazyexe.dagger2sample.app.App

class MainPresenter(private val app: App) : Presenter {

    override fun sayHi() {
        Toast.makeText(app, "hello from presenter", Toast.LENGTH_SHORT).show()
    }

}