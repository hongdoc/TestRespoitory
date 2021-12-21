package com.example.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
 * list
val testList1 = ArrayList<String>()
testList1.add("A")
testList1.add("B")
testList1.add("C")

println(testList1)
println(testList1[0])
println(testList1[1])
println(testList1[2])


val testList2 = listOf("A","B","C")
println(testList2)

val testList3 = mutableListOf<String>("A","B","C")
println(testList3)
testList3.add("D")

println(testList3)

//filter
val testList4 = listOf("student1","student2","student3","student4","teacher1","student5")
 println(testList4)
// s로 시작하는 값을 찾아온다. filter startsWith
println(testList4.filter{ it.startsWith("s")})

//filter
val testList5 = listOf("student1","student2","student3","student4","teacher1","student5", null)
 println(testList5)
println(testList5.filterNotNull().filter{ it.startsWith("s")})


var test1 : String = "a"
var test2 : String = "b"

test1 = test2

println(test1)

var test3 : String = "c"
// Null일 수 있는 값
var test4 : String? = "d"
// Null일 수 있는 값에 !!을 넣어서 Null이 아니다라는 뜻
test3 = test4!!
println(test3)


 val testList6 = listOf("A","B","C","D","E","F")
 for (i in testList6){
     println(i)
    }
for (j in 1..10){
    println(j)
}



//구구단 출력하기
//
for(i in 1..9){
    for(j in 1..9){
    val k = i * j
    println("$i * $j = $k")
    }
}

// mutableListOf은 변할 수 있는 리스트
val testList2 = mutableListOf("A","B","C")
println(testList2)
testList2.add("D")
println(testList2)
testList2.remove("A")
println(testList2)


//MutableList
val mutableList1 = mutableListOf<Int>()
mutableList1.add(5)
mutableList1.add(10)
mutableList1.add(15)
mutableList1.add(22)

val mutableList2 = mutableListOf<String>()
mutableList2.add("유리")
mutableList2.add("철수")
mutableList2.add("짱구")
mutableList2.add("훈이")

val findIndex = mutableList1.indexOf(15)
println(findIndex)
println(mutableList2[findIndex])


//Map
//Map에서는 testMap1.add를 사용하지 않고 put을 사용한다.
   val testMap1 = mutableMapOf<Int, String>()
testMap1.put(5, "유리")
testMap1.put(10, "철수")
testMap1.put(15, "짱구")
testMap1.put(22, "훈이")

println(testMap1[10])


//Set에서는 중복이 허용되지 않는다.
val testSet1 = mutableSetOf("A","B","C")
println(testSet1)

testSet1.add("D")
testSet1.add("E")

println(testSet1)

testSet1.add("E")

println(testSet1)

testSet1.remove("E")
println(testSet1)

*/

//while
//List map
//Iterator
//

/*while
var count = 0
while(count < 100){
    count++ // count = count + 1
    println(count)
}


//List map
val testList1 = mutableListOf("A","B","C")
println(testList1)

for(i in testList1){
    println(i)
}


val testMap1 = mutableMapOf<Int, String>()
testMap1.put(5, "유리1")
testMap1.put(15, "유리2")
testMap1.put(25, "유리3")
testMap1.put(35, "유리3")
println(testMap1)

for(i in testMap1){
    println(i)
}


val testMap2 = mutableMapOf<Int, String>()
testMap2[5] = "유리1"
testMap2[15] = "유리2"
testMap2[25] = "유리3"
testMap2[35] = "유리4"

println(testMap2)

for (i in testMap2){
    println(i)
}

//Iterator 다음에 값이 있으면 출력한다.
val testList2 = mutableListOf("A","B","C")
val testIterator = testList2.listIterator()

println(testIterator.next())
println(testIterator.next())
println(testIterator.hasNext())
println(testIterator.next())
println(testIterator.hasNext())
println(testIterator.previous())
println(testIterator.previous())
println(testIterator.previous())

while(testIterator.hasNext()){
    println(testIterator.next())
}

// 점수가 50점 이상인 사람들의 이름만 반복문과 조건문을 통해서 출력하기
val student = mutableMapOf<Int, String>()
student[99] = "민지"
student[20] = "철수"
student[35] = "민수"
student[48] = "가영"
student[100] = "하영"
student[22] = "수진"
student[45] = "수달"
student[88] = "캥거루"
student[91] = "코알라"
student[87] = "악어"
student[54] = "코끼리"
student[42] = "하마"

//나중에 활용하기위해 List에 담아두기
val testList = ArrayList<String>()

for(i in student){
    if(i.key >= 50){
        println(i.value)
        testList.add(i.value)
    }

}
println(testList)


//function
//함수 = 기능

testFun()
sum(10,20)
bobMaking(20)

}
fun bobMaking(time : Int){
println("$time 분 후에 밥이 완료됩니다.")
}
fun sum(a : Int, b : Int){
println(a + b)
}
fun abc2(){
val a = 20
val b = 40
val c = a + b
println(c)
}
fun abc(){
val a = 10
val b = 20
val c = a + b
println(c)
}
fun testFun(){
println("A")
println("B")
println("C")
*/

