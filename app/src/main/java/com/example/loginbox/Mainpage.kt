package com.example.loginbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val btn1 : TextView = findViewById(R.id.pro1)
        val btn2 : TextView = findViewById(R.id.pro2)
        val btn3 : TextView = findViewById(R.id.pro3)
        val btn4 : TextView = findViewById(R.id.pro4)
        val btn5 : TextView = findViewById(R.id.pro5)
        val price1: TextView = findViewById(R.id.pri1)

        btn1.setOnClickListener{
            val price = price1.text.toString().toInt()
            val intent = Intent(this, Product::class.java)
            intent.putExtra("price", price)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener{
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener{
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

    }
}