package com.example.gerdface.dummyapplication

import javax.inject.Inject

interface IStringProvider {

    fun provideString(): String
}

class MyStringProvider @Inject constructor() : IStringProvider {
    override fun provideString(): String {
        return "foo"
    }

}