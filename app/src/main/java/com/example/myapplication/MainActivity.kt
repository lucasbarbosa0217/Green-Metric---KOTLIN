package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgLogin = findViewById<ImageView>(R.id.loginIcon)
        val textLogin = findViewById<TextView>(R.id.loginText)

        imgLogin.setOnClickListener{
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }

        textLogin.setOnClickListener{
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
    }
}