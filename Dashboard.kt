package com.example.a3154_login

import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Button
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val tv_ucapan: TextView = findViewById(R.id.tv_ucapan)
        val username = intent.getStringExtra("nama")
        tv_ucapan.text = "Selamat Datang! $username"

        // Tombol implicit intent buka website
        val btnOpenWebsite: Button = findViewById(R.id.btn_open_website)
        btnOpenWebsite.setOnClickListener {
            val url = "https://home.amikom.ac.id/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}