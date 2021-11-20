package com.example.`object`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
싱글턴 패턴(singleton pattern)은 어떤 클래스가 최초 선언될 때 메모리에 적재하고, 그 이후 동일한 메모리에 인스턴스를 만들어 사용하는 패턴이다. 따라서, 생성자가 여러번 호출 되더라도 실제로 호출되는 인스턴스는 동일하다.
싱글턴 패턴을 쓰는 이유는,
1. 고정된 메모리영역을 재사용하기 때문에 메모리적인 측면에서 효율적이다.
2. 싱글턴으로 생성된 객체는 보통 전역 인스턴스이기 때문에 다른 객체가 접근 및 사용에 편리하다.
3. 싱글턴 패턴으로 작성된 객체는 유일성(하나만 존재)을 보장 받기 때문에 다른 객체들과의 데이터 공유에 유리하다.

object

코틀린에서 object 키워드로 클래스를 정의하면 싱글톤 패턴이 적용되어 객체가 생성된다. 객체를 선언과 동시에 생성할 수 있기 때문에 익명 객체를 생성할 수 있다.


기본적인 사용 방식.

fun main() {
    var obj = object {
        var id = 27
        var name = "kwak"

        fun getInfo(){
            println("id: $id, name: $name")
        }
    }
    obj.getInfo()
}


코틀린은 안드로이드 개발환경에 쓰이는 언어이다. 따라서 어플리케이션을 개발할 때 object의 활용을 알아두는 것도 좋을 것이다. object는 익명 객체이니만큼 추상 클래스와 인터페이스들을 상속받을 수 있다.
다음과 같은 패턴의 코드를 자주 목격할 수 있다. 물론 안드로이드 스튜디오 안의 A와 B는 이미 구현되어 내장돼있기 때문에 코드상에는 표시되지 않는다.

interface A
abstract class B

fun main(){
    var obj = object : A, B(){
    }
}
  Companion Object

companion 키워드를 사용하여 object를 구현하면 조금 특별한 사용을 할 수 있다.

1. 일반적으로 클래스의 프로퍼티나 함수에는 직접적인 접근을 할 수 없다. 하지만 companion 키워드가 사용된 익명 객체 안의 데이터에는 접근할 수 있다.
 이는 익명 객체가 선언과 동시에 인스턴스화 하여 메모리에 적재되기 때문이다.
2. companion 키워드를 사용한 객체는 이 객체를 선언한 클래스에서 자신의 멤버인 것처럼 사용할 수 있다. 즉, 참조 연산을 한번 줄일 수 있다는 것이다.
 A클래스에 선언된 컨패니언 객체 B의 프로퍼티 C에 접근한다고 가정해보자. 일반적으론,
 A.B.C의 형식으로 접근하지만 companion 키워드를 설정했기 때문에 A.C와 같은 접근이 가능하다.
*/