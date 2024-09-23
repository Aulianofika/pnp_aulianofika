package com.example.tugas_aulianofika_pnp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_aulianofika_pnp.GaleriActivity
import com.example.tugas_aulianofika_pnp.R
import com.example.tugas_aulianofika_pnp.model.ModelGaleri

class GaleriAdapter constructor(
    private val getActivity: GaleriActivity,
    private val galeriList: List<ModelGaleri>
) : RecyclerView.Adapter<GaleriAdapter.MyViewHolder>() {

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val txtgaleri: TextView = itemView.findViewById(R.id.txtgaleri)
        val imggaleri: ImageView = itemView.findViewById(R.id.imggaleri)
        val cardgaleri: CardView = itemView.findViewById(R.id.cardgaleri)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GaleriAdapter.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_galeri, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: GaleriAdapter.MyViewHolder, position: Int) {
        holder.txtgaleri.text = galeriList[position].title
        holder.imggaleri.setImageResource(galeriList[position].image)

        //untuk bisa diklik
        holder.cardgaleri.setOnClickListener(){
            Toast.makeText(getActivity, galeriList[position].title,
                Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return galeriList.size
    }
}