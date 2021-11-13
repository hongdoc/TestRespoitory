package com.hongdoc.npe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
코틀린은 NPE와 같은 여러가지 문제를 가진 자바로부터 이를 해결하기 위해 파생된 언어이다.
따라서 태생부터 NPE에 대한 대비를 해둔 언어라고 할 수 있다.

NPE란

코틀린은 함수형 언어를 지향하는 객체지향 언어이다. 함수형 프로그래밍을 지원하지만 기본적으로는 객체지향 언어라는 뜻이다.
객체지향 언어답게 대부분의 변수 함수 클래스 인스턴스 등을 전부 객체로 본다. 객체에 접근하기 위해서는 일반적으로 레퍼런스 변수를 이용한다.
레퍼런스(참조) 변수를 이용하여 객체를 참조하는 것이다.

------------------------------------------------

null은 자바와 코틀린에서 public, static, final과 같은 일종의 키워드라고 불 수 있다.
일반적으러 예를들면 boolean을 선얺하면 기본 값이 false가 되듯이 어떤 레퍼런스 변수를 선언하면 디폴트로 null을 갖는다.
굉장히 특수한 변수이자 키워드라고 할 수 있다. null은 아직 레퍼런스 변수가 어떤 객체를 참조하지 않고있다는 상태를 뜻하는것으로 생각하면 된다.

NPE는 참조된 레퍼런스 변수가 null일 때 발생한다. 일반적으로 레퍼런스 변수는 스택 영역에 객체가 저장된 메모리의 주소를 가지고 있다.
레퍼런스 변수에 접근해 메모리 주소를 흭득하고 메모리 주소에 접근했더니 NULL이 뜨는 경우가 있다. 즉 아무것도 없는것이다.
NPE의 무서운점은 객체가 NULL이라는데 그치는게 아니라, Null값을 가진 레퍼런스 변수를 사용한 함수, 클래스, 인스턴스 등에서 오류가 발생한다.

 플랫폼 타입, 컴파일러가 null 가능 여부를 판단할 수 없는 타입.
코틀린은 JVM을 기반으로 작동하는 java와 100% 호환가능한 언어이다. 코틀린만 보면 null처리가 굉장히 유연하며 효율적인 언어라는 것을 알 수 있지만,
java는 그렇지 않다. java로 프로그래밍된 클래스에 속성이나 메서드를 코틀린에서 사용할 때 이 값이 null이 가능한 or 불가능한 값인지 알 수 없다.
따라서 코틀린에서는 자바 기반으로 프로그래밍된 클래스의 속성이나 메서드를 다시한번 확인해야 한다.

------------------------------------------------

코틀린의 NULL처리 매커니즘

1. Null가능 변수 타입: String?
코틀린에서는 기본적으로 모든 타입에 null 값을 허용하지 않는다. 하지만 코딩하다 보면 null값을 허용해야하는 경우가 발생하는데,
이를 위해 허용된 키워드를 만들어 놓았다. ?을 붙이는 것이다.

var s1: String? = null
>>>> ok

var s2: String = null
>>> error

2. 안전 호출 연산자(Safe Call):.?
접근자를 이욯라 때에도 NPE가 발생할 수 있다.

if(some_instance.property1 == 1){
 ....
}
 이런식의 코드는 NPE가 발생할 우려가 있다. some_instance는 어떤 클래스의 인스턴스겠지만 동시에 레퍼런스 변수이다. 따라서 null일 확률이 존재한다.

if(some_instance?.property1 == 1){
 ....
}
 접근자에 ?를 추가해주는 것만으로도 NPE가 발생하지 않는다 만약 some_instance가 null이라면, null값을 반환한다.(NPE가 발생하지 않는다.)

 3. 엘비스 연산자 (Elvis): ?:

엘비스 연산자는 null처리를 조금더 능동적으로 가능하게 한다. 참조한 객체가 null일경우 어떤 임의의 값을 정해서 결과값으로 반환할 수 있다.
?: 연산자는 연산자의 왼쪽 피연산자 값이 null이 아니면 그 피연산자의 결과 값을 반환하고, null이면 오른쪽 피연산자의 결과값으로 반환한다.
여기서 피연산자는 변수, 표현식, 함수 호출 등 모두 가능하며 피 연산자가 함수 호출일 때는 해당 함수가 실행되어 그 결과 값이 반환된다.

if(some_instance?.property1 ?: 1){
 ....
}

 some_instance가 null 이라면 첫번째 안전 호출자에 의해서 null이 반환되고 다음으로, 엘비스 연산자에 의해 null이 1로 반환되는 과정을 거친다.

4. as, as? 연산자
as 연산자를 이해하기 위해서는 먼저 다운 캐스팅과 업 캐스팅에 대한 이해가 필요하므로 위의 포스팅을 참고하기 바란다.
as 연산자는 객체의 타입 변환시에 사용한다. 명시적으로 타입을 변환할 수 있는 연산자이다. 단 Int와 같은 기본 타입 간에는 as 함수를 사용할 수 없고 변환 함수를 사용하는게 일반적이다.

val s1: String = s2 as String
// s2가 string으로 캐스팅 가능하다면, String으로 변환되어 s1에 저장된다.
// 그러나 캐스팅이 불가능하면 ClassCastException 예외가 발생하고 실행이 중단된다.
이때
val s1: String? = s2 as? String

이런식의 as? 연산자 사용이 가능하다. 만약 s2가 String으로 명시적 타입 변환이 불가능하다면 예외를 발생시키지 않고 null 값을 s1에 반환한다. 그렇기 때문에 s1의 자료형도 String? 이어야한다.

5. let 함수 (apply, with, let, run, also)

let 함수는 고차 함수로서 자신을 호출한 객체를 람다식의 인자로 전달하고, 람다식을 실행한 후 그 결과를 반환해주는 범위 지정 함수이다. 특히, 안전 호출 연산자(?.)와 같이 사용하면 안전하게 null 처리를 할 수 있다.

 */