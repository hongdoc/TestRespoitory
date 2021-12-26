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
    //Data class
    //이름처럼 데이터를 넣어놓는 클래스

    val justDog = JustDog("파트라슈", 21)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())

    val dataDog = DataDog("파트라슈 친구", 15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())

    val dataDog2 = dataDog.copy(name = "파트라슈 여자친구")
    println(dataDog2.toString())
}

class JustDog(var name : String, var age : Int){

}

data class DataDog(var name : String, var age : Int)[

]
*/

/*
    //중첩 클래스(Nested class)
    //내부 클래스(Inner class)
    //
    // 중첩 클래스 -> 객쳊디향 / 캡슐화
    // 내부 클래스 -> RecyclerView
    val test1 = Test1.Test1NestedClass()
    test1.testFun1()

    val test2 = Test2().Test2InnerClass()
    test2.testFun2()
}

class Test1 {

    val tempText1 = "tempText1"

    class Test1NestedClass{

        fun testFun1(){
            println("TestFun1")
            // inner class와 다른점, 중첩 클래스에서는 외부 데이터에 있는 데이터 접근이 불가능하고
            // inner class는 외부 데이터를 가져와서 사용이 가능하다.
            println(tempText1)
        }
    }
}

class Test2 {

    val tempText2 = "tempText2"

	inner class Test2InnerClass{

        fun testFun2(){
            println("TestFun2")
            println(tempText2)
        }
    }
}

*/