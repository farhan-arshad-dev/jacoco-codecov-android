package com.dicedmelon.example.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dicedmelon.example.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val numberProvider = NumberProvider()
        viewDataBinding.number = numberProvider.provideNumber()
    }
}