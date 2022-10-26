package com.caesar.easy.sampleapp.di

import com.caesar.easy.sampleapp.EasyKotlinApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, AppBindingModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: EasyKotlinApplication): Builder

        fun build(): AppComponent
    }

    fun inject(application: EasyKotlinApplication)
}
