package com.hongdoc.kotlinkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*

. 코틀린문법



2-1. 변수선언 및 초기화

val data1:Int = 10 // 기본적으로 변수는 val(혹은 var) 변수명:타입 = 값 으로 선언
                   // val는 변경할 수 없는 값(read-only) var는 변경할 수 있는 값
val data2:String = 'test'
val data3 = 20 // 다음과 같이 데이터타입을 명시해주지 않아도 되는데 명시하지 않으면
               // 대입하는 초깃값에 따라 적절한 타입으로 알아서 적용됨
               // 이런걸 '타입추론' 이라고 함
var data4:String = 'hello world'
data4 = 'change value' //var 변수라서 값 변경 가능
val nulldata:String = null // error // ?기호를 붙이지 않으면 null을 대입할 수 없는 변수라는 의미
val nulldata2:String? = null //String val이지만 null도 허용
var nulldata3:String? = null

fun main(args: Array<String>){
 nulldata2 = "hello" //error //val변수의 값을 변경하려 했으므로 재할당시 에러
 nulldata3 = "hello world~"
 }
//상수변수 : 처음에 대입한 값을 변경할 수 없고 항상 초깃값만을 반환하도록 보장하는 변수
const val val_1:Int = 10
const var val_2:Int = 20 // error // var변수에는 const를 사용할 수 없음

public static final int CONST_VAL = 10; //자바에서의 상수변수 사용 예
const val CONST_VAL = 10 //코틀린에서의 상수변수 사용 예 //코틀린에서는 static 예약어가 없음



2-2. 함수사용방법

// fun 함수명(매개변수명:타입) : 반환타입{} 으로 함수를 선언함.
// 함수를 선언할때 fun이라는 예약어를 사용한다는 것 기억!

fun sum(a:Int , b:Int) : Int {
 return a+b
 }

 혹은

 fun sum(a:Int, b:Int) = a+b

 로 작성 가능
//함수 오버로딩
fun cal(a:String) { println("String") }
fun cal(a:String,b:Int) { println("String,Int") }
fun cal(a:String,b:Int,c:String) { println("String,Int,String") }

fun cal2(a:String) { println("a parameter only String") }
fun cal3(a:String?) { println("a parameter null or String") } // ?를 붙임으로써 null param도 가능
fun cal4(a:String = "test"){ println("a 의 기본 값은 test라는 의미") }
 --> cal() 호출시 a 값은 test가 됨
 --> cal(xxx) 호출시 a 값은 xxx가 됨
//Unit
fun Funtion_1(){}
fun Funtion_2() : Unit{}

//Funtion_1에는 return타입이 없음. 기본적으로 Unit으로 선언된것과 같음
//Funtion_2와 같은 형태라고 생각하면 되며 java에서는 void와 비슷하다고 이야기할 수 있음.


2-3. 데이터타입

//코틀린에서의 모든것은 객체(Object)다.
//자바에서는 데이터타입을 명시할 때 int,String과 가은 기초타입과 Integer,Double등의 Wrapper
//클래스로 구분해서 사용하지만 코틀린에서는 기초타입 자체가 없다.
//int,String,Double등은 모두 클래스고, 이 클래스로 타입을 명시하여 선언한 변수들은
//그 자체로 객체가 된다.

val num : Int = 10
val result = num.minus(5)
fun main(args : Array<String>){
	println(result) //5
}
fun main(args: Array<String>) {
    var char = "x"  // error // char는 ''로 작성해야 함
    var str:String = 'xx' // error // String은 ""로 작성해야 함
}
//코틀린 클래스의 최상위 클래스가 Any
//Any로는 어떤 타입의 데이터도 대입할 수 있음.
//특정 변수의 타입을 예츠갈 수 없을 때 유용하게 사용됨

fun _get(obj : Any) : Any{
    if(obj is String){
        return obj.length
    }
    return obj
}

fun main(args: Array<String>) {
   println( _get(333) ) // 333
}

//변수가 Any타입으로 선언되어썽도 null을 허용하려면 ?를 명시적으로 선언해줘야 함.
var data:Any? = null
//형변환
var a1 : Int = 10
var a2 : Double = a1 // 에러
var a3 : Double = a1.toDouble()

// toByte()
// toShort()
// toInt()
// toLong()
// toFloat()
// toDouble()
// toChar()
// toString()




