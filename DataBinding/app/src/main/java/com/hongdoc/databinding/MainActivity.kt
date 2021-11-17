package com.hongdoc.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
데이터 바인딩이란
우리는 안드로이드 어플의 한 화면일 만들 떄, 뷰를 생성하고 그 뷰에 적잘한 값들을 넣어준다.
평소처럼 개발을 한다고 생각하면 이런 식으로 액티비에 뷰를 바인딩 시켜주는 작업을 한다.

val button : Button = findViewById(R.id.btnSample)

한 두 개라면 괜찮지만 한 화면의 뷰가 10개 이상 넘어간다고 했을 경우 굉장히 막막하다.
코틀린은 extenstion을 이용해 편하게 작업이 가능하긴 하나, 이 또한 모든 바인딩을 액티비티에서 해주므로 내가 현재 공부하려는
MMVM패턴에서는 적절치 못하다.
그래서 데이터 바인딩을 사용해 준느 것이고, 데이터 바인딩을 간단하게 얘기하면 다음과 같다.

1. finViewById()를 사용하지 않아도 된다. 자동으로  xml에서 만든 View들을 만들어준다.
2. RecyclerView 사용 시 각각 item들을 set 해주지 않아도 알아서 xml에서 처리할 수 있다.
3. Observable을 이용해 실시간으로 데이터를 바꿔줄 수 있다.

기본 세팅
데이터바인딩을 사용하기 위해서는 먼저 gradle 세팅을 해줘야 한다. build.gradle(Module:app)으로 들어가 다음과 같이 작성한다.

android {
...
dataBinding {
    enabled = true
    }
...
}

JAVA로 할 경우 다음과 같이 넣어주기만 해도 잘 작동하지만 Kotlin은 추가적인 세팅이 필요하다.

apply plugin: 'kotlin-kapt'
...
dependencies {
    ...
    kapt 'com.android.databinding:compiler:3.5.3'
    ...
}

참고 - https://kangmin1012.tistory.com/16


 */