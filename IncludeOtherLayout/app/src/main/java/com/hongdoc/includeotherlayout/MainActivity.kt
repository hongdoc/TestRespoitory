package com.hongdoc.includeotherlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Include Other Layout
Layout에서 다른 Layout을 포함시킬 수 있는 개념이다.
다수의 화면을 구성할 때 중복되는 부분이 있을 경우 사용한다.

layout : 삽입할 화면의 데이터를 정의한 layout 파일

Include Other Layout을 사용하면 다른 layout 파일로부터 생성된 화면을 삽입할 수 있다.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}