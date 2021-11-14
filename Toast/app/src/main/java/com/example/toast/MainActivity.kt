

package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


/*
기본 Toast 메시지 만들기

토스트 메시지는 사용자에게 간단하게 메시지를 보여주기 위한 기능이다.
화면 아래에 알람이 팝업되고 일정 시간이 지나면 자동으로 사라지는 팝업 메시지다.

기본 Toast 메시지 사용하기
기본 Toast 메시지 사용법은 아주 간단하다.

public static Toast makeText(Context context, CharSequence text, @Duration int duration)
- context : 사용할 Context (Application or Activity)
- text : 표시 할 텍스트
- duration : 메시지를 표시하는 시간
    - LENGTH_SHORT : 약 2초
    - LENGTH_LONG : 약 4초

메인 레이아웃 생성
레이아웃을 생성해서 버튼뷰를 배치한다.
activity_main.xml

<Button
        android:id="@+id/btnClick"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="onClick"
        android:text="Toast popoup"
        tools:ignore="MissingConstraints" />

메인 액티비티 생성
버튼 클릭 이벤트를 만들고 기본으로 만들어진 Toast를 팝업 시킨다.
MainActivity.kt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        Toast.makeText(this, "Hello kotlin", Toast.LENGTH_SHORT).show()
    }
}

기본 Toast 메세지 사용법은 아주 간단하게 구현할 수 있다. Toast 메시지를 만들고 show()룰 호출만 해주면 된다.
에뮬레이터를 시작하여 확인 해보면 버튼을 클릭하면 아래 화면 하단에 메시지가 팝업되었다.
duration 설정값에 따라 일정 시간 이후에 사라지는걸 확인할 수 있다.




 */