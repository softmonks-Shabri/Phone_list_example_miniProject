package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySplashScrenBinding

class SplashScren : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScrenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScrenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initialise()
        onClickEvents()
    }

    private fun initialise(){

    }

    private fun onClickEvents(){

    }
}