2-4. 변수출력

//코틀린에서는 출력시 System.out.print()를 쓰지 않고 print() println()을 쓴다.
fun main(args: Array<String>) {
   var name : String = "hong-kil"
    println(name) //hong-kil
    println("${name}") //hong-kil //문자열 내 변수출력 방법은 "$변수명" 또는 "${표현식}" 으로 사용한다.
    println("${name[3]}") //g
}


2-5. 컬렉션타입(Map,Array,List...)



2-5-1. Array

fun main(args: Array<String>) {

    //array 만드는 방법 arrayOf()
    var array = arrayOf(1,2,3,4,5)
    array[0]=6
    array[1]=7
    println("${array[0]}")  //6
    println("${array[3]}")  //4
    println("${array.get(1)}") //7
}
fun main(args: Array<String>) {

    //array 만드는 방법
    var array = arrayOf(1,2,"xxxx",4,5)
    var arrayInt = arrayOf<Int>(1,2,3,4,5) //Int타입의 data만 추가가능

    array[2] = "vvvvv"
    println("${array[2]}") //vvvvv
    arrayInt[2] = "ddddd" //error //Type mismatch: inferred type is String but Int was expected

    var arrayInt2 = intArrayOf(10,20,30)
    //기초타입과 관련해서 위와같이 배열을 선언할 수도 있음
    //charArrayOf(), longArrayOf(), booleanArrayOf() 등...

}
    var array2 = arrayOfNulls<Any>(3)
    array2[0] = 100
    array2[1] = "hello"
    array2[2] = "world"
    println( "${array2[0]} ${array2[1]} ${array2[2]}") //100 hello world

    var emptyArray = Array<String>(3,{""}) //배열의 초깃값을 빈상태("")로
    println( "${emptyArray[0]} _ ${emptyArray[1]} _ ${emptyArray[2]}") // _ _


2-5-2. List, Set, Map

fun main(args: Array<String>) {

    // List listOf()  불변
    // MutableList mutableListof() 가변

    var list : List<String> = listOf("hello","world")
    println("${list[0]}") //hello
    //list.add("!!!") //Unresolved reference: add
                    //listOf는 불변이라 set() 또는 add() 함수를 제공하지 않음


    var muList : MutableList<String> = mutableListOf("hello","world")
    muList.add("~~~") //mutableListOf는 가변이므로 set() 또는 add() 를 제공함
    muList.add("!!!")
    println("${muList[0]} _ ${muList[1]} _ ${muList[2]} _ ${muList[3]}") //hello _ world _ ~~~ _ !!!

    //arrayList 클래스를 직접 사용하면 가변 상태로 이용이 가능함
    val arrayList : ArrayList<String> = ArrayList()
    arrayList.add("aaa")
    arrayList.add("bbb")
    println("${arrayList[0]} _ ${arrayList[1]}") //aaa _ bbb
    arrayList.set(1,"ccc");
    println("${arrayList[0]} _ ${arrayList[1]}") //aaa _ ccc


}
fun main(args: Array<String>) {

    //mapOf 불면
    //mutableMap 가변

    //Pair로 선언방법
    var map = mapOf<String,String>(Pair("1","hello"),Pair("2","world"))
    println("${map.get("1")} _ ${map.get("2")}") //hello _ world
	//map.put("3","!!!") //error //Unresolved reference: put

    //to로 선언방법
    var map2 = mapOf<String,String>(Pair("1","hello"),Pair("2","world"))
    println("${map2.get("1")} _ ${map2.get("2")}") //hello _ world


    var mutableMap = mutableMapOf<String,String>()
    mutableMap.put("1","hello")
	mutableMap.put("2","world")
	println("${mutableMap.get("1")} _ ${mutableMap.get("2")}") //hello _ world

}

. 코틀린문법



2-1. 변수선언 및 초기화

val data1:Int = 10 // 기본적으로 변수는 val(혹은 var) 변수명:타입 = 값 으로 선언
                   // val는 변경할 수 없는 값(read-only) var는 변경할 수 있는 값
val data2:String = 'test'
val data3 = 20 // 다음과 같이 데이터타입을 명시해주지 않아도 되는데 명시하지 않으면
               // 대입하는 초깃값에 따라 적절한 타입으로 알아서 적용됨
               // 이런걸 '타입추론' 이라고 함
