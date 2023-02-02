package com.niw.testmodulararchitechture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niw.base.BaseLibClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baseLibClass = BaseLibClass().apply {
            fullName= "hahaha"
        }
    }
}