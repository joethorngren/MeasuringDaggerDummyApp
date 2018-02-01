package com.example.gerdface.dummyapplication

import android.app.Application

class BaseApplication : Application() {

    lateinit var activityComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        createActivityComponent()
    }

    private fun createActivityComponent() {
        activityComponent = DaggerAppComponent.create()
    }
}