package com.example.fragmentlayout

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val currentOrientation = resources.configuration.orientation
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            //вертикальная ориентация
            setContentView(R.layout.activity_main)
        }
        else {
            //горизонтальная ориентация
            setContentView(R.layout.activity_main_horizontal)
        }
    }
}