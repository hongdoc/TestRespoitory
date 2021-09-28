package com.hongdoc.networkretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hongdoc.networkretrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }
}