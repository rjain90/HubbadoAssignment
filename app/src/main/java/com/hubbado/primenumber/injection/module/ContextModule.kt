package com.hubbado.primenumber.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val context: Context) {
    /**
     * Provides the Application Context
     * @param context Context in which the application is running
     * @return the Application Context to be provided
     */
    @Provides
    fun provideApplication(): Application {
        return context.applicationContext as Application
    }

    /**
     * Provides the Context
     * @return the Context to be provided
     */
    @Provides
    fun provideContext(): Context = context
}