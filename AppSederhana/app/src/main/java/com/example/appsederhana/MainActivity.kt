package com.example.appsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class MainActivity : AppCompatActivity(){

    private lateinit var rv: RecyclerView
    private var list: ArrayList<Barang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Menu Utama")

        rv = findViewById(R.id.utama)
        rv.setHasFixedSize(true)

        list.addAll(DaataBarang.listData)
        tampilanAwal()

    }

    private fun tampilanAwal() {
        rv.layoutManager = GridLayoutManager(this,2)
        val utama = AdapterUtama(list)
        rv.adapter = utama

        utama.setOnItemClickListener(object : AdapterUtama.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, LihatFull:: class.java)
                intent.putExtra("judul",list[position].nama)
                intent.putExtra("harga",list[position].harga)
                intent.putExtra("img",list[position].poto)
                intent.putExtra("desk",list[position].desk)
                startActivity(intent)
            }

        })
    }

    private fun tampilantentang(){
        val intent = Intent(this@MainActivity, Tentang:: class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(pilih: Int) {
        when (pilih) {
            R.id.home -> {
                tampilanAwal()
            }
            R.id.about -> {
                tampilantentang()
            }

        }

    }

}


