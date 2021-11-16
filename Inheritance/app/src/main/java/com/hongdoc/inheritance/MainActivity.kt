package com.hongdoc.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*

상속(Inheritance)

코틀린에서는 super class(이하 부모클래스) 선언하지 않은 클래스는 default super로 Any라는 부모클래스를 갖는다.

class Computer // 암시적으로 Any를 상속받음

Open class Any
the root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.

이 설명만 보면 Java의 java.lang.Object와 같아 보인다. 하지만 Any는 Object와는 다르게 equals(), hashCode(), toString() 외
다른 멤버는 가지지 않는다. Object는 clone(), notify()등 다른 멤버가 더 있다.

상속 받는 방법( 부모클래스를 명시적으로 선언하기)
    상속을 받기 위해서는 아래와 같이 부모클래스를 명시적으로 선언해야 된다.

open class Person(var name: String)
class Student(name: String) :Person(name)

앞서 공부한 내용을 떠올려보면 Student의 주 생성자를 호출할 것이다. 그 후 부모클래스에 있는 Property인 name을
초기화 하기 위해서 Person의 주 생성자 호출될 것이다. 마치 부 생성자가 this로 주 생성자를 호출하여 property를 초기화하듯이
동작한다.

open이라는 키워드가 있는데 Java 클래스는 final을 명시했을 때 상속이 불가능하며 특별히 명시하지 않을 떄는 final 클래스가 아니다.
코틀린 클래스는 open을 명시해야 상속이 가능하며 명시하지 안ㅇㅎ을 경우 Java의 final 클래스와 같다.

"
JAVA에서는 상속 불가능 -> final 키워드
코틀린에서는 상속 가능 -> open 키워드

JAVA 코드
public class Person {
String name;
    public Person(String name){
        this.name = name;
    }
}

public class Student extends Person{
    public student(string name){
        super(name);
    }
}

Kotlin 코드
class ExampleUnitTest {
    @Test
    fun kotlin(){
        val student = Student()
        println("student name = ${student.name} student age = ${student.age}")
    }

    open class Person(var name: String = "Jane")
    class Student(name: String = "kim", var age:Int = 26) : Person(name)
}


 */