package com.example.dagger2dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2dz.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    lateinit var myComponent: MyComponent
    lateinit var dogViewModel: DogViewModel

    @Inject
    lateinit var dog: Dog

    @Inject
    lateinit var dogViewModelFactory: DogViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (application as App).myComponent
        myComponent.inject(this)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
        dogViewModel = ViewModelProvider(this, dogViewModelFactory).get(DogViewModel::class.java)
        activityMainBinding.button.setOnClickListener {
            var s: String = activityMainBinding.editTextText.getText().toString()
            activityMainBinding.textView.text = s + "!"
        }

    }
}