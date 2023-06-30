package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var button: Button? = null
    var textInput: EditText? = null
    var numInput1: EditText? = null
    var numInput2: EditText? = null
    var decInput: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.editTextText)
        numInput1 = findViewById(R.id.editTextNumber)
        numInput2 = findViewById(R.id.editTextNumber2)
        decInput = findViewById(R.id.editTextNumberDecimal)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            val name = textInput?.text?.toString()
            val height = numInput1?.text?.toString()
            val weight = decInput?.text?.toString()
            val age = numInput2?.text?.toString()

            if (name.isNullOrEmpty() || height.isNullOrEmpty() || weight.isNullOrEmpty() || age.isNullOrEmpty()) {
                Log.i(null, "Данные введены некорректно")
                return@setOnClickListener
            }

            val str = name.length + height.toInt() / 2 + weight.toInt() * 2 + age.toInt()
            Log.i(null, str.toString())
        }
    }
}