package com.hongdoc.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
ViewBinding

레이아웃 XML파일에 정의돈 View에 접근하는 방법은 findViewByld()메서드를 활용하는 것이다.
이후 코틀린이 도입되면서 '코틀린 익스텐션'을 통해 수비게 뷰를 다룰수 있다.
그러나 이제는 "뷰 바인딩이" 코틀린 익스텐션을 대체한다.

ViewBinding은 코틀린 환경의 안드로이드에서 뷰에 접근하는 새로운 방식이다.

 ViewBinding을 사용하기 위해서는 bulid.gradle(Module:app)서 2줄만 추가하면 된다.에

 buildFeatures {
    viewBinding = true
}
 또한 MainActivity.kt에서

 var binding = ActivityMainBinding.inflate(layoutInflater)
 setContentView(binding.root)

 binding.(id)를 입력하면 된다.

 FindViewByld는 변수 선언 후 xml의 뷰와 변수를 하나하나 연결시켜줘야 하지만
 ViewBinding은 ViewBinding 선언 후 바인딩 객체선정 및 뷰 선정을 하면 끝이다.

 ViewBinding방식은 null에 대한 안정성이 있다. ViewBinding은 xml의 모든 view들을 직접 참조하기 떄문에 잘못된
 id참조로 인한 예외 발생을 예방할 수 있으며 View Container와 같은 경우 @Nullable표시를 통해 처리한다.
 또한 type의 안정성이 있다. xml의 View들의 타입 또한 매칭시켜주기 때문에 casting으로 인한 예외 발생도 예방할 수 있다.

 */