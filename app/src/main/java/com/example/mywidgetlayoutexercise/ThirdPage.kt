package com.example.mywidgetlayoutexercise

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ThirdPage : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        listView = findViewById(R.id.listview)
        button = findViewById(R.id.third_page_button)

        val names = arrayOf(
            "Test1",
            "Test2",
            "Test3",
            "Test4",
            "Test5",
            "Test6",
            "Test7",
            "Test8",
            "Test9",
            "Test10",
            "Test11",
            "Test12",
            "Test13",
            "Test14",
            "Test15",
            "Test16",
            "Test17",
            "Test18",
            "Test19",
            "Test20"
        )
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "Item Selected " + names[i],
                Toast.LENGTH_LONG
            ).show()
        }

        button.setOnClickListener {
            val intent = Intent(this, FourthPage::class.java)
            startActivity(intent)
            finish()
        }

    }
}