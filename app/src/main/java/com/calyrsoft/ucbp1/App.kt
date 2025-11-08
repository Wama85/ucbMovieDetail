package com.calyrsoft.ucbp1

import android.app.Application
import com.calyrsoft.ucbp1.di.appModule
import com.calyrsoft.ucbp1.features.logs.infraestructura.LogScheduler
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        LogScheduler(this).schedulePeriodicaUpload()
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}