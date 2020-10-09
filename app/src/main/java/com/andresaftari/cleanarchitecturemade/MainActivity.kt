package com.andresaftari.cleanarchitecturemade

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.andresaftari.cleanarchitecturemade.presentation.MainViewModel
import com.andresaftari.cleanarchitecturemade.presentation.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.apply {
            setName("Andre")
            message.observe(this@MainActivity, {
                tv_welcome?.text = it.welcomeMessage
            })
        }
    }
}