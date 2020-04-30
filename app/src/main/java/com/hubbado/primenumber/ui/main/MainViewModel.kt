package com.hubbado.primenumber.ui.main

import androidx.lifecycle.ViewModel
import com.hubbado.primenumber.usecase.GetPrimeNumberSumArrayUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(private val getPrimeNumberSumArrayUseCase: GetPrimeNumberSumArrayUseCase) :
    ViewModel() {
    fun getPrimeNumberArray(n: Int): Array<IntArray> = getPrimeNumberSumArrayUseCase.invoke(n)
}