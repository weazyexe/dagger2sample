package dev.weazyexe.dagger2sample.app

import android.app.Application
import android.widget.Toast
import dev.weazyexe.dagger2sample.app.di.component.ActivityComponent
import dev.weazyexe.dagger2sample.app.di.component.AppComponent
import dev.weazyexe.dagger2sample.app.di.component.DaggerActivityComponent
import dev.weazyexe.dagger2sample.app.di.component.DaggerAppComponent
import dev.weazyexe.dagger2sample.app.di.module.ApplicationModule
import dev.weazyexe.dagger2sample.app.di.module.PresenterModule

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
        lateinit var activityComponent: ActivityComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()

        activityComponent = DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .presenterModule(PresenterModule())
            .build()
    }

    fun sayHi() {
        Toast.makeText(this, "hello from app", Toast.LENGTH_SHORT).show()
    }
}