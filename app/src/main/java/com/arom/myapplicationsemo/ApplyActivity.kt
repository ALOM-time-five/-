package com.arom.myapplicationsemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arom.myapplicationsemo.databinding.ActivityApplyBinding
import com.arom.myapplicationsemo.databinding.ActivityBoard1Binding

class ApplyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApplyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityApplyBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}