/*
    sumTwo(10,4)
    sumThree(10,2,8)
    minus(18,1)
    division(10,5)
    remainder(14,5)

}

fun sumTwo(num1 : Int, num2 : Int){
    println(num1 + num2)
}

fun sumThree(num1 : Int, num2 : Int, num3 : Int){
    println(num1 + num2 + num3)
}

//숫자 두개를 빼주고
fun minus(num1 : Int, num2 : Int){
    println(num1 - num2)

}

// 숫자 두개를 나눠주고
fun division(num1 : Int, num2 : Int){
    println(num1 / num2)

}
// 숫자 두개를 나누고 나머지
fun remainder(num1 : Int, num2 : Int){
    println(num1 % num2)



    //논리 연산
    //and or

    val a = "남자"
    val b = 20

    //and
    if(a == "남자" && b >= 20){
        println("and 만족")
    }





    //문자열 가공
    //유저가 입력한 데이터를 가공하거나
    //서버에서 가져온 데이터를 알맞게 가공해서 쓰거나

    //0번째 부터 시작해서 2번째까지 데이터를 가져온다
//     val testString = "동해물과 백두산이 마르고 닳도록"
//     //문자열 일부분만 바꾸고 싶다 할 때 replaceValue 사용
//     val replaceValue = testString.replace("백두산","한라산")
//     println(replaceValue)
    //마지막 끝자리를 빼고 가져오고 싶을 때
//     val splitString = testString.substring(0, testString.length-1)
//     println(splitString)
//	스페이스바를 기준으로 자르려고한다. split사용
//    val newTestString = testString.split(" ")
//     println(newTestString)
//     println(newTestString[0])
//     println(newTestString[1])
//
// 	val a = testString[1]
//     val b = testString[2]
// 	println(a.toString() + b.toString())
//
	val testList = ArrayList<String>()
    testList.add("ABC1@naver.com")
    testList.add("ABC2@google.com")
    testList.add("ABC3@daum.com")
    testList.add("ABC4@kakao.com")
    testList.add("ABC5@naver.com")
    testList.add("ABC6@kakao.com")
    testList.add("ABC7@naver.com")

    //저는 저기 이메일에 @ 다음에 naver라고 적힌 이메일의 갯수를 찾는다.
    //2가지방법
    //1. naver라는 텍스트가 포함되어있는지
    // -> 첫번쨰 방법 문제는 naver@google.com일 때 가져온다
    //2. @뒤에 naver라고 텍스트가 있고 그 다음에 .이 이어진 이메일이 몇개인지 찾기
    //******@naver.

    val emailList = ArrayList<String>()

    for (item in testList) {
        //split로 @까지 자르고 list에 1번째 값만 가져오고 또 .기준으로 자른 후 0번째 값을 가져온다.
        println(item.split("@")[1].split(".")[0])
        emailList.add(item.split("@")[1].split(".")[0])
    }
    println(emailList)

    var count = 0

    for (item in emailList){
        if(item == "naver"){
        count++
        }

    }
    println(count)

   //엘비스 연산자(Elvis Operator)
    //null 처리를 위해
    //null -> 아무것도 없는것
    //var str = "" val number = 0 X
    //null이라는것은 아무것도 없는것
    //
    /*
    var testStr1 : String = ""
    println(testStr1)

    var testStr2 = null
    println(testStr2)

    var testStr3 : String = "abcd"
    println(testStr3)

    //null은 문자열이 아니므로 에러가 난다.
    //?을 붙여서 Null일 수도 있다는것을 알려준다.
    var testStr4 : String?= null

    var testStr2 : String = ""
    println(testStr2)

    var testStr3 = null
    println(testStr3)

    var testStr4 : String = "abcd"
    println(testStr4)
 */
 */
 */


/*
ddd





    // 문자열을 길이를 찾아주는 function이다 문자열을 받아서 Int타입을 리턴해준다.

    println(findStringLength4(null))
    }

//     fun findStringLength1(str : String) : Int {

//         return str.length

//         fun findStringLength2(str : String?) : Int?{
//             return str?.length
//         }
//만약에 str이 null이 아니면 resultCount의 값을 str.length에 넣고 return 으로 resultCount를 리턴해준다.
// 	fun findStringLength3(str : String?) : Int {
//         var resultCount = 0
//         if(str != null) {
//             resultCount = str.length
//         }
//         return resultCount
//     }
// 만약에 str?.lenght가 null이면 0을 리턴해주고 아니면 이 문자열의 길이를 리턴해줘라
	fun findStringLength4(str : String?) : Int {
        return str?.length ?: 0
        */



//Any
//이름처럼, 아무거나 할 수 있는 느낌?
//모든 아이들을 포함하는 조상같은 친구?
//
//is as
// is -> 맞나? 확인
// as -> type casting -> 타입 변경 체크

    /*
    var str1 : String = "ABC"
    println(str1)
    str1 = 123
    println(str1)

	var str2 : Any = "abc"
    println(str2)
    str2 = 123
    println(str2)
    */
/*
    var str3 : Any = "abc"

    if(str3 is String){
        println("this is string")
    } else {
    	println("this is not String")
    }

   */


        /*



    var str4 : Any = 132

    when(str4) {
        is Int -> { println ("this is int")}
        is String -> { println("this is string")}
    	else -> {
            println("this is else")
        }
    }



//     var str5 : String = "abc"
//     var str6 : String = str5 as String

//     println(str6)

//     var str7 : Int = 1
//     var str8 : String = str7 as String

    var str9 : String? = "abc" as? String
    println(str9)
}
*/
/*
 // list 가공하기
   val testList1 = mutableListOf<Int>()
   testList1.add(1)
   testList1.add(2)
   testList1.add(3)
   testList1.add(4)
   testList1.add(10)
   testList1.add(15)
   testList1.add(15)
   testList1.add(10)

   //distinct 중복제거
   println(testList1.distinct())]
   //maxOrNull 제일 큰 값
   println(testList1.maxOrNull())
   //minOrNull 제일 작은 값
   println(testList1.minOrNull())
   //avarage 평균값
   println(testList1.avarage())


    //j로 이름이 시작하는 사람 출력하기
    val testList2 = listOf("john", "jay", "minsu", "hong", "doc")

    val result1 = testList2.filter {
        it.startsWith("j")
    }
    println(result1)
    */
    

