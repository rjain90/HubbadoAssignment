package com.hubbado.primenumber.injection.component

import com.hubbado.primenumber.PrimeNumberTest
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface TestComponent {
    fun inject(primeNumberTest: PrimeNumberTest)
}