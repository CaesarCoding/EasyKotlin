package com.caesar.easy.sampleapp.di

import android.content.Context
import com.caesar.easy.easyKotlin.external.EasyKotlin
import com.caesar.easy.sampleapp.EasyKotlinApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideContext(): Context = EasyKotlinApplication.app()

    @Singleton
    @Provides
    fun provideEasyKotlin(context: Context): EasyKotlin =
        EasyKotlin(context)

}