package com.seonghoon.dice_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.seonghoon.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 Go!", Toast.LENGTH_SHORT).show()

            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)

            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else if (number1 == 6) {
                diceImage1.setImageResource(R.drawable.dice_6)
            }
            
            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else if (number2 == 6) {
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }

    }
}