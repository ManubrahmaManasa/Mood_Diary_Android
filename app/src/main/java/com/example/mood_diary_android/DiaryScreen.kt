package com.example.mood_diary_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.mood_diary_android.databinding.ActivityDiaryScreenBinding

private lateinit var diaryScreenBinding: ActivityDiaryScreenBinding
class DiaryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diaryScreenBinding = ActivityDiaryScreenBinding.inflate(layoutInflater)
        setContentView(diaryScreenBinding.root)

        /*val selectedDate:String = intent.getStringExtra("Selected Date:",).toString()
        diaryScreenBinding.text.text = selectedDate*/

        /*val myadapter = Myadapter(this)
        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = myadapter*/
    }
}
