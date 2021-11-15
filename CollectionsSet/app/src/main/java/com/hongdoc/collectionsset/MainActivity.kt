package com.hongdoc.collectionsset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
Set은 자료구조 중에 한 종류이다. Set을 사용하기 전에, Set의 가장 큰 특징은 요소의 중복이 허용되지 않는다는 점이다.
List는 같은 형식의 요소가 넘버링되어 저장되었다. 1을 add하고 또 1을 넣으면 0번째 데이터가 1이고 1번째 데이터가 1일 뿐 이었지만,
Set은 단 하나의 값만 저장된다.

1.Set 생성
Set을 생성하겠습니다. 다른 Collections과 마찬가지로 setOf()와 mutableSetOf()가 있다. 읽기 전용이냐 아니냐의 차이이다.
먼저 setOf()을 사용해서 Set을 생성했다.

"
val day = setOf("월", "화", "수", "수", "수")
println(day)
[월, 화, 수]
"

set 데이터는 중복을 허락하지 않기 때문에 한번만 저장된다.
set은 index를 사용하지 않기 때문에 get()과 set()이 없다. 하지만 요소들이 저장된 순서에 따라서 index로 값을 불러오는
elementAt()함수가 존재하긴 한다. 다만 Set을 이렇게 사용한다면 list를 사용하는게 좋다.

2. Set에 요소 추가, 삭제

setOf()을 사용해서 생성했다. 이번에는 mutableSetOf()을 사용해서 요소를 추가하고, 삭제하겠다.

"
val day = mutableSetOf<String>()
day.add("월")
day.add("화")
day.add("수")
day += "목"
day += "금"
println(day)

day.remove("화")
day. -= "금"
println(day)

[월, 화, 수, 목, 금]
[월, 수, 목]
"
mutableSetOf<String>()으로 mutableSet을 생성했다. mutable은 변경 가능함을 나타낸다. 선언과 동시에
값을 초기화하지 않을 경우에는 <String> 같이 <>사이에 자료형을 작성해서 어떤 데이터를 담는  Set인지 컴파일러에게 전달해
줘야 합니다. 그렇게 하지 않으면 에러가 발생한다. List와 함수가 비슷하지만 다른 점은 특정 index에 추가하는 add(index,
element)함수가 없다. Set은 add(element)만 존재한다. remove()역시 remove(element)만 존재한다.
+=, -= 연산자로 추가, 삭제하는 것은 다른 자료구조와 동일하다.

 */