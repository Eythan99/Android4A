package com.example.android4a.injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin


class EsieaApplication : Application() {

    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            val androidContext = androidContext(this@EsieaApplication)
            // modules
            modules(PresentationModule)
        }
    }

}