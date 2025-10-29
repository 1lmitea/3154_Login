package com.example.a3154_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        val et_username: EditText = findViewById(R.id.et_username)
        val et_password: EditText = findViewById(R.id.et_password)
        val btn_login: Button = findViewById(R.id.btn_login)
        val btn_register: Button = findViewById(R.id.btn_register)

        // Tombol LOGIN
        btn_login.setOnClickListener {
            val username = et_username.text.toString()
            if (username.isNotEmpty()) {
                val pindah = Intent(this, Dashboard::class.java)
                pindah.putExtra("nama", username)
                startActivity(pindah)
            } else {
                et_username.error = "Masukkan username dulu!"
            }
        }

        // Tombol REGISTER
        btn_register.setOnClickListener {
            val regIntent = Intent(this, RegisterActivity::class.java)
            startActivity(regIntent)
        }
    }
}