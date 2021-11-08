package com.hongdoc.awhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
while 반복문

for문이 특정 범위만큼 반복하기 위한 구문이라면, while문은 특정 조건이 만족할 때까지 반복하기 위한 구문이다.
조금 더 쉽게 접근하면 반복이 가능한 if문 이라고 생각할 수 있다.
"
while (조건식){
    실행코드
}
"
while문 괄호 안의 조건식 결과가 항상 true이면 끝없이 동작하는 무한루트에 빠지게 된다.

일반적인 while 반복문
for문과는 다르게 증감되는 인덱스가 있으면 코드에서 직접 처리해야 된다.
"
var current = 1
val until = 12
while (current < until){
    Log.d("while", "현재 값은  ${current}입니다.")
    current = current + 1
}
"
current 변수가 인덱스 역활하는 코드이다.
이 while문에는 current가 until보다 작을 떄만 true를 반환하는 조건식이 입력되어 있다.
current의 값이 1로 시작하는데 while문을 만났을 때 괄호 안의 조건식을 풀어 쓰면 while(1<12)가 된다.
조건을 만족하기 때문에 while 블록의 코드가 실행되며, 먼저 로그를 출력한 후 current에 1을 더 하고
다시한면 while 문의 조건식이 실행된다. 이렇게 current가 until에 입력된 12보다 작을 때까지 11번이 반복된다.

do와 함께 사용하기
do와 함께 사용하면 while문의 조건식과 관계없이 do블록 안의 코드를 한번 더 실행한다.
"
var game = 1
val match = 6
do {
    Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match-game}게임 남았습니다.")
    game += 1
} while (game < match)
"

while과 do ~ while차이점
가장 큰 차이점은 최초 값이 조건식을 만족하지 않았을 경우 실행 코드가 달라지는 것이다. 위의 코드에서 변수 game의 시작값을
6으로 변경한 후 while과 do ~ while로 실행해보면 while에서는 아무것도 출력되지 않는 반면, do ~ while에서는 조건과
상관없이 처음 한 번 로그가 출력된다.
"
var game = 1
val match = 6
do {
    Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match-game}게임 남았습니다.")
    game += 1
} while (game < match)
game = 6
while (game < match) {
    Log.d("while", "while 테스트입니다.")
    game += 1
}
// do while 테스트
game = 6
do {
    Log.d("while", "do ~ while 테스트 입니다.")
    game += 1
} while (game < match)
"

반복문 제어하기

break: 반복문 탈출하기
반복문 안에서 break를 만나면 반복문을 탈출할 수 있다. 특정 조건에서 무조건 for 블록을 벗어날 때 사용한다.
"
for (index in 1..10){
Log.d("break", "현재 index는 $index 입니다.")
    if(index > 5) {
        break
    }
}
"

continue: 다음 반복문으로
반복문 내에서  continue를 만나면 continue 다음코드는 실행되지 않고 반복문의 처음으로 돌아간다.
"
for (except in 1..10){
    if (except > 3 && except < 8){
        continue
    }
    Log.d("continue", "현재 index는 $except 입니다.")
}
"

for 문: 정해진 범위만큼 코드를 반복하기 위해 사용하는 문법
while 문: for문과는 조금 다르게 정해진 범위가 아닌, 특정 조건을 만족할 때까지 코드를 반복하기 위해 사용
break 문: 반복문을 완전히 벗어나기 위해서 사용
continue 문: 반복문 도중에 다음 반복문으로 넘어가기 위해 사용한다. break 문처럼 완전히 벗어나지는 않고 다음 반복문의 조건에 따라 실행여부가 결정된다.


 */