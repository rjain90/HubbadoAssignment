package com.hubbado.primenumber.injection.module

import androidx.lifecycle.ViewModel
import com.hubbado.primenumber.injection.ViewModelKey
import com.hubbado.primenumber.ui.main.MainViewModel
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberMultArrayUseCase
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberMultArrayUseCaseImpl
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberSumArrayUseCase
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberSumArrayUseCaseImpl
import com.hubbado.primenumber.usecase.prime.*
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

    @Binds
    @Singleton
    abstract fun provideGetPrimeNumberMultArrayUseCase(getPrimeNumberMultArrayUseCaseImpl: GetPrimeNumberMultArrayUseCaseImpl): GetPrimeNumberMultArrayUseCase

    @Binds
    @Singleton
    abstract fun provideGetFibNumberSumArrayUseCase(getFibNumberSumArrayUseCaseImpl: GetFibNumberSumArrayUseCaseImpl): GetFibNumberSumArrayUseCase

    @Binds
    @Singleton
    abstract fun provideGetFibNumberMultArrayUseCase(getFibNumberMultArrayUseCaseImpl: GetFibNumberMultArrayUseCaseImpl): GetFibNumberMultArrayUseCase
}