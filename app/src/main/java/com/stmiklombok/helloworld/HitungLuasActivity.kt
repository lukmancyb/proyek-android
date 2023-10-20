package com.stmiklombok.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class HitungLuasActivity : AppCompatActivity() {

    private lateinit var lebarEditText : TextInputEditText
    private lateinit var panjangEditText : TextInputEditText
    private lateinit var hitungButton : Button
    private lateinit var hasilTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_luas)

        initKomponent()
        hitungButton.setOnClickListener {
            val lebar = lebarEditText.text.toString()
            val panjang = panjangEditText.text.toString()
                val hasil = panjang.toInt() * lebar.toInt()
                hasilTextView.text = hasil.toString() + " m2"
        }
    }
    private fun initKomponent() {
        lebarEditText = findViewById(R.id.lebarEditText)
        panjangEditText = findViewById(R.id.panjangEditText)
        hitungButton = findViewById(R.id.hitungButton)
        hasilTextView = findViewById(R.id.hasilTextView)
    }
}