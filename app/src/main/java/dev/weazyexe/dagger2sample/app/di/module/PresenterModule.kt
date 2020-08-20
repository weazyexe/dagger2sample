package dev.weazyexe.dagger2sample.app.di.module

import dagger.Module
import dagger.Provides
import dev.weazyexe.dagger2sample.app.App
import dev.weazyexe.dagger2sample.ui.MainPresenter
import dev.weazyexe.dagger2sample.ui.Presenter

@Module
class PresenterModule {

    @Provides
    fun providePresenter(app: App): Presenter = MainPresenter(app)
}