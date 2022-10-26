package com.caesar.easy.sampleapp

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class EasyKotlinApplication : Application() {

    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        private lateinit var instance: EasyKotlinApplication
        fun app() = instance
    }
}