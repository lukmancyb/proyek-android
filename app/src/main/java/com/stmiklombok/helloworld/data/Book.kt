package com.stmiklombok.helloworld.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(val name : String,
                val description : String,
                val photo : String) : Parcelable
