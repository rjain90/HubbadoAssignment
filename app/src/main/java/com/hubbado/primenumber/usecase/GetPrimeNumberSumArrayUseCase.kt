package com.hubbado.primenumber.usecase

import com.hubbado.primenumber.util.PrimeNumber
import javax.inject.Inject

interface GetPrimeNumberSumArrayUseCase {
    fun invoke(n: Int): Array<IntArray>
}

class GetPrimeNumberSumArrayUseCaseImpl @Inject constructor(val primeNumber: PrimeNumber) :
    GetPrimeNumberSumArrayUseCase {
    override fun invoke(n: Int): Array<IntArray> {
        val arr = Array(n) { IntArray(n) }
        for (i in 1..n)
            for (j in 1..n)
                arr[i - 1][j - 1] =
                    primeNumber.findNthPrimeNumber(i) + primeNumber.findNthPrimeNumber(j)

        return arr
    }
}