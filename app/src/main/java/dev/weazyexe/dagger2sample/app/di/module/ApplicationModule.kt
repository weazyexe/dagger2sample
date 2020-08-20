package dev.weazyexe.dagger2sample.app.di.module

import dagger.Module
import dagger.Provides
import dev.weazyexe.dagger2sample.app.App

@Module
class ApplicationModule(private val app: App) {

    @Provides
    fun provideApplication(): App = app
}