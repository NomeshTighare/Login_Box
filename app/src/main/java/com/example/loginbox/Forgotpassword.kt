package com.example.loginbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class Forgotpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)

        val back1: TextView = findViewById(R.id.back2)
        val enteremail: TextInputEditText = findViewById(R.id.EmailaddEdit)
        val enternumber: TextInputEditText = findViewById(R.id.mobilenumberEdit)
        val getotp: Button = findViewById(R.id.getotp)
        val otp: TextView = findViewById(R.id.otp)
        val enterotp: TextInputEditText = findViewById(R.id.enterotpEdit)
        val submit : Button = findViewById(R.id.submit)

        back1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        getotp.setOnClickListener {
            val email1: String = enteremail.text.toString()
            val number1: String = enternumber.text.toString()
            if (email1.equals("Nomeshtighare@gmail.com") && number1.equals("8956579244")) {
                otp.text = "852369"
                Toast.makeText(this, "OTP Generated", Toast.LENGTH_LONG).show()
            }
            submit.setOnClickListener {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                val enter: String = enterotp.text.toString()
                if (enter.equals("852369")) {
                    Toast.makeText(this, "OTP Verified", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}