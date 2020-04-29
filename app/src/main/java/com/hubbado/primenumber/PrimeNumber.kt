package com.hubbado.primenumber

import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.ceil
import kotlin.math.sqrt

@Singleton
class PrimeNumber @Inject constructor() {

    private val primeMap = HashMap<Int, Int>()

    fun findNthPrimeNumber(n: Int): Int {
        if (n == 0) {
            return 0
        } else if (primeMap[n] != null)
            return primeMap[n]!!
        else {
            val maxIndex: Int = primeMap.keys.max() ?: 1
            var maxPrimeNumber = primeMap[maxIndex] ?: 2
            for (i in maxIndex..n) {
                while (!isPrime(maxPrimeNumber)){
                    maxPrimeNumber++
                }

                primeMap[i] = maxPrimeNumber
                maxPrimeNumber++
            }

            return primeMap[n]!!
        }
    }

    fun isPrime(n: Int): Boolean {
        val m = ceil(sqrt(n.toDouble()))
        if (n < 2)
            return false
        else if (n == 2)
            return true
        else if (n % 2 == 0) {
            return false
        }

        var i = 3
        while (i <= m) {
            if (n % i == 0) {
                return false
            }
            i += 2
        }

        return true
    }
}