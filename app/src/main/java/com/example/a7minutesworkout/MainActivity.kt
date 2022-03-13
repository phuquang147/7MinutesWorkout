package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flButtonStart : FrameLayout = findViewById(R.id.flStart)
        flButtonStart.setOnClickListener() {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        }
    }
}