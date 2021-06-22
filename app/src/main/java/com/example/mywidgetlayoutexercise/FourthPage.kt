package com.example.mywidgetlayoutexercise

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class FourthPage : AppCompatActivity() {
    lateinit var button: Button
    lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        button = findViewById(R.id.fourth_page_button)
        web = findViewById(R.id.webview)

        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true
        web.loadUrl("https://www.google.com")
/*
        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                val url = request?.url.toString()
                view?.loadUrl(url)
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
*/
        button.setOnClickListener {
            val intent = Intent(this, ThirdPage::class.java)
            startActivity(intent)
            finish()
        }

    }

    }
