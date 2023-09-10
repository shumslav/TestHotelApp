package com.example.testhotelapp.di.dagger.components

import android.app.Application
import com.example.testhotelapp.di.dagger.modules.ContextModule
import com.example.testhotelapp.di.dagger.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class, ViewModelModule::class])
internal interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder

        fun build():AppComponent
    }
}