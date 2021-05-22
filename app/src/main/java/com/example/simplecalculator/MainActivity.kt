package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etno1=findViewById<EditText>(R.id.etno1_)
        var etno2=findViewById<EditText>(R.id.etno2)
        var result=findViewById<TextView>(R.id.tvresult)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSubtract=findViewById<Button>(R.id.btnsubtract)
        var btnMultiply=findViewById<Button>(R.id.btnmultiply)
        var btnModulus=findViewById<Button>(R.id.btnmodulus)

        btnAdd.setOnClickListener {
            var no1=etno1.text.toString().toInt()
            var no2=etno2.text.toString().toInt()
            var add=no1 + no2
            result.setText(add.toString())

        }
        btnSubtract.setOnClickListener {
            var no1=etno1.text.toString().toInt()
            var no2=etno2.text.toString().toInt()
            var subtract=no1 - no2
            result.setText(subtract.toString())

        }
        btnMultiply.setOnClickListener {
            var no1=etno1.text.toString().toInt()
            var no2=etno2.text.toString().toInt()
            var multiply=no1 * no2
            result.setText(multiply.toString())

        }
        btnModulus.setOnClickListener {
            var no1=etno1.text.toString().toInt()
            var no2=etno2.text.toString().toInt()
            var modulus=no1 % no2
            result.setText(modulus.toString())

        }

    }
}