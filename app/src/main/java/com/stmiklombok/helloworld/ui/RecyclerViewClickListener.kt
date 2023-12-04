package com.stmiklombok.helloworld.ui

import android.view.View
import com.stmiklombok.helloworld.data.Book

interface RecyclerViewClickListener {

    fun onItemClicked(view : View, book : Book)
}