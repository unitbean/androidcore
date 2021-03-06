package com.ub.utils.di.components

import com.ub.utils.di.modules.ApiModule
import com.ub.utils.di.modules.MainModule
import com.ub.utils.ui.main.MainPresenter
import com.ub.utils.ui.main.MainRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface AppComponent {
    fun mainSubcomponent(main: MainModule): MainSubcomponent
}