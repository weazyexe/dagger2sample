package dev.weazyexe.dagger2sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.weazyexe.dagger2sample.R
import dev.weazyexe.dagger2sample.app.App
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var app: App

    @Inject
    lateinit var presenter: Presenter

    init {
        App.activityComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        app.sayHi()
        presenter.sayHi()
    }
}