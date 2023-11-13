package com.example.dagger2dz

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class DogViewModelFactory @Inject constructor(private val repo: DogRepo) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DogViewModel(repo) as T
    }
}