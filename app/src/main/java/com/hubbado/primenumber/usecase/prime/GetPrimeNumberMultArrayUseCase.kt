package com.hubbado.primenumber.usecase.prime

import com.hubbado.primenumber.util.PrimeNumber
import javax.inject.Inject

interface GetPrimeNumberMultArrayUseCase {
    fun invoke(width: Int, height: Int): Array<IntArray>
}

class GetPrimeNumberMultArrayUseCaseImpl @Inject constructor(val primeNumber: PrimeNumber) :
    GetPrimeNumberMultArrayUseCase {
    override fun invoke(width: Int, height: Int): Array<IntArray> {
        val arr = Array(height) { IntArray(width) }
        for (i in 1..height)
            for (j in 1..width)
                arr[i - 1][j - 1] =
                    primeNumber.findNthPrimeNumber(i) * primeNumber.findNthPrimeNumber(j)

        return arr
    }
}