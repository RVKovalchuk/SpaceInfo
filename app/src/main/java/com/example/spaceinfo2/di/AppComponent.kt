package com.example.spaceinfo2.di

import com.example.spaceinfo2.data.retrofit.AstronomyPictureOfTheDayService
import com.example.spaceinfo2.di.modules.DataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
abstract class AppComponent {
    abstract fun getWebService() : AstronomyPictureOfTheDayService
}