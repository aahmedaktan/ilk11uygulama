package com.example.odev_4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detay)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val golTextView =findViewById<TextView>(R.id.gol_sayısı)
        val macTextView =findViewById<TextView>(R.id.mac_sayısı)
        var resimgoster = findViewById<ImageView>(R.id.imageView)

        var intent = intent
        var image = intent.getIntExtra("image",0)
        val macsayisi = intent.getIntExtra("macsayisi", 0)
        val golsayisi = intent.getIntExtra("golsayisi",0)


        resimgoster.setImageResource(image)
        golTextView.text = "Gol Sayısı: $golsayisi"
        macTextView.text = "Maç Sayısı: $macsayisi"


    }
}