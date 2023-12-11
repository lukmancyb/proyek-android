package com.stmiklombok.helloworld.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.stmiklombok.helloworld.R
import com.stmiklombok.helloworld.data.Book

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // fungsi untuk menerima data intent yang dikirim
        val dataIntent =  
        //inisiasi view
        val image = findViewById<ImageView>(R.id.detailImage)
        val title = findViewById<TextView>(R.id.textJudul)
        val desc = findViewById<TextView>(R.id.textDesc)

        //tampilkan gambar menggunakan glid
        Glide.with(this)
            .load(dataIntent?.photo)
            .into(image)
        // tampilkan text untuk judul
        title.text = dataIntent?.name
        //tampilkan text untuk deskripsinya
        desc.text = dataIntent?.description




    }
}