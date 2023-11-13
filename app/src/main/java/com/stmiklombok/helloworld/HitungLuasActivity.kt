package com.stmiklombok.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.stmiklombok.helloworld.databinding.ActivityHitungLuasBinding

class HitungLuasActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHitungLuasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungLuasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pindahHalaman.setOnClickListener {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
        }

        binding.hitungButton.setOnClickListener {
            val lebar = binding.lebarEditText.text.toString() // 2
            val panjang = binding.panjangEditText.text.toString() //10
            val hasil = panjang.toInt() * lebar.toInt()
             binding.hasilTextView.text = hasil.toString() + " m2"
//            if (panjang.isEmpty() && lebar.isEmpty()) {
//                hasilTextView.text = "inputan tidak boleh kosong"
//            } else {
//                val hasil = panjang.toInt() * lebar.toInt()
//                hasilTextView.text = hasil.toString() + " m2"
//            }
        }
    }
}

