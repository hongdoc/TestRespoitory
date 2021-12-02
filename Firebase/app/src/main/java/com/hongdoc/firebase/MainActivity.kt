package com.hongdoc.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}

/*
Firebase 알아보기

Firebase는 모바일 앱 및 웹 어플리케이션 개발에 필요한 데이터베이스, 사용자 인증, 호스팅, 스토리지, 크래시리포팅(문제보고).
퍼포먼스, 광고 등을 API의 형태로 제공하는 백엔드 서비스이다. Firebase는 유로 서비스지만 1GB의 스토리지와 월 10GB의
트래픽은 무료로 제공되고 있다. NAS의 목적으로 사용하지 않는다면 사실상 무료로 이용이 가능하다.

장점으로는 Firebase는 구글에서 전적으로 지원하고 있으며 안드로이드 프론트엔드 개발자들이 담당하여 하는것도 좋지만
전적으로 데이터베이스 구조를 가지기 때문에 서버로 편입을 하는것이 맞다.

Firebase는 NoSQL을 지원하고 있으며 자바 언어를 예시로 들어보자면 Key-Value 스타일의 Map형식의 구조를 가지고 있다.
클라이언트에서 지원하는 방식은 JSON이다.



 */