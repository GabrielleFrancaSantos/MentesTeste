package com.example.mentesteste

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app)

        val botaoComecar = findViewById<Button>(R.id.bt_comecar)
        botaoComecar.setOnClickListener {
            val intent = Intent(this, Logincc::class.java)
            startActivity(intent)
        }

    }
}