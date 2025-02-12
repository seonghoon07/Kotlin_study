package com.seonghoon.goodwords

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.seonghoon.goodwords.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

    }
}