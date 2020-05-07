package com.hubbado.primenumber.util

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FibonacciSequence @Inject constructor() {

    private val fibonacciMap = HashMap<Int, Int>()

    init {
        fibonacciMap[1] = 1
        fibonacciMap[2] = 1
    }

    fun findNthFibonacciNumber(n: Int): Int {
        return if (n == 0) {
            0
        } else if (fibonacciMap[n] != null)
            fibonacciMap[n]!!
        else {
            val maxIndex: Int = fibonacciMap.keys.max() ?: 2
            for (i in maxIndex + 1..n) {
                fibonacciMap[i] = fibonacciMap[i - 2]!! + fibonacciMap[i - 1]!!
            }

            fibonacciMap[n]!!
        }
    }
}