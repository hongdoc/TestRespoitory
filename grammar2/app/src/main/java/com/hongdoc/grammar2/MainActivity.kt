package com.hongdoc.grammar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
// 오버로딩 -> OverLoading
// 같은 이름의 메서드를 여러개 가지면서, 매개변수의 유형과 개수가 다르도록 한다.
// over + loading
// 겹겹이 쌓는다>?

val c = Calculator()
    c.sumNumber(1,2)
    c.sumNumber(1,2,3)
    c.sumNumber("나는","행복")
//     c.sumNumberTwo(1,2)
//     c.sumNumberThree(1,2,3)
}

class Calculator(){

fun sumNumberTwo(a : Int, b : Int){
    println(a+b)
}

fun sumNumberThree(a : Int, b : Int, c : Int){
    println(a+b+c)
}

fun sumNumber(a : Int, b : Int){
    println(a+b)
}

fun sumNumber(a : Int, b : Int, c : Int){
    println(a+b+c)
}

fun sumNumber(a : String, b : String){
    println(a+b)
}
*/



/*
    //상속
    //Inheritance
    //상속 -> 물려받는다??
    
    Job1()
    Job2()
    Job3()
    Job4()
}
//상속
open class AllJobs(){
    init{
        println("일을 합니다.")
    }
}

class Job3() : AllJobs(){
	init {
        println("마케팅을 합니다.")
    }
}

class Job4() : AllJobs(){
	init{
        println("근로를 합니다.")
    }
}

//일반적으로 했을 때
class Job1(){
    init {
        println("일을 한다")
        println("코딩을 한다")
    }
}
    class Job2(){
    init {
        println("일을 한다")
        println("디자인을 한다")
    }
}
    */
/*
//상속(inheritance)과 오버라이딩(overriding)
//
//상속
//자식 클래스가 부모 클래스의 멤버를 물려받는것
//
//오버라이딩
//부모클래스의 메소드를 자식클래스에서 재정의해서 사용하느것
//Parents().disease()
//
Child().doing()
Child().disease()
}
//상속을 하려면 open을 붙여준다.
//
open class Parents(){
    fun doing(){
        println("자식을 돌본다")
    }

    open fun disease(){
        println("비염이있다.")
    }
}

class Child() : Parents(){
    override fun disease(){
        super.disease()
    }
}
/*