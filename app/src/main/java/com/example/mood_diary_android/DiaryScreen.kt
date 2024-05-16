package com.example.mood_diary_android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import com.example.mood_diary_android.databinding.ActivityDiaryScreenBinding

private lateinit var diaryScreenBinding: ActivityDiaryScreenBinding
class DiaryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diaryScreenBinding = ActivityDiaryScreenBinding.inflate(layoutInflater)
        setContentView(diaryScreenBinding.root)

        diaryScreenBinding.saveBtn.setOnClickListener {
            Toast.makeText(this,"Saved Successfully!!!",Toast.LENGTH_SHORT).show()
        }

    }

    var selectedCard: View? = null
    fun moodSelected(view: View) {
        if (selectedCard != null) {
            selectedCard!!.setBackgroundColor(android.graphics.Color.parseColor("#FBA8C5")) // Set default color
        }

        view.setBackgroundColor(android.graphics.Color.parseColor("#7DC0F6")) // Set selected color

        selectedCard = view
    }
}
