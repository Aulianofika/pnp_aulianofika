package com.example.tugas_aulianofika_pnp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnmi : Button
    private lateinit var btnteknik : Button
    private lateinit var btngaleri : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnmi = findViewById(R.id.btnmi)
        btnteknik = findViewById(R.id.btnteknik)
        btngaleri = findViewById(R.id.btngaleri)

        btnmi.setOnClickListener {
            val intent = Intent(this, MiActivity::class.java)
            startActivity(intent)

        }

        btnteknik.setOnClickListener {
            val intent = Intent(this, teknikActivity::class.java)
            startActivity(intent)

        }

        btngaleri.setOnClickListener {
            val intent = Intent(this, GaleriActivity::class.java)
            startActivity(intent)

        }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }