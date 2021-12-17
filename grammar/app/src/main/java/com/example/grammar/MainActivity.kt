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