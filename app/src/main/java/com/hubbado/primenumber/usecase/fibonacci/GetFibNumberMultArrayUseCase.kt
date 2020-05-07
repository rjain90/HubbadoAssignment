package com.hubbado.primenumber.usecase.fibonacci

import com.hubbado.primenumber.util.FibonacciSequence
import javax.inject.Inject

interface GetFibNumberMultArrayUseCase {
    fun invoke(width: Int, height: Int): Array<IntArray>
}

class GetFibNumberMultArrayUseCaseImpl @Inject constructor(val fibonacciSequence: FibonacciSequence) :
    GetFibNumberMultArrayUseCase {
    override fun invoke(width: Int, height: Int): Array<IntArray> {
        val arr = Array(height) { IntArray(width) }
        for (i in 1..height)
            for (j in 1..width)
                arr[i - 1][j - 1] =
                    fibonacciSequence.findNthFibonacciNumber(i) * fibonacciSequence.findNthFibonacciNumber(j)

        return arr
    }
}