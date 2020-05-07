package com.hubbado.primenumber.injection.component

import com.hubbado.primenumber.FibonacciSequenceTest
import com.hubbado.primenumber.PrimeNumberTest
import com.hubbado.primenumber.util.FibonacciSequence
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface TestComponent {
    fun inject(primeNumberTest: PrimeNumberTest)
    fun inject(fibonacciSequenceTest: FibonacciSequenceTest)
}