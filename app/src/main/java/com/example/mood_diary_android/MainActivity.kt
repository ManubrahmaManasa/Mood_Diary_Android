package com.example.mood_diary_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mood_diary_android.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val updateDiarybtn = findViewById<Button>(R.id.updatediary)

        updateDiarybtn.setOnClickListener {
            val intent = Intent(this@MainActivity,DiaryScreen::class.java)
            startActivity(intent)
        }

    }
}