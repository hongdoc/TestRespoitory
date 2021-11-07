package com.hongdoc.afor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
반복문

반복문은 코드를 반복적으로 실행하고자 할 때 사용한다. 예를 들어 1부터 10까지의 숫자를 Log를 사용하여
출력할 때 반복문이 없다면 Log 코드를 열 줄 작성해야 하지만 반복문을 사용하면 반복문 내에 Log 코드를 한 줄만 작성하면 된다.

반복문에는 for와 while 두가지가 있는데 for는 특정 횟수만큼 코드를 반복하기 위해 사용하고,
while은 특정 조건이 만족할 때까지 코드를 반복할 때 사용한다. while은 if문처럼 조건식을 사용해서 언제까지 반복할지를
결정할 수 있다.

for 반복문
"
for (반복할 범위) {
    실행코드
}
"

for in..(온점 2개): 일반적인 형태의 for 반복문
시작값과 종료값으로 지정한 숫자 범위만큼 코드를 반복하는 일반적인 방법이다.
in을 사용해서 반복하는 범위의 숫자를 변수에 담아두고 사용할 수 있다.
"
for (변수 in 시작값..종료값){
    실행코드
}
"
다음은 1부터 10까지 열 번 반복하면서 그 숫자를 변수 index에 먼저 저장하고, 반복하는 횟수만큼 for 블록의 코드를 실행한다.
"
for (index in 1..10){
    Log.d("For", "현재 숫자는 ${index}")
}
첫 번째 반복에서는 변수 index에'1'이 저장되고, 두 번째 반복에서는 index에'2'가 저장된다.

until: 마지막 숫자 제외하기
시작값과 종료값 사이의..(온점 2개) 대신에 until을 사용하면 종료값 이전까지만 반복한다.
"
for(변수 in 시작값 until 종료값){
    실행 코드
}
"

컴퓨터의 인덱스가 항상 0부터 시작하기 때문에 배열의 인덱스를 사용하여 처리하는 코드에서 사용할 수 있다.
"
var array = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
for (index in 0 until array.size){
    Log.d("For", "현재 월은 ${array.get(index)}입니다.")
}
"
배열의 인덱스가 0부터 시작하기 떄문에 배열의 크기는 항상 '마지막 인덱스 +1의 값'입니다. 따라서 반복을 할 때 배열의 크기
바로 전까지만 반복해야 합니다.

step: 건너뛰기
1부터 100까지 반복하면서 3의 배수만 사용하고 싶다면 어떻게 해야 할까요? for문 안에 if문을 사용해서 현재 값이 3의 배수일 때만 출력하도록 할 수 있다.
그런데 이렇게 하면 매번 해당 if문을 실행해서 코드가 낭비되는 단점이 있다. 이럴 떄 step을 사용하면 for문의 블록을 step수만큼 건너뛰어서 실행합니다.
"
for (변수 in 시작값..종료값 step 3){
    실행 코드
}
"
다음의 코드는 0부터 100까지 반복하며 시작값에서 종료값까지 한 번 반복할 때마다 3씩 증가시켜서 실행합니다.
"
for (index in 0..100 step 3){
    Log.d("For", "현재 숫자는 ${index}")
}
"

downTo: 감소시키기
앞의 예제에서는 작은 수에서 큰 수로 값을 증가시키며 코드를 실행했는데, downTo를 사용하면 큰 수에서 작은 수로 감소시키면서
실행할 수 있다. 증가할 때와 같이 step을 사용할수도 있다.
"
for (index in 10 downTo 0) {
    Log.d("For", "현재 숫자는 ${index}")
}
"

배열, 컬렉션에 들어 있는 엘리먼트 반복하기
배열이나 컬렉션을 엘리먼트의 개수만큼 반복하면서 사용할 수 있다.
"
for(변수 in 배열 또는 컬렉션) {
    실행 코드
}
"
다음은 arrayMonth에 담겨 있는 엘리먼트들을 month 변수에 담은 후에 로그로 출력하는 예제다.
인덱스를 사용한느 방법보다 더 편하고 가독성도 좋다.
"
var arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
for (month in arrayMonth){
    Log.d("for", "현재 월은 ${month}입니다.")
}
"
 */