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
*/



/*
fun main(){
	//추상클래스(absctract class)
	//
	//class -> 붕어빵 틀
	//abstract class -> 기존에는 비어있고 꽉 채워야 하는 붕어빵 만들어야 하는 틀

    //Bike().wheel()
    //Bike().engine()

    RENAULT().wheel()
    RENAULT().engine()
}

abstract class Car {

    abstract fun wheel()

    abstract fun engine()

}

class RENAULT() : Car(){

    override fun wheel(){
        println("RENAULT 굴러갑니다.")
    }
    override fun engine(){
		println("RENAULT 시동겁니다.")
    }
}


*/

/*
open class Car {
    open fun wheel(){
        println("굴러간다")
    }

    open fun engine(){
        println("시동이 켜졌다")
    }
}

class Bike() : Car(){

    override fun wheel(){
        println("자전거가 굴러갑니다.")
    }
}
*/

/*
fun main(){
    //인터페이스(interface)
    //추상클래스랑 비슷하다
    //모두 채워넣어야 하는 붕어빵틀인데
    //자체가 작은 틀이라서 다른 틀에 여러개 넣을 수 있음
    //



    //Benz().wheel()
    //Benz().engine()

    BMW().autoDriving()
    Benz().autoParking()

}

abstract class Car {
    abstract fun wheel()
    abstract fun engine()
}

interface CarAutoDriving{
    fun autoDriving()
}

interface CarAutoParking{
    fun autoParking()
}

class BMW() : Car(), CarAutoDriving{
    override fun wheel(){
	    println("BMW 굴러감")
    }
    override fun engine(){
        println("BMW 엔진시동")
    }

    override fun autoDriving(){
        println("BMW 자율주행")
    }
}
class Benz() : Car(), CarAutoParking {
    override fun wheel(){
	    println("Benz 굴러감")
    }
    override fun engine(){
        println("Benz 엔진시동")
    }

    override fun autoParking(){
        println("Benz 자동 주차")
    }
}


*/

/*
interface Car {

    fun wheel()
    fun engine()

}

class Benz() : Car {
    override fun wheel(){
        println("wheel 돌아감")
    }
    override fun engine(){
        println("engine 돌아감")

    }
}
*/