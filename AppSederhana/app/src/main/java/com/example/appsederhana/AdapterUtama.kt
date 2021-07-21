package com.example.appsederhana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions

class AdapterUtama (private val listBarang: ArrayList<Barang>): RecyclerView.Adapter<AdapterUtama.ListViewHolder>() {

    private lateinit var myListener : onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        myListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.tampilan_awal, parent, false)
        return ListViewHolder(view, myListener)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val barang = listBarang[position]

        Glide.with(holder.itemView.context)
            .load(barang.poto)
            .apply(RequestOptions().override(200, 200))
            .into(holder.img)

        holder.tvnama.text = barang.nama
        holder.tvharga.text = barang.harga

    }

    override fun getItemCount(): Int {
        return listBarang.size
    }


    class ListViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var tvnama : TextView = itemView.findViewById(R.id.tvNama)
        var tvharga :TextView = itemView.findViewById(R.id.tvHarga)
        var img : ImageView = itemView.findViewById(R.id.imgBarang)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

    }

}


