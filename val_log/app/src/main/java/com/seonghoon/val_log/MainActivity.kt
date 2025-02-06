package com.seonghoon.val_log

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = "여기는 value입니다!"
        val value2 = "여기는 value2입니다!"

        value = "여기는 value가 아닙니다!"

        val test = "여기는 test 값입니다"

        Log.e("MainActivity", test)
        Log.w("MainActivity", test)
        Log.i("MainActivity", test)
        Log.d("MainActivity", test)
        Log.v("MainActivity", test)

    }
}