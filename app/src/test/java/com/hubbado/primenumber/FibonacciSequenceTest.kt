package com.hubbado.primenumber


import com.hubbado.primenumber.injection.component.DaggerTestComponent
import com.hubbado.primenumber.util.FibonacciSequence
import com.hubbado.primenumber.util.PrimeNumber
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import javax.inject.Inject


class FibonacciSequenceTest {

    @Before
    fun setUp() {
        val component = DaggerTestComponent
            .builder()
            .build()
        component.inject(this)
    }

    @Inject
    lateinit var fibonacciSequence: FibonacciSequence

    @Test
    fun isNthFibonacciCorrect() {
        Assert.assertEquals(fibonacciSequence.findNthFibonacciNumber(0), 0)
        Assert.assertEquals(fibonacciSequence.findNthFibonacciNumber(1), 1)
        Assert.assertEquals(fibonacciSequence.findNthFibonacciNumber(10), 55)
    }
}