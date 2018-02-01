package com.example.gerdface.dummyapplication

import dagger.Component

@Component(modules = [StringModule::class])
interface AppComponent {

    fun inject(target: MainActivity)
}