package com.example.kotlincourse

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = 1
        val resultText: TextView = findViewById(R.id.result_text)
        fun rollDice() {
            Toast.makeText(
                this, "button clicked",
                Toast.LENGTH_SHORT
            ).show()

            val randomInt = (1..6).random()
            resultText.text = randomInt.toString()
            num = randomInt
        }

        fun incDice() {
            if (num != 6) {
                num++
            }

            resultText.text = num.toString()
        }

        fun resetDice(){
            num = 0;
            resultText.text = num.toString()
        }

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { incDice() }
        resetButton.setOnClickListener{ resetDice()}

    }
}