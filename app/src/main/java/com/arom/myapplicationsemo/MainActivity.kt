package com.arom.myapplicationsemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.arom.myapplicationsemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fcv, HomeFragment())
                .commit()
        }

        val chattingFragment=ChattingFragment()
        val mypageFragment=MypageFragment()
        val homefragment=HomeFragment()


        binding.bottomnav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->supportFragmentManager.beginTransaction().replace(R.id.fcv,HomeFragment()).commit()
                R.id.mypage->supportFragmentManager.beginTransaction().replace(R.id.fcv,MypageFragment()).commit()
                R.id.chatting->supportFragmentManager.beginTransaction().replace(R.id.fcv,ChattingFragment()).commit()


            }
            true
        }


    }
}