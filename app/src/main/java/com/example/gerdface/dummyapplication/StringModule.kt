package com.example.gerdface.dummyapplication

import dagger.Binds
import dagger.Module

@Module
abstract class StringModule {

    @Binds
    abstract fun provideString(myStringProvider: MyStringProvider): IStringProvider
}