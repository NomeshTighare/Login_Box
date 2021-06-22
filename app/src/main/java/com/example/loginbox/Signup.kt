package com.example.loginbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnsignup: Button = findViewById(R.id.signup)
        val firstname: TextInputEditText = findViewById(R.id.firstnameEdit)
        val lastname: TextInputEditText = findViewById(R.id.lastnameEdit)
        val Email: TextInputEditText = findViewById(R.id.EmailEdit)
        val pass: TextInputEditText = findViewById(R.id.passwordEdit)
        val btnback: TextView = findViewById(R.id.back)

        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnsignup.setOnClickListener {
            val firstname1: String = firstname.text.toString()
            val lastname1: String = lastname.text.toString()
            val Email1: String = Email.text.toString()
            val pass1: String = pass.text.toString()

            if (firstname1.equals("Nomesh") && lastname1.equals("Tighare") &&
                Email1.equals("Nomeshtighare@gmail.com") && pass1.equals("admin"))
                {
                 Toast.makeText(this, "Sign up Successful", Toast.LENGTH_LONG).show()
            }
        }
    }
}