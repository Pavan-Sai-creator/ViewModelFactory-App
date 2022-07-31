package com.example.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.number_tv)
        viewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        setText()
    }

    private fun setText() {
        textView.text = viewModel.count.toString()
    }

    fun increment(view: android.view.View) {
        viewModel.incrementCount()
        setText()
    }
}