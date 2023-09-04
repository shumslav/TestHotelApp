package com.example.testhotelapp.data.di.dagger.components

import com.example.testhotelapp.data.di.dagger.modules.RemoteModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RemoteModule::class])
interface DataComponent {

}