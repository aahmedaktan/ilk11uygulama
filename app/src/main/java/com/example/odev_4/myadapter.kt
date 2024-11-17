package com.example.odev_4

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class myadapter (private var oyunculistesi :List<bilgi>):RecyclerView.Adapter<myadapter.myviewholder>() {

    class myviewholder (itemView: View):RecyclerView.ViewHolder(itemView) {
        var isim = itemView.findViewById<TextView>(R.id.rv_name)
        var numara = itemView.findViewById<TextView>(R.id.rv_no)
        var mevki = itemView.findViewById<TextView>(R.id.rv_mevki)
        var foto = itemView.findViewById<ImageView>(R.id.rv_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recyle_row,parent,false)
        return myviewholder(view)
    }

    override fun getItemCount(): Int {
        return oyunculistesi.size
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        holder.isim.text = oyunculistesi[position].ad
        holder.numara.text = oyunculistesi[position].no.toString()
        holder.mevki.text = oyunculistesi[position].mevki
        holder.foto.setImageResource(oyunculistesi[position].resim)

        holder.itemView.setOnClickListener {
            var intent = Intent(holder.itemView.context, detay::class.java)
            intent.putExtra("image", oyunculistesi[position].resim)
            intent.putExtra("macsayisi",oyunculistesi[position].mac)
            intent.putExtra("golsayisi",oyunculistesi[position].gol)

            holder.itemView.context.startActivity(intent)
        }
    }

}