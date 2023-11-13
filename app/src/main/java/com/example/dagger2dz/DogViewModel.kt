package com.example.dagger2dz

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class DogViewModel @Inject constructor(val dogRepo: DogRepo):ViewModel() {
}