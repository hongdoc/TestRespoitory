package com.hongdoc.tetststs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*

클래스의 기본 구조
class 클래스 명{
    var 변수
    fun 함수(){
        코드
    }
}

length 변수로 문자열 길이를 알 수 있음
plus 함수 - 문자열을 이어붙일 수 있음
compareTo 문자열 비교하는 기능

프라이머리 생성자
class person 프라이머리 생성자() {
          -> constructor(value: String)
}

생성자에 접근 제한자난 다른 옵션이 없다면 constructor 키워드를 생략 가능
class person(value: String){

}

프라이머리 생성자는 마치 헤더처럼 class 키워드와 같은 위치에 작성
클래스의 생성자가 호출되면 init 블록의 코드가 실행되고, init 블록에서는 생성자를 통해 넘어온 파라미터에 접근 가능
class person(value: String){
    init {
        Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
    }
}

하지만 init 초기화 작업이 필요하지 않다면 init 블록을 작성하지 않아도 된다. 대신
파라미터로 전달된 값을 사용하기 위해서는 파라미터 앞에 변수 키워드인 val을 붙여주면 클래스 스코프 전체에서
해당 파라미터를 사용 할 수 있다.
class person(val value: String){
    fun process(){
        print(value)
    }
}

새컨더리 생성자
constructor 키워드를 마치 함수처럼 클래스 스코프 안에 직접 작성할 수 있다. 그리고 다음과 같이 init 블록을 작성하지
않고 constructor 다음에 괄호를 붙여서 코드를 작성 할 수 있다.
class person{
    constructor (value: String){
        Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
    }
}

새컨더리 생성자는 파라미터의 개수, 또는 파라미터의 타입이 다르다면 여러 개를 중복해서 만들 수 있다.
class Kotlin {
    constructor (value: String){
        Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
    }
    constructor (value: Int){
        Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
    }
    constructor (value1: Int, value2: String){
        Log.d("class", "생성자로부터 전달받은 값은 ${value1}, ${value2}입니다.")
    }
}

Default 생성자는 작성하지 않을 경우 파라미터가 없는 ㅇ프라이머리 생성자가 하나 있는것과 동일합니다.
class Student { // 생성자를 작성하지 않아도 기본 생성자가 동작
    init {
        // 기본 생성자가 없더라도 초기화가 필요하면 여기에 코드를 작성합니다.
    }
}
 */