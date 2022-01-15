package com.hongdoc.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
Widget
안드로이드의 View 중 기능을 갖고 사용자와 상호작용을 하는 것들을 Widget이라고 부른다.
Widget은 Layout 위에 배치되어 화면에 나타나고 코드를 통해 Widget 통제하여 사용자와 소통을 하는 수단이 된다.

Widget 사용 패턴
먼저 Layout에 사용하지고 하는 Widget을 배치한다.
이 때, Activity가 실행되면 화면이 구성되고 화면에 배치된 모든 View 들은 객체로 생성된다.
객체로 생성된 View 중에 필요한 Widget들의 주소 값을 얻어와 코드로 이들을 통제하게 된다.
필요하다면 이벤트에 대한 코드를 구성하여 사용한다.

정리
어떠한 기능을 갖고 사용자와 상호작용 하는 View들을 Widget이라고 부른다.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}