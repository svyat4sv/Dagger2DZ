package com.example.dagger2dz

import dagger.Component

@Component(modules = [DogModulesssssssssssssssssssssss::class])
interface MyComponent {
    @Component.Builder
    interface Builder {
        fun build(): MyComponent
    }

    fun inject(mainActivity: MainActivity)
}