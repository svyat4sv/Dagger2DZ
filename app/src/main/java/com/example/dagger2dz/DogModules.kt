package com.example.dagger2dz

import dagger.Module
import dagger.Provides

@Module
class DogModules {
    @Provides
    fun createDog():Dog{
        return Dog()
    }
}