package com.hubbado.primenumber.injection.component

import com.hubbado.primenumber.MyApplication
import com.hubbado.primenumber.injection.module.ContextModule
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface PrimeComponent {
    fun inject(myApplication: MyApplication)
}