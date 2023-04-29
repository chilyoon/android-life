package com.example.temp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class todoActivity : AppCompatActivity() {
    // 처음 실행되면 시작되는 함수이다.
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.todopage)
    }

}
