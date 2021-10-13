package com.example.scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // run
        var list = mutableListOf("Scope", "Function")
        list.run {
            val listSize = size
            println("리스트의 길이 run = $listSize")
        }
        // let
        var list = mutableListOf("Scope", "Function")
        list.let{ // it -> 생략된 형태. it -> 대신에 target -> 등으로 변경 가능
            val listSize = it.size // 모든 속성과 함수를 it. 멤버로 사용할 수 있습니다.
            println("리스트의 길이 let = $listSize")
        }
        // this로 사용되는 스코프 함수 : run, apply, with
        var list = mutableListOf("Scope", "Function")
        list.apply {
            val listSize = size
            println("리스트의 길이 ㅁpply = $listSize")
        }
        with (list){
            val listSize = size
            println("리스트의 길이 with = $listSize")
        }
        // it으로 사용되는 스코프 함수 : let, also
        var list  = mutableListOf("Scope", "Function")
        list.let { target -> // it을 target 등과 같은 다른 이름으로 변경 가능
            val listSize = target.size // target 으로 변경했기 때문에 멤버 접근은 target.속성 입니다.
            println("리스트의 길이 let = $listSize")
        }
        list.also {
            val listSize = it.size
            println("리스트의 길이 also = $listSize")
        }

        //호출 대상인 this 자체를 반환하는 스코프 함수 : apply, also

        var list = mutableListOf("Scope", "Function")

        val afterApply = list.apply {
            add("Apply")
            count()
        }
        println("반환값 apply = $afterApply")

        val afterAlso = list.also{
            it.add("Also")
            it.count()
        }
        println("반환값 also = $afterAlso")

        //마지막 실행 코드를 반환하는 스코프 함수 : let, run, with
        var list = mutableListOf("Scope", "Function")

        val lastCount = list.let{
            it.add("Run")
            it.count()
        }
        println("반환값 let = $lastCount")

        val lastItem = list.run{
            add("Run")
            get(size-1)
        }
        println("반환값 run = $lastItem")

        val lastItemWith = with(list){
            add("With")
            get(size-1)
        }
        println("반환값 with = $lastItemWith")

    }
}