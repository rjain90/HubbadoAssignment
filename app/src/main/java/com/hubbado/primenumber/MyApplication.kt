package com.hubbado.primenumber

import android.app.Application
import com.hubbado.primenumber.injection.component.DaggerPrimeComponent
import com.hubbado.primenumber.injection.component.PrimeComponent
import com.hubbado.primenumber.injection.module.ContextModule

class MyApplication : Application() {
    companion object {
        lateinit var appComponent: PrimeComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerPrimeComponent.builder()
                .build()
        appComponent
                .inject(this)
    }
}