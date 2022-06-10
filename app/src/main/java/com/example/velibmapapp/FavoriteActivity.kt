package com.example.velibmapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class FavoriteActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)


        val go_back = findViewById<ImageView>(R.id.go_back)
        go_back.setOnClickListener {
            finish();
        }

    }
}