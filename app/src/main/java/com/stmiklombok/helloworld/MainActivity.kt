package com.stmiklombok.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBooks: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)

        rvBooks.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListBookAdapter(listBook)
        rvBooks.adapter = listHeroAdapter
    }

    private val listBook: ArrayList<Book>
        get() {
            val dataName = resources.getStringArray(R.array.data_name)
            val dataDescription = resources.getStringArray(R.array.data_description)
            val dataPhoto = resources.getStringArray(R.array.data_photo)
            val listBook = ArrayList<Book>()
            for (i in dataName.indices) {
                val book = Book(dataName[i], dataDescription[i], dataPhoto[i])
                listBook.add(book)
            }
            return listBook
        }
}