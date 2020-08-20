package dev.weazyexe.dagger2sample.app.di.component

import dagger.Component
import dev.weazyexe.dagger2sample.app.App
import dev.weazyexe.dagger2sample.app.di.module.ApplicationModule

@Component(modules = [ApplicationModule::class])
interface AppComponent {
    fun app(): App
}