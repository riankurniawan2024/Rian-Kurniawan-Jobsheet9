package com.example.zahranuranisya_job9_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnProfile : Button = findViewById(R.id.btnProfile)
        val btnStmik : Button = findViewById(R.id.btnStmik)

        btnProfile.setOnClickListener {
            val intent = Intent(this,ProfilMahasiswa:: class.java)
            startActivity(intent)
        }

        btnStmik.setOnClickListener {
            val intent = Intent(this, ProfilSTMIK:: class.java)
            startActivity((intent))
        }
    }
}