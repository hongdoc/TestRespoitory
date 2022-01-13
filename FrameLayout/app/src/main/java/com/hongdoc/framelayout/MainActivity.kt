package com.hongdoc.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
FrameLayout
내부에 배치된 View 들이 같은 자리에 계속 배치되는 layout이다.
화면을 구성하기 보단 탭 등과 같은 기능을 만들 때 사용하는 경우가 많다.

- 주요 속성은없다.
- FrameLayout에 배치되는 view는 모두 좌측 상단에 배치된다.
- margin 속성이나 layout_gravity 속성을 이용해 배치되는 위치를 결정하여 사용한다.
- 중첩해서 View를 배치할 수 있는 Layout이다.
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}