var data4:String = 'hello world'
data4 = 'change value' //var 변수라서 값 변경 가능
val nulldata:String = null // error // ?기호를 붙이지 않으면 null을 대입할 수 없는 변수라는 의미
val nulldata2:String? = null //String val이지만 null도 허용
var nulldata3:String? = null

fun main(args: Array<String>){
 nulldata2 = "hello" //error //val변수의 값을 변경하려 했으므로 재할당시 에러
 nulldata3 = "hello world~"
 }
//상수변수 : 처음에 대입한 값을 변경할 수 없고 항상 초깃값만을 반환하도록 보장하는 변수
const val val_1:Int = 10
const var val_2:Int = 20 // error // var변수에는 const를 사용할 수 없음

public static final int CONST_VAL = 10; //자바에서의 상수변수 사용 예
const val CONST_VAL = 10 //코틀린에서의 상수변수 사용 예 //코틀린에서는 static 예약어가 없음



2-2. 함수사용방법

// fun 함수명(매개변수명:타입) : 반환타입{} 으로 함수를 선언함.
// 함수를 선언할때 fun이라는 예약어를 사용한다는 것 기억!

fun sum(a:Int , b:Int) : Int {
 return a+b
 }

 혹은

 fun sum(a:Int, b:Int) = a+b

 로 작성 가능
//함수 오버로딩
fun cal(a:String) { println("String") }
fun cal(a:String,b:Int) { println("String,Int") }
fun cal(a:String,b:Int,c:String) { println("String,Int,String") }

fun cal2(a:String) { println("a parameter only String") }
fun cal3(a:String?) { println("a parameter null or String") } // ?를 붙임으로써 null param도 가능
fun cal4(a:String = "test"){ println("a 의 기본 값은 test라는 의미") }
 --> cal() 호출시 a 값은 test가 됨
 --> cal(xxx) 호출시 a 값은 xxx가 됨
//Unit
fun Funtion_1(){}
fun Funtion_2() : Unit{}

//Funtion_1에는 return타입이 없음. 기본적으로 Unit으로 선언된것과 같음
//Funtion_2와 같은 형태라고 생각하면 되며 java에서는 void와 비슷하다고 이야기할 수 있음.


2-3. 데이터타입

//코틀린에서의 모든것은 객체(Object)다.
//자바에서는 데이터타입을 명시할 때 int,String과 가은 기초타입과 Integer,Double등의 Wrapper
//클래스로 구분해서 사용하지만 코틀린에서는 기초타입 자체가 없다.
//int,String,Double등은 모두 클래스고, 이 클래스로 타입을 명시하여 선언한 변수들은
//그 자체로 객체가 된다.

val num : Int = 10
val result = num.minus(5)
fun main(args : Array<String>){
	println(result) //5
}
fun main(args: Array<String>) {
    var char = "x"  // error // char는 ''로 작성해야 함
    var str:String = 'xx' // error // String은 ""로 작성해야 함
}
//코틀린 클래스의 최상위 클래스가 Any
//Any로는 어떤 타입의 데이터도 대입할 수 있음.
//특정 변수의 타입을 예츠갈 수 없을 때 유용하게 사용됨

fun _get(obj : Any) : Any{
    if(obj is String){
        return obj.length
    }
    return obj
}

fun main(args: Array<String>) {
   println( _get(333) ) // 333
}

//변수가 Any타입으로 선언되어썽도 null을 허용하려면 ?를 명시적으로 선언해줘야 함.
var data:Any? = null
//형변환
var a1 : Int = 10
var a2 : Double = a1 // 에러
var a3 : Double = a1.toDouble()

// toByte()
// toShort()
// toInt()
// toLong()
// toFloat()
// toDouble()
// toChar()
// toString()




2-4. 변수출력

//코틀린에서는 출력시 System.out.print()를 쓰지 않고 print() println()을 쓴다.
fun main(args: Array<String>) {
   var name : String = "hong-kil"
    println(name) //hong-kil
    println("${name}") //hong-kil //문자열 내 변수출력 방법은 "$변수명" 또는 "${표현식}" 으로 사용한다.
    println("${name[3]}") //g
}


2-5. 컬렉션타입(Map,Array,List...)



