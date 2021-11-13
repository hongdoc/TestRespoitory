package com.hongdoc.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
람다 함수 (lambda)

1. 기본표현
var 변수명 : (매개변수의 타입) -> 리턴 값 = { 매개변수 : 타입 -> 함수 식}

ex)

var A : (String, Int) -> Unit = { str : String, number : Int -> println("$str 은 $number" A(hong, 26)

>>>> hong은 26

일반적인 변수 선언처럼, 람다식도 데이터 타입을 명시할 수 있다.
하지만, 람다식의 경우 파라미터와 리턴 값을 갖는 함수이기 때문에 데이터 타입을 표현하기 까다로운데, 이를 (파라미터 -> 리턴)
으로 표현할 수 있게 해놓았다.

2-1 매개변수가 한 개 일때
매개변수가 한 개 라면 lambda식의 매개 변수 부분의 데이터타입을 생략할 수 있기도 하다.

var A : (String) -> Unit = {str -> println("$str 입니다.")}
A("hong")
>>>>>hong 입니다.

매개변수가 1이기 떄문에 str의 데이터 타입은 자동으로 String이 된다.

2-2
변수 A의 데이터 타입을 명시하지 않아도 람다 표현을 할 수 있따.

var A = {str : String -> "$str 입니다."}

람다 구현 부에서 명시적으로 파라미터의 개수와 데이터 타입이 표현 돼 있기 때문에 오류가 발생하지 않는다.

3. 여러 줄의 람다 함수

다른 함수처럼 람다식도 복잡해 질 수 있다. 가독성이 떨어지기 때문에 웬만하면 따로 선언하는 것이 좋겠지만 이럴 경우에는 마지막 값이 리턴된다.

var A: (Int,Int) -> Int = {b: Int, c: Int ->
    println("b의 값은 ${b}입니다")
    println("c의 값은 ${c}입니다")
    b+c
}

A(1,3)
>>>
b의 값은 1입니다
c의 값은 3입니다

println(A(1,3))
b의 값은 1입니다
c의 값은 3입니다
4

고차 함수

코틀린에서는 함수의 매개 변수로 함수를 받아 올 수 있다. 여기서 혼동하지 말아야 하는것이, 함수의 인스턴스를 매개변수로 가져오는 것이 아니라, 함수 그 자체를 가져 온다는 것

fun main(){
    a(::b) // 함수를 파라미터로 갖는 함수 a가 b를 가져옴.
}
fun a(function: (String)->Unit){
    function("this is String parameter")// 받아온 함수 타입 파라미터에 "~~" 라는 String타입의
                                        //파라미터를 넣어줌
}

fun b(str: String){
    println("<${str}>is token")
}
 의미 있는 고차 함수 활용이 아니기 때문에 조금 헷갈릴 여지가 있다. 여기서는 그냥 기본적인 사용법을 이해하기 위해 간단히 표현함

사용 시에는 함수형 매개 변수 앞에 ::을 붙여 줌으로써 고차함수가 발생함을 명시하는 것이 중요하다.
 */