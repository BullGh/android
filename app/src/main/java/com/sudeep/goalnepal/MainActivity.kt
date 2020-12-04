package com.sudeep.goalnepal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //refrence / binding
        val etFirst: EditText = findViewById(R.id.etFirst)
        val etSecond: EditText = findViewById(R.id.etSecond)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        // listener

        btnCalculate.setOnClickListener {
            val First: Int = etFirst.text.toString().toInt()
            val Second: Int = etSecond.text.toString().toInt()
            val result = First + Second
            tvResult.text = result.toString()
            Toast.makeText(
                    this,
                    "Sum is $result",
                    Toast.LENGTH_LONG
            ).show()
        }
    }
}