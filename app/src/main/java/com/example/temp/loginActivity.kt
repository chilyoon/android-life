package com.example.temp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class loginActivity : AppCompatActivity() {
// 처음 실행되면 시작되는 함수이다.
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)

        val nameText = findViewById<EditText>(R.id.nameText)
        val joinBut = findViewById<Button>(R.id.joinBut)
        val dateText = findViewById<DatePicker>(R.id.datepicker)
        val year = dateText.year.toInt()
        val month = dateText.month.toInt()
        val dayOfMonth = dateText.dayOfMonth.toInt()
        joinBut.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", nameText.text.toString())
            intent.putExtra("year", dateText.year.toInt())
            intent.putExtra("month", dateText.month.toInt())
            intent.putExtra("dayOfMonth", dateText.dayOfMonth.toInt())
            startActivity(intent)
        }
    }
}
