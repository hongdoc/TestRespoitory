package com.hongdoc.questionmark_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //문자열에 Null 입력.
        val value : String? = null
        val value2 : String? = "A"

        // !은 Null이 아님.
        // ?은 Null일 수 있음.

        /*
        안전 호출 연산자 ?.
        함수 호출에 사용되는 변수나 다른 함수의 반환값이 null이 아닐 때만 해당 함수가 호출되므로
        nullPointException을 방지할 수 있다.

        non-null 단언 연산자 !!
        null 기능 타입에 대해 함수를 호출하기 위해 사용될 수 있다. 이 연산자는 null이 될 수 없다는 것을
        단언하는 연산자 이다.

        */


    }

}