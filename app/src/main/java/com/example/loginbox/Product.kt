package com.example.loginbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val proprice : TextView = findViewById(R.id.price1)

        val price = intent.getIntExtra("price",0)
        proprice.text="Price : $price"
    }
}