2-5-1. Array

fun main(args: Array<String>) {

    //array 만드는 방법 arrayOf()
    var array = arrayOf(1,2,3,4,5)
    array[0]=6
    array[1]=7
    println("${array[0]}")  //6
    println("${array[3]}")  //4
    println("${array.get(1)}") //7
}
fun main(args: Array<String>) {

    //array 만드는 방법
    var array = arrayOf(1,2,"xxxx",4,5)
    var arrayInt = arrayOf<Int>(1,2,3,4,5) //Int타입의 data만 추가가능

    array[2] = "vvvvv"
    println("${array[2]}") //vvvvv
    arrayInt[2] = "ddddd" //error //Type mismatch: inferred type is String but Int was expected

    var arrayInt2 = intArrayOf(10,20,30)
    //기초타입과 관련해서 위와같이 배열을 선언할 수도 있음
    //charArrayOf(), longArrayOf(), booleanArrayOf() 등...

}
    var array2 = arrayOfNulls<Any>(3)
    array2[0] = 100
    array2[1] = "hello"
    array2[2] = "world"
    println( "${array2[0]} ${array2[1]} ${array2[2]}") //100 hello world

    var emptyArray = Array<String>(3,{""}) //배열의 초깃값을 빈상태("")로
    println( "${emptyArray[0]} _ ${emptyArray[1]} _ ${emptyArray[2]}") // _ _


2-5-2. List, Set, Map

fun main(args: Array<String>) {

    // List listOf()  불변
    // MutableList mutableListof() 가변

    var list : List<String> = listOf("hello","world")
    println("${list[0]}") //hello
    //list.add("!!!") //Unresolved reference: add
                    //listOf는 불변이라 set() 또는 add() 함수를 제공하지 않음


    var muList : MutableList<String> = mutableListOf("hello","world")
    muList.add("~~~") //mutableListOf는 가변이므로 set() 또는 add() 를 제공함
    muList.add("!!!")
    println("${muList[0]} _ ${muList[1]} _ ${muList[2]} _ ${muList[3]}") //hello _ world _ ~~~ _ !!!

    //arrayList 클래스를 직접 사용하면 가변 상태로 이용이 가능함
    val arrayList : ArrayList<String> = ArrayList()
    arrayList.add("aaa")
    arrayList.add("bbb")
    println("${arrayList[0]} _ ${arrayList[1]}") //aaa _ bbb
    arrayList.set(1,"ccc");
    println("${arrayList[0]} _ ${arrayList[1]}") //aaa _ ccc


}
fun main(args: Array<String>) {

    //mapOf 불면
    //mutableMap 가변

    //Pair로 선언방법
    var map = mapOf<String,String>(Pair("1","hello"),Pair("2","world"))
    println("${map.get("1")} _ ${map.get("2")}") //hello _ world
	//map.put("3","!!!") //error //Unresolved reference: put

    //to로 선언방법
    var map2 = mapOf<String,String>(Pair("1","hello"),Pair("2","world"))
    println("${map2.get("1")} _ ${map2.get("2")}") //hello _ world


    var mutableMap = mutableMapOf<String,String>()
    mutableMap.put("1","hello")
	mutableMap.put("2","world")
	println("${mutableMap.get("1")} _ ${mutableMap.get("2")}") //hello _ world

}


//set도 동일(예제생략)

import java.util.*
fun main(args: Array<String>) {

    //코틀린이 JVM에서 수행되는 프로그램이라는 가정하에 JAVA에서 사용하던 java.util.*의
    //List, Set, Map등 사용가능


    var list : ArrayList<String> = ArrayList()
    list.add("xxx")

    var map : HashMap<String,String> = HashMap()
    map.put("kkey","vvalue")

    var _set : HashSet<String> = HashSet()
    _set.add("xxx")
}




//set도 동일(예제생략)

import java.util.*
fun main(args: Array<String>) {

    //코틀린이 JVM에서 수행되는 프로그램이라는 가정하에 JAVA에서 사용하던 java.util.*의
    //List, Set, Map등 사용가능


    var list : ArrayList<String> = ArrayList()
    list.add("xxx")

    var map : HashMap<String,String> = HashMap()
    map.put("kkey","vvalue")

    var _set : HashSet<String> = HashSet()
    _set.add("xxx")
}

 */