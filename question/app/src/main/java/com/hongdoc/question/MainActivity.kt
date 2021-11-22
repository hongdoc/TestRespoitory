package com.hongdoc.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value : String? = "a"
        val value2 : String? = null

        //아래 코드 추가시 NullPointerException 오류 뜸 값이 비어있다고 함
        //Log.d("MainActivity", value2!!)
    }
}

/*
물음표 ?
느낌표 !

? -> null일 수 있음
! -> null이 아님

 */