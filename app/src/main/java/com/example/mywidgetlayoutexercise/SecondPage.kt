package com.example.mywidgetlayoutexercise

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class SecondPage : AppCompatActivity() {
    lateinit var spinner: Spinner
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        spinner = findViewById(R.id.spinner)
        button = findViewById(R.id.second_page_button)

        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        button.setOnClickListener {
            val intent = Intent(this, ThirdPage::class.java)
            startActivity(intent)
            finish()
        }


    }
}