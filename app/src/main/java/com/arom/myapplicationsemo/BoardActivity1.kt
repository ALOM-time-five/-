package com.arom.myapplicationsemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arom.myapplicationsemo.databinding.ActivityBoard1Binding
import com.arom.myapplicationsemo.databinding.ActivityMainBinding

class BoardActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityBoard1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoard1Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}