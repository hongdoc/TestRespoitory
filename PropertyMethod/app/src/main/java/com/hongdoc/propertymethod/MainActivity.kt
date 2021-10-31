package com.hongdoc.propertymethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
클래스의 기본구조
class 클래스명 {
    var 변수
    fun 함수() {
        //코드
    }
}

프라이머리 생성자
class Person constructor(value: String){
    코드
}

세컨드리 생성자
class Person {
    constructor(value: String){
        Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
    }
}
Default 생성자
class Student { // 생성자를 작성하지 않아도 기본 생성자가 동작합니다.
    init {
        // 기본 생성자가 없더라도 초기화가 필요하면 여기에 코드를 작성합니다.
    }
}

아무런 파라미터 없이 클래스명에 괄호를 붙여주면 생성자가 호출되면서 init 블록 안의 코드가 자동으로 실행된다.
세컨드리  생성자의 경우 init 블록이 먼저 실행되고, constructor 블록 안의 코드가 실행된다.
다음의 kotlin클래스의 생성자를 호출한 후 생성되는 것을 인스턴스라고 하는데 인스턴스는 변수에 담아둘 수 있다.
var = kotlin = Kotlin()

프로퍼티와 메서드
클래스 내부에 정의도는 변수와 함수를 멤버 변수, 멤버 함수라고 부른다. 다른 용어로 프로퍼티, 메서드라고 부른다
클래스의 변수 > 멤버 변수 > ----프로퍼티
클래스의 함수 > 멤버 함수 > ----메서드

클래스 안에 정의된 변수는 프로퍼티라고 하지만 함수 안에 정의된 변수는 프로퍼라고 하지 않고 그냥 변수라고 한다.
class 클래스명 {
    var 변수A
    fun 함수() {
        var 변수B
    }
}

class Pig {
    var name: String = "Pinky"
    fun printName(){
        Log.d("class", "Pig의 이름은 ${name}입니다.")
    }
}
위에서 정한 클래스를 생성자로 인스턴스화 해서 변수에 담는다.
var pig = Pig()

인스턴스가 담긴 변수명 다음에 도트 연산자(.)를 붙여서 프로퍼티와 메서드를 사용한다.
pig.name = "Pooh"
pig.printName()
결과 : pig의 이름은 Pooh입니다.
 */