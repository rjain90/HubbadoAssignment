package com.hubbado.primenumber.injection.module

import androidx.lifecycle.ViewModelProvider
import com.hubbado.primenumber.injection.DaggerViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: DaggerViewModelFactory): ViewModelProvider.Factory
}