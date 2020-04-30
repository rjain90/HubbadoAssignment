package com.hubbado.primenumber


import com.hubbado.primenumber.injection.component.DaggerTestComponent
import com.hubbado.primenumber.util.PrimeNumber
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import javax.inject.Inject


class PrimeNumberTest {

    @Before
    fun setUp() {
        val component = DaggerTestComponent
            .builder()
            .build()
        component.inject(this)
    }

    @Inject
    lateinit var primeNumber: PrimeNumber

    @Test
    fun isNthPrimeNumberCorrect() {
        Assert.assertEquals(primeNumber.findNthPrimeNumber(0), 0)
        Assert.assertEquals(primeNumber.findNthPrimeNumber(1), 2)
        Assert.assertEquals(primeNumber.findNthPrimeNumber(10), 29)
    }

    @Test
    fun isPrimeNumberCorrect() {
        assert(primeNumber.isPrime(0).not())
        assert(primeNumber.isPrime(8).not())
        assert(primeNumber.isPrime(456).not())
        assert(primeNumber.isPrime(113))
    }
}