package com.caesar.easy.sampleapp.di

import com.caesar.easy.sampleapp.EasyKotlinApplication
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AppBindingModule::class])
interface AppComponent{

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: EasyKotlinApplication): Builder

        fun build():AppComponent
    }

    fun inject(application: EasyKotlinApplication)
}
