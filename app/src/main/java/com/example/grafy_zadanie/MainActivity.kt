package com.example.grafy_zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<SeekBar>(R.id.pasek).min = 1

        findViewById<ImageView>(R.id.iV1).setOnClickListener {

        }

        findViewById<ImageView>(R.id.iV2).setOnClickListener {

        }

        findViewById<ImageView>(R.id.iV3).setOnClickListener {

        }

        findViewById<ImageView>(R.id.iV4).setOnClickListener {

        }

        findViewById<ImageView>(R.id.iV5).setOnClickListener {

        }

        findViewById<Button>(R.id.btn_waga).setOnClickListener {

        }

        findViewById<Button>(R.id.btn_znajdz).setOnClickListener {

        }
    }
}