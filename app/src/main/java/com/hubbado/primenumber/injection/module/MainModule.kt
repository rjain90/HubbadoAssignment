package com.hubbado.primenumber.injection.module

import androidx.lifecycle.ViewModel
import com.hubbado.primenumber.usecase.GetPrimeNumberSumArrayUseCase
import com.hubbado.primenumber.usecase.GetPrimeNumberSumArrayUseCaseImpl
import com.hubbado.primenumber.ui.main.MainViewModel
import com.hubbado.primenumber.injection.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMyViewModel(myViewModel: MainViewModel): ViewModel

    @Binds
    @Singleton
    abstract fun provideGetPrimeNumberSumArrayUseCase(getPrimeNumberSumArrayUseCaseImpl: GetPrimeNumberSumArrayUseCaseImpl): GetPrimeNumberSumArrayUseCase
}