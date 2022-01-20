package com.hongdoc.listviewstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Adapter View
개발자는 화면의 다양한 View 들을 배치해 화면을 구성하게 된다.
대부분의 뷰들은 배치를 하면 기본적으로 정해진 속성에 따라 모양이 구성된다.
하지만 일부 View 들은 스스로 결정할 수 없는 부분이 있어 개발자가 반드시 데이터를 설정해야만 구성이 가능하다.
이렇게 개발자가 반드시 설정해야 화면을 구성할 수 있는 View 들을 가르켜 Adapter View 라고 부른다.

Adapter Class
Adapter View 들은 View 구성하기 위해서 개발자가 다양한 데이터를 설정해줘야 된다.
이러한 데이터를 관리하는 Class 를 Adapter Class라고 부른다.
Adapter Class는 사용 목적이나 적용할 View에 따라 다양하게 제공되고 있으며 원한다면 직접 생성해서 사용할 수도 있다.
주로 다양한 항목을 제공하는 View를 구성할 때 사용한다.

ListView
가장 대표적이고 가장 많이 사용하는 Adapter View이다.
지금은 RecyclerView 사용을 추천하고 있지만 AdapterView 개념을 공부하기에 적당하다.
RecyclerView가 내부적으로 관리의 효율성을 가지고 있지만 지금도 ListView를 많이 사용하고 있다.
RecyclerView를 사용할 정도가 아니라면 ListView를 사용해도 된다.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}