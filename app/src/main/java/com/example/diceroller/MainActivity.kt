package com.example.diceroller

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice: TextView = findViewById(R.id.result_text)
        val randomValue = Random.nextInt(1,7)
        dice.text = randomValue.toString()
    }
}