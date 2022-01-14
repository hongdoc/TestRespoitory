package com.hongdoc.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
RelativeLayout을 개선한 layout으로 RelativeLayout보 유연하게 화면을 구성할 수 있다.

ConstraintLayout은 RelativeLayout처럼 부모와의 관계나 다른 View와의 관계를 설정하게 된다.

제약조건
실선 제약 조건 : 지정된 기준으로 부터 얼만큼 떨어진 위치에 있는지 좌표를 설정한다.
스프링 제약 조건 : 지정된 기준으로부터 얼만큼 떨어진 위치에 있는지 비율을 설정한다.

학습정리
ConstraintLaout은 부모나 다른 View 와의 관계를 설정하여 위치를 결정하는 layoutdㅣ다.
제약 조건에는 좌표를 설정하는 실선 제약 조건과 비율을 설정하는 스프링 제약 조건이 있다.

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}