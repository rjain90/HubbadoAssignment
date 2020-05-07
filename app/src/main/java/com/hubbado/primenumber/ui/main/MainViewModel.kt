package com.hubbado.primenumber.ui.main

import androidx.lifecycle.ViewModel
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberMultArrayUseCase
import com.hubbado.primenumber.usecase.fibonacci.GetFibNumberSumArrayUseCase
import com.hubbado.primenumber.usecase.prime.GetPrimeNumberMultArrayUseCase
import com.hubbado.primenumber.usecase.prime.GetPrimeNumberSumArrayUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getPrimeNumberSumArrayUseCase: GetPrimeNumberSumArrayUseCase,
    private val getPrimeNumberMultArrayUseCase: GetPrimeNumberMultArrayUseCase,
    private val getFibNumberSumArrayUseCase: GetFibNumberSumArrayUseCase,
    private val getFibNumberMultArrayUseCase: GetFibNumberMultArrayUseCase
) :
    ViewModel() {
    fun getPrimeNumberAdditionArray(width: Int, height: Int): Array<IntArray> =
        getPrimeNumberSumArrayUseCase.invoke(width, height)

    fun getPrimeNumberMultiplicationArray(width: Int, height: Int): Array<IntArray> =
        getPrimeNumberMultArrayUseCase.invoke(width, height)

    fun getFibonacciAdditionArray(width: Int, height: Int): Array<IntArray> =
        getFibNumberSumArrayUseCase.invoke(width, height)

    fun getFibonacciMultiplicationArray(width: Int, height: Int): Array<IntArray> =
        getFibNumberMultArrayUseCase.invoke(width, height)
}