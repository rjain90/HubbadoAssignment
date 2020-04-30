package com.hubbado.primenumber.injection.component

import com.hubbado.primenumber.ui.main.MainActivity
import com.hubbado.primenumber.injection.module.MainModule
import com.hubbado.primenumber.injection.module.ViewModelFactoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelFactoryModule::class, MainModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}