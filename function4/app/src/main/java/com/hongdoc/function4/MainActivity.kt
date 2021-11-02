package com.hongdoc.function4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*

추상 클래스 : 선 선언 후 구현하는 클래스
인터 페이스 : 다중 상속이 가능한 추상 클래스
익명 클래스 : 생성과 동시에 사용가능한 클래스 = 객체

--------------------------------------------------

추상 클래스

추상 : 여러가지 개념이나 사물들의 공통적인 특성이나 속성 따위를 추출하여 파악하는 작용.
그러니까 여러 기능을 가지고 있는 수 많은 클래스들의 공통적인 특성이나 속성(프로퍼티 메소드)를
추출해서 하나의 클래스로 만드는 것이다.
추상 클래스는 클래스를 만드는 설계도, 명세서 정도라고 생각하면 된다.

1. 추상 클래스에서는 프로퍼티 및 메소드의 기본동작 패턴(템플릿 메소드)정도만 명세한다.
2. 추상 클래스는 클래스를 위한 클래스이기 떄문에 객체를 생성할 수 없다.
3. open 키워드를 사용하지 않아도 클래스를 상속 받을 수 있다.
4. 추상 클래스에 ㅁbstract가 붙은 모든 프로퍼티 및 메소드는 꼭 overriding 해야한다.

기본적인 사용코드
abstract class Vehicle(var name: String, var color: String){
    abstract var max_speed: Int   // 추상 프로퍼티
    var used_year: Int = 8 // 비추상 프로퍼티

    abstract fun start() // 추상 메소드
    fun display_spec(){  // 비추상 메소드
    }
}

* 추상 클래스의 추상 프로퍼티들은 값의 변경이 가능한 var을 사용한다.

--------------------------------------------------

익명 클래스

일종의 람다식이라고 보면된다. 하위 클래스를 생성하지 않고 단일 인스턴스로 객체 생성이 가능하다.
한마디로, 클래스 생성과 동시에 인스턴스화 하는것. 일단은 클래스이기 떄문에 클래스를 상속 받을 수 있다.
기존의 상위 클래스 -> 하위 클래스 상속 -> 인스턴스화의 단계를 상위 클래스 -> 익명 객체 생성으로 간단하게 축약한 것이다.

사용 예1)

abstract class Printer{
    abstract fun print()
}

val myprint = object : Printer(){
   override fun print(){
    println("익명객체 사용")
    }
}
 예2)

object YourPrinter : Printer{
    override fun print(){
    println("익명객체 사용2")
    }
}

YourPrinter.print()
>>>> 익명객체 사용2

왜 추상 클래스인가?

추상 클래스의 추상 메소드, 프로퍼티는 하위 클래스에서 재 구현해줘야한다. 어차피 다시 구현해야하는데 굳이 추상 클래스를 왜 만들까?

"캐스팅하기 위해서이다."

캐스팅이란, 호환되는 수퍼클래스나 인터페이스로  (객체)형을 변환 시켜주는 작업을 의미한다.
추상 클래스를 꼭 이용하지 않아도 코틀린에서는 업캐스팅을 지원한다. 하지만 업캐스팅시, 하위 클래스에서만 구현했던 메소드와 오버라이딩한 메소드는 사라진다.
하지만, 추상 클래스를 이용한다면 캐스팅시에 추상 메소드에 대한 구현, 오버라이딩한 메소드의 데이터는 남게 된다!! 굉장히 편리한 기능이다.

--------------------------------------------------
인터페이스

1. 다른 언어에서는 기본적으로 인터페이스에 비 추상 프로퍼티나 메소드가 존재하지 않는다. 하지만 코틀린은 인터페이스에서도
기본적인 구현을 제공한다. 비 추상 프로퍼티나 메소드를 사용할 수 있다. 하지만 프로퍼티의 경우에는 값을 가질 수 없다.
구현부를 가진 메서드 -> 일반 메소드
구현부가 없는 메서드 -> 추상 메소드
값이 없는 프로퍼티 -> 추상 프로퍼티
값이 있는 프로퍼티 -> X
이렇게 구분한다.
2. 인터페이슨느 추상 클래스와 달리 abstract 키워드가 필요없다. 허나 인터페이스를 구현한 클래스에서는 override 키워드를 사용해 줘야 한다.
3. 다중 상속이 가능하다. 코틀린 에서는 기본적으로 다중 상속이 불가능하다. 하지만 인터페이스는 클래스가 아니다.

interface pet{
    var category:String // 추상 프로퍼티 생성
    fun eat()
    fun bark(){
    println("멍멍")
    }
}

 */