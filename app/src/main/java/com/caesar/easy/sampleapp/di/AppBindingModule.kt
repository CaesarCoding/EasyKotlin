package com.caesar.easy.sampleapp.di

import com.caesar.easy.sampleapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [AppModule::class])
abstract class AppBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}