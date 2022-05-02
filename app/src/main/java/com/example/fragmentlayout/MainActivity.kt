package com.example.fragmentlayout

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val currentOrientation = resources.configuration.orientation

        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_main_ver)
        else
            setContentView(R.layout.activity_main_hor)
    }
}