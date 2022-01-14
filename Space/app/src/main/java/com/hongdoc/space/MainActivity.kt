package com.hongdoc.space

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Space
Space는 Layout은 아니지 Layout을 이용해 화면을 구성할 때
보조 수단으로 사용하는 View이다.
화면을 구성할 때 여백이 필요할 경우 사용한다.

Space는 Layout은 아니지만 Layout을 이용해 화면을 구성할 때 보조 수단으로 사용하는 View이다.
화면을 구성할 때 여백이 필요한 경우 사용한다.

Space는 화면 구성 시 여백이 필요할 때 사용하는 View 이다.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}