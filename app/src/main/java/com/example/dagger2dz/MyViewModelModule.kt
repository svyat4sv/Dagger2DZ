package com.example.dagger2dz

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class MyViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(DogViewModel::class)
    abstract fun bindMyViewModel(dogViewModel: DogViewModel): ViewModel
}


@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)