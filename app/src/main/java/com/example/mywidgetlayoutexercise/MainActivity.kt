package com.example.mywidgetlayoutexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    lateinit var progress_bar: ProgressBar
    lateinit var seek_bar: SeekBar
    lateinit var textview:TextView

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        progress_bar = findViewById(R.id.progress_bar)
        seek_bar = findViewById(R.id.seek_bar)
        textview = findViewById(R.id.textview)
        imageView.setImageResource(R.drawable.image)


        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textview.text ="%$progress"
                progress_bar.setProgress(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }


    }
