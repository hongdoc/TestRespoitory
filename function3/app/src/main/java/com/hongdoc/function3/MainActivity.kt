package com.hongdoc.function3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
data 클래스
kotlin은 간단한 값의 저장 용도로 data 클래스를 사용한다.

data class 클래스명 (val 파라미터1: 타입, var 파라미터2: 타입)

------------------------------------------------------

데이터 클래스를 정의할 때 class 앞에 data 키워드를 사용해야 되고, 생성자 파라미터 앞에 입력하는 var(or val) 키워드는 생략 불가

//정의 - 주로 코드 블록(클래스 스코프)을 사용하지 않고 간단하게 작성
data class UserData(val name: String, var age: Int)
//생성 - 일반 class의 생성자 함수를 호출하는 것과 동일하다.
var userData = UserData("Michael", 21)

//name은 val로 선언되었기 때문에 변경 불가능
userData.name = "Sindy" (x)
// age는 var로 선언되었기에 변경 가능
userData.age = 18 (O)


toString() 메서드와 copy 메서드
일반 클래스에서 toString() 메서드를 호출하면 인스턴스의 주소 값을 반환하지만, 데이터 클래슨느 값을 반환하기 때문에
실제 값을 모니터링 할 때 좋다.
Log.d("DataClass", "DataUser는 ${dataUser.toString()}")
= DataUser는 DataUser(name=Michael, age=21)
또 copy() 메서드롤 간단하게 값을 복사할 수 있다.
var newData = dataUser.copy()

------------------------------------------------------

kotlin에서 클래스 생성시, 매개변수를 선언하지 않아도 된다. 그냥 클래스 명만 써줘도 선언 자체는 가능하다.
하지만 매개변수에 var/ val를 사용하여 변수를 받아오면 그 즉시 생성자가 실행된다.
@@ 파라미터에 var/val과 데이터 타입을 써주는 이유는 이 클래스가 파라미터를 클래스 변수라고 여기기 때문이다.
@@ 한마디로 argument를 받아오는 즉시 변수에 저장해서 사용하는 것, 생성자가 따로 필요없다.

그렇기 때문에 argument를 받아와서 따로 변수에 할당하는 작업이 필요없다. 파이썬이나 자바처럼
this.변수 = 변수 self.변수 = 변수, 이런 과정이 생략되어 있따.

------------------------------------------------------

생성자
코틀린의 생성자는 세가지가 있다.
1. primary constructor : 기본생성자
2. constructor : 보조 생성자
3. init : 초기화 함수/ 초기화 블럭

일반적으로 생성자라 하면, 클래스가 생성될 떄 자동으로 호출되는 메서드(함수)이다.
클래스를 정의할 때 따로 정의하지 않으면 디폴트 생성자가 내부적으로 생성이 된다.

------------------------------------------------------
1. 기본 생성자
코틀린에서는 하나의 기본 생성자와 하나 이상의 보조 생성자를 지정할 수 있다.
생성자를 생성할 때는 constructor 키워드로 지정하지만 기본생성장의 경우에는 생략할 수 있다.

class Student(var name: String, var stdNum : Int){}

위 클래스는
class Student [constructor](var name: String, var stdNum: Int){}

constructor 키워드가 생략되어 있는 것이다. constructor 키워드는 아주 간편하게 매개변수의 현태로 클래스의 프로퍼티를 선언할 수 있다.

------------------------------------------------------
2. 보조 생성자
보조 생성자 또한 construcotr 키워드를 사용하여 선언한다. 기본 생성자와 다른 점은 constructor 키워드를 반드시 사용해야 된다는 것과, 여러 문법을 사용할 수 있다는 점이 다르다.

보조 생성자는 기본생성자를 반드시 상속 받아야 한다.

class Student(var name: String, var stdNum: Int){
    var name: String = _name
    var tel: String = ""

    constructor(_name: String, _tel: String): this(_name) { //var/val이 필요하지 않는 이유
        this.tel = _tel
    }
}
------------------------------------------------------
3. 초기화 함수/ 초기화 블록 init

기본생성자와 보조 생성자의 역할 덕분에 init의 사용은 필수적이지 않다. 하지만 코딩할 때 가독성적인 측면이나
어떤 생성자가 호출되냐와 관계없이 호출되어야 할 코드가 있다면 초기화 블록안에 넣어두면 굉장이 편리할 것이다.

class Student(var name: String, var stdNum: Int){
    init{println("생성자가 생성됐습니다.")}
}
------------------------------------------------------
보조생성자
코틀린의 생성자는 변수를 할당한다는 개념이 아니라 그냥 클래스 생성시에 자동으로 호출되는 메서드에 불과하다.
따라서 클래스 오버로딩이 필요한 상황에서(argument의 수가 여러가지) 보조 생성자를 이용할 수 있다.

class 클래스명(매개변수)를 입력하는 형식으로 클래스가 생성되는데, 이 떄 클래스명 옆의 파라미터를 기본 생성자
(primary constructor)라고 한다. 그리고 constructor를 이용하여 이를 오버로딩하는 형식으로 생성자를 활용할 수 있다.

class Student(var name: String, var stdNum: Int){
    init {println("생성자가 생성됐습니다.")}

    constructor(name: String) : this(name, 20211101) //20211101이라는 stdID를 가진다.
}
var A = student("hongdoc")

보조 생성자의 생성은 클래스의 상속과 굉장히 유사한 부분이 있다.

------------------------------------------------------
상속
기존의 클래스를 유지하면서, 기능이 조금 다른 클래스를 만들고 싶을 때, 우리는 상속을 사용한다. 주로 오버리아딩이라는 방식을 사용해서.

코틀린의 상속, 오버라이딩은 암묵적으로 수행되는게 아니라 명시적으로 수행된다.
open, override등의 예약어를 이용하여 상속, 다향성, 클래스를 수정할 수 있따.

kotlin 상속에는 규칙이 있다.
1. sub class는 super class에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없다.
    -> 변수 명만으로 오버라이딩 불가
2. sub class가 생성될 때는 반드시 super class의 생성자가 실행된다.

open class Student(var name: String,var stdNum : Int){
    init{ println("생성자가 생성됐습니다.")}
}
class MiddleSchoolStudent(name: String) : Student(name, 123456789){}
// 12345789라는 stdNum 값은 고정 시킨 채 name만 받는 sub class 생성

------------------------------------------------------
오버 라이딩
kotlin의 오버라이딩은 다른 언어들과 다르게 오버 라이딩할 메소드에 open과 override 라는 예약어를 입력해야 된다.

open class Sutdent(var name: String, var stdNum: Int){
    open fun speak(){println("학생입니다.")}
}

class MiddleSchoolStudent(name: String) : Student(name,123456789){
    override fun speak(){println("대학생입니다.")}
}


 */