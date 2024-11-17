package com.example.odev_4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odev_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var osimhen = bilgi("Victor Osimhen",45,"Forvet",R.drawable.osimhen,6,6)
        var icardi = bilgi("Mauro İcardi",9,"Forvet",R.drawable.icardi,10,20)
        var alper = bilgi("Barıs Alper Yılmaz",63,"Forvet",R.drawable.alper,20,5)
        var mertens = bilgi("Dries Mertens",10,"Orta Saha",R.drawable.mertens,30,2)
        var toreira = bilgi("Lukas Toreira",34,"Orta Saha",R.drawable.toreira,40,4)
        var sara = bilgi("Gabriel Sara",20,"Orta Saha",R.drawable.sara,50,15)
        var sanchez = bilgi("Davinson Sanchez",6,"Defans",R.drawable.sanchez,50,20)
        var kaan = bilgi("Kaan Ayhan",23,"Defans",R.drawable.kaan,50,3)
        var yunus = bilgi("Yunus Akgün",11,"Forvet",R.drawable.yunus,50,8)
        var abdulkerim = bilgi("Abdulkerim Bardakçı",42,"Defans",R.drawable.abdulkerim,25,9)
        var muslera = bilgi("Fernando Muslera",1,"Kaleci",R.drawable.muslera,500,1)

        var oyunculistesi = ArrayList<bilgi>()
        oyunculistesi.add(osimhen)
        oyunculistesi.add(icardi)
        oyunculistesi.add(alper)
        oyunculistesi.add(mertens)
        oyunculistesi.add(toreira)
        oyunculistesi.add(sara)
        oyunculistesi.add(sanchez)
        oyunculistesi.add(kaan)
        oyunculistesi.add(yunus)
        oyunculistesi.add(abdulkerim)
        oyunculistesi.add(muslera)

        var adapter = myadapter(oyunculistesi)
        binding.recyleView.adapter = adapter
        binding.recyleView.layoutManager = LinearLayoutManager(this)







    }
}