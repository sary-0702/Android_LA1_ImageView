package com.name.la1_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.penguin)
        */

        val url = "https://life-is-tech.com/materials/images/logo-square.png"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)
    }
}