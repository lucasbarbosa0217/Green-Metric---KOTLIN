package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btn_home = findViewById<ImageView>(R.id.btn_home)

        btn_home.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
        val btn_login = findViewById<Button>(R.id.button)
        btn_login.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }


    }
}