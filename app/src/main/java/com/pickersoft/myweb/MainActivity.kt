package com.pickersoft.myweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1st, Insert webview item in acitivity.
        val myWeb = findViewById<WebView>(R.id.MyWebView)

        // Block to run chrome unexpectedly
        myWeb.webViewClient = WebViewClient()

        // 3rd, Run webview loading code.
        myWeb.apply {
            loadUrl("http://www.google.com")
            settings.javaScriptEnabled = true
        }
    }
}