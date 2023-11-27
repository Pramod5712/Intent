package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


          var btnIntent= findViewById<Button>(R.id.button1)

        btnIntent.setOnClickListener {
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}