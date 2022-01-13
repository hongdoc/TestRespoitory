package com.hongdoc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
View

눈에 보이는 모든 요소를 View라고 부른다
개발자가 배치하는 모든 View 들은 Class로 제공되는데 모두 View라는 클래스를 상속받고 있다.
View 클래스는 모든 UI 요소들의 부모 클래스로써 Widget과 layout으로 나뉜다.

Layout
Container, View Group라고 부르기도 한다.
다른 View들을 포함하고 Container 내부의 View를 통합 관리하고 (View Group)
내부 View들이 배치되는 모양을 결정(Layout) 한다.


Widget
문자열 입력, 문자열 출력 등 어떤 기능을 가지고 있고 사용자와 상호 작용하는 View들을 통칭해서 Widget이라고 부른다.


Parent와 Child
안드로이드는 화면을 구성하기 위해 layout을 먼저 배치하고 그 위에 다른 View 들을 배치하게 된다.
이 떄 layout을 Parent라고 부르고 배치되는 View 들을 Child라고 부른다.

모든 View 들은 단 하나의 Parent를 가질 수 있으며 모든 layout은 다수의 Child를 가질 수 있다.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

