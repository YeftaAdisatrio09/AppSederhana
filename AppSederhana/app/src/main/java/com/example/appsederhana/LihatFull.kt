package com.example.appsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class LihatFull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_full)

        val back = supportActionBar
        back!!.title = "Detail"
        back.setDisplayHomeAsUpEnabled(true)

        val nama : TextView = findViewById(R.id.tv_nama)
        val harga : TextView = findViewById(R.id.tv_harga)
        val img : ImageView = findViewById(R.id.img_detail)
        val deskripsi: TextView = findViewById(R.id.tv_desk)

        val bundle:Bundle? = intent.extras
        val judul = bundle!!.getString("judul")
        val price = bundle.getString("harga")
        val image = bundle.getInt("img")
        val desk = bundle.getString("desk")

        nama.text = judul
        harga.text = price
        img.setImageResource(image)
        deskripsi.text = desk
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.share, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.share){
            var share = Intent().apply {
                this.action = Intent.ACTION_SEND
                this.putExtra(Intent.EXTRA_TEXT, "Data berhasil dikirim")
                this.type = "text/plain"
            }
            startActivity(share)
        }else{
            return super.onOptionsItemSelected(item)
        }
        return true
    }
}