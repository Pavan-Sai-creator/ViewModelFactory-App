package com.example.viewmodelfactory

// https://www.youtube.com/watch?v=MCqmeNBKV9k&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=4

import androidx.lifecycle.ViewModel

class MainViewModel(val initialCount: Int): ViewModel() {
    var count: Int = initialCount

    fun incrementCount(){
        count++
    }
}