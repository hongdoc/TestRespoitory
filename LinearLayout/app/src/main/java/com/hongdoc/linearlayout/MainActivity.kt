package com.hongdoc.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
orientation : 배치되는 모양을 결정한다.
weight : LinearLayout 안에 배치되는 View들의 비율을 설정한다.

LinearLayout은 좌에서 우, 위에서 아래 방향으로 View들을 배치할 수 있는 Layout 이다.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
