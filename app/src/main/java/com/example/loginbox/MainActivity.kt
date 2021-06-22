package com.example.loginbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin :Button   = findViewById(R.id.button)
        val username :TextInputEditText= findViewById(R.id.usernameEditText)
        val password :TextInputEditText = findViewById(R.id.passwordEditText)
        val showbox1 :TextView = findViewById(R.id.showbox1)
        val signup1 : TextView = findViewById(R.id.signupcall)
        val forgot  : TextView = findViewById(R.id.forgot)

        forgot.setOnClickListener {
            val intent = Intent(this, Forgotpassword::class.java)
            startActivity(intent)
        }

        signup1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener{



            val username1:String = username.text.toString()
            val userpass:String = password.text.toString()

            if (username1.equals("Nomeshtighare@gmail.com") && userpass.equals("admin"))
            {
                val intent = Intent(this, Mainpage::class.java)
                startActivity(intent)
                showbox1.text=""
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            }
            else
            {
                showbox1.text="something went wrong"
                Toast.makeText(this,"Invalid Credentials",Toast.LENGTH_LONG).show()
            }
        }

    }
}