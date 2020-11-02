package com.example.android4a.injection

import android.app.Presentation
import com.example.android4a.MainViewModel
import org.koin.dsl.module

val PresentationModule = module {
    factory { MainViewModel() }
}