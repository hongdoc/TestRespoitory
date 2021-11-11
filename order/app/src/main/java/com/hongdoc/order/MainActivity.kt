package com.hongdoc.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
코틀린 함수 호출 순서

호출 순서는 클래스 속성값 -> init 블록 -> constructor 블록 순이다.
상속시 부모 -> 자식 순이다.

open class Parent {
    private val a = println("Parent.a") -------- 4

    constructor(arg: Unit=println("Parent primary constructor default argument")) { -------- 3
        println("Parent primary constructor") --------- 7
    }

    init {
        println("Parent.init") --------- 5
    }

    private val b = println("Parent.b") --------- 6
}

class Child : Parent {
    val a = println("Child.a") --------- 8

    init {
        println("Child.init 1") ---------- 9
    }

    constructor(arg: Unit=println("Child primary constructor default argument")) : super() { -------- 2
        println("Child primary constructor") ---------- 12
    }

    val b = println("Child.b") ---------- 10

    constructor(arg: Int, arg2:Unit= println("Child secondary constructor default argument")): this() {  ----- 1
        println("Child secondary constructor") ----------- 13
    }

    init {
        println("Child.init 2") ----------- 11
    }
}
-----------------------------------
결과물은 다음과 같다.

Child secondary constructor default argument

Child primary constructor default argument

Parent primary constructor default argument

Parent.a

Parent.init

Parent.b

Parent primary constructor

Child.a

Child.init 1

Child.b

Child.init 2

Child primary constructor

Child secondary constructor

 */