package com.hongdoc.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


/* 함수는 fun으로 정의하고 반환값이 있는 함수는 내부에서 return으로 값을 반환한다.
*  함수를 정의 할 때 입력 값을 기술한 것을 '파라미터'라고 한다.
*
* fun 함수명(파라미터 이름: 타입): 반환 타입{
*   return 값
* }
* */


        // 4. 반환 값이 있는 함수 square 사용하기
        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다.")

        // 5. 반환 갑싱 없는 함수는 그냥 실행한다.
        printSum(3, 5)

        // 6. 입력값이 없는 함수 사용하기
        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}입니다.")

        // 7. 기본값이 있는 함수 사용하기
        newFunction("Hello")

        // 8. 파라미터 이름을 직접 지정하기
        newFunction("Michael", weight = 67.5)
    }

    // 1. 반환값이 있는 함수
    fun square(x: Int): Int {
        return x * x // <- square gㅏㅁ수는 입력받은 값에 2를 곱해서 반환합니다.
    }

    //2. 반환값이 없는 함수
    fun printSum(x: Int, y: Int){
        Log.d("fun", "x + y = ${x + y}")
    }

    //3. 입력값 없이 반환값만 있는 함수
    fun getPi(): Double {
        return 3.14
    }

    //7. 기본값을 갖는 함수
    fun newFunction(name: String, age: Int = 27, weight: Double = 65.5){
        Log.d("fun","name의 값은 ${name}입니다.")
        Log.d("fun", "age의 값은 ${age}입니다.")
        Log.d("fun", "weight의 값은 ${weight}입니다.")
    }
}