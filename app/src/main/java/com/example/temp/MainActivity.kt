package com.example.temp

import android.annotation.SuppressLint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import org.w3c.dom.Text

private const val NUM_PAGES = 2

class MainActivity : AppCompatActivity() {
    // 처음 실행되면 시작되는 함수이다.
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lifepage)

        // 1) ViewPager2 참조
        //val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        // 2) FragmentStateAdapter 생성 : Fragment 여러개를 ViewPager2에 연결해주는 역할
        //val viewpagerFragmentAdapter = ViewpagerFragmentAdapter(this)

        // 3) ViewPager2의 adapter에 설정
        //viewPager.adapter = viewpagerFragmentAdapter

        val userName = intent.getStringExtra("name")
        val year = intent.getIntExtra("year", 0)
        val month = intent.getIntExtra("month", 0)
        val dayOfMonth = intent.getIntExtra("dayOfMonth", 0)
        val yourName = findViewById<TextView>(R.id.yourName)
        val yourDate = findViewById<TextView>(R.id.yourDate)
        yourName.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC) // 글꼴 지정
        yourDate.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC) // 글꼴 지정
        yourName.setText(userName)
        yourDate.setText("${year}년 ${month+1}월 ${dayOfMonth}일")

        //val lifefragment = LifeFragment()
        //val bundle = Bundle()
        //bundle.putString("name", userName)
        //lifefragment.arguments = bundle


    }
}
