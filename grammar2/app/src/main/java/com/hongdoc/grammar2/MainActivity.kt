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


//람다(Lambda) 함수
//람다란?
/*
    println(sum(1,2))
    println(sumNumber(1,2))
    println(sumTypeNumber(1,2))
    println(sumTypeNumberNull(1,2))

    println(sumString("1","2"))
    println(sumStringTwo("1","2"))
    println(sumStringTypeTwo("1","2"))
}
//기존 방식
fun sumString(a : String, b : String) : String {
    return "string1 : $a String2 : $b"
}
//람다식
val sumStringTwo = {a : String, b : String -> "string1 : $a string2 : $b"}
val sumStringTypeTwo : (String, String) -> String = {a,b -> "string1 : $a string2 : $b"}
//기존 방식
fun sum(a : Int, b : Int) : Int{
    return a+b
}

//람다식
val sumNumber = {a : Int, b : Int -> a + b}
val sumTypeNumber : (Int, Int) -> Int = {a, b -> a+b}
val sumTypeNumberNull : (Int, Int) -> Int? = {_, _ -> null}
*/


/*
fun main() {

    //고차함수(High-Order-Function)
    //f(x) = x -> f(f(x)) = x

   //println(testSum1(1,2))
   //println(testLambdaSum(1,2))
   sum(1,2, { a : Int, b : Int -> a + b})
   sum(1,2) { a : Int, b : Int -> a + b}
   sum(1,2, ::testSum)
   printTest("abc")
   highPrintTest(::printTest)
   test1()
}
//기본
fun testSum1(a : Int , b : Int) : Int {
    return a+b
}
//람다함수
val testLambdaSum = {a : Int, b : Int -> a+b}

//고차함수
fun sum(a : Int, b : Int, operation : (Int, Int) -> Int) {
    println("$a $b")
    println(operation(a,b))
}

fun testSum(a : Int, b : Int) : Int {
    return a+b
}
//기본
fun printTest(str : String){
    println(str)
}
//고차 Unit= 아무것도 return하지 않는다는 뜻
fun highPrintTest(operation : (String) -> Unit){
    operation("bbb")
}

fun test1() : Unit{
    println("abc")
}
*/



//제네릭(generic)
//컴파일시에 타입 체크를 할 수 있다. -> 컴파일
//타입 캐스팅이 필요없다.
// 람다 / 고차함수 / 제네릭
/*
val box1 = Box1(10)
println(box1.value)

val box2 = Box2("숫자 10")
println(box2.value)

val box1_1 = Box1("10".toInt())
println(box1_1.value)

//제네릭
val box3 = Box3(10)
println(box3.value)

val box4 = Box3("숫자 10")
println(box4.value)

//제네릭
testFun1("abc")
testFun2("a")
testFun2(123)
testFun3("a")
testFun3(123)
}

//기존
class Box1(test :Int){
var value = test
}

class Box2(test : String){
var value = test
}

// 제네릭
class Box3<T>(test : T) {
val value = test
}
//기존
fun testFun1(a : String){
println(a)
}
// 제네릭
fun <T> testFun2(a : T){
println(a)
}
fun <A> testFun3(a : A){
println(a)
}
*/
