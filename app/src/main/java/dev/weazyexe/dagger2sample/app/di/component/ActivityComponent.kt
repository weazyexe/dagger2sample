package dev.weazyexe.dagger2sample.app.di.component

import dagger.Component
import dev.weazyexe.dagger2sample.app.di.module.PresenterModule
import dev.weazyexe.dagger2sample.ui.MainActivity

@Component(dependencies = [AppComponent::class], modules = [PresenterModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}