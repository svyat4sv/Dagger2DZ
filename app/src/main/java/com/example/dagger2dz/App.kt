package com.example.dagger2dz

import android.app.Application
import dagger.internal.DaggerGenerated

class App : Application() {
    lateinit var myComponent: MyComponent
    override fun onCreate() {
        super.onCreate()
        myComponent = DaggerMyComponent.builder().build()
        //hello world
    }
}