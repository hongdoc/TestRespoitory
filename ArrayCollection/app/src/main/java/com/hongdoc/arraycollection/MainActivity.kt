package com.hongdoc.arraycollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*

1. 배열
여러 개의 값을 담을 수 있는 대표적인 자료형인 배열(Array)은 값을 담기 전에 먼저 배열 공간의 개수를 할당하거나 초기화 시에
데이터를 저장해두면 데이터의 개수만큼 배열의 크기가 결정된다. 먼저 개수를 정해놓고 사용해야 하며 중간에 개수를 추가하거나
제거할 수 없다.

배열(Array)은 다른 데이터 타입과 마찬가지로 변수에 저장해서 사용한다.
"
var 변수 = Array(개수)
"

배열 객체는 Int, Long, Char 등과 같은 기본 타입뒤에 Array를 붙여서 만든다.
"
var students = IntArray(10)
var longArray = LongArray(10)
var CharArray = CharArray(10)
var FloatArray = FloatArray(10)
var DoubleArray = DoubleArray(10)
"

String은 기본 타이 아니기 때문에 StringArray는 없지만 다음과 같이 사용할 수 있다.
"
var stringArray = Array(10, {item->""})
"

arrayOf 함수를 사용해서 String 값을 직접 할당할 수 있다.
"
var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
"

배열에 값 입력하기
다음 배열의 인덱스에 있는 값을 바꾸는 방법을 다른방식으로 표현한 것이다.두 방식은 표현식만 다를 뿐 동일한 코드이다.
"
배열명[인덱스] = 값
students[0] = 90
배열명.set(인덱스, 값)
students.set(1,91)
"
배열에 있는 값 꺼내기
값을 입력할 때와 같은 방식으로 인덱스로 값을 가져올 수 있다. 저장할 떄와 마찬가지로 대괄호 안에 인덱스를 입력해서
가져올 수 있으며 값을 꺼내는 배열의 함수는 get()이다.
"
배열명[인덱스]
var seventhValue = intArray[6]
배열명.get(인덱스)
var tenthValue = intArray.get(9)
"

2. 컬렉션
여러 개의 값을 넣을 수 있는 자료형에는 배열 외에도 컬렉션이 있다. 컬렉션은 다른 이름으로 동적 배열이라고도 하는데
이는 배열과는 다르게 공간의 크기를 처음 크기로 고정하지 않고 임의의 개수를 담을 수 있기 떄문이다.
컬렉션은 크게 세가지로 List, Map, Set 이 있으며 각각은 다른 용도로 사용한다.

2-1. 리스트
List는 저장되는 데이터에 인덱스를 부여한 컬렉션이며 중복된 값을 입력할 수 있습니다. 코틀린에서 동적으로 리스트를
사용하기 위해서는 리스트 자료형 앞에 뮤터블(Mutable)이라는 접두어(Prefix)가 붙는다.
접두어가 없는 리스트도 있지만 잘 사용하지 않기 때문에 항상 mutableList, mutableMap, mutableSet을 사용한다.
사용법은 Array와 같이 '데이터 타입Of' 형태로 사용할 수 있다.
"
var list = mutableListOf("MON", "TUE", "WED")
"

리스트 생성하기: mutableListOf

다음처럼 생성하면 동적배열 리스트가 생성된다.
"
var mutableList = mutableListOf("MON", "TUE", "WED")
"

리스트에 값 추가하기: add
mutableList 변수에 add함수를 사용해서 값을 추가한다. 값이 추가되면서 동적으로 리스트의 공간이 자동으로 증가한다.
"
mutableList.add("TUE")
"
add 함수를 사용하면 입력될 위치인 인덱스를 따로 지정해주지 않아도 입력되는 순서대로 인덱스가 지정된다.

리스트에 입력된 값 사용하기: get
get 함수로 리스트에서 값을 꺼낼 수 있다. 입력할 때와는 다르게 사용할 떄는 인덱스를 지정해서 몇 번째 값을 꺼낼 것인지
명시해야 된다.
"
var variable = mutableList.get(1)
"

리스트값 수정하기: set
set 함수를 사용해서 특정 인덱스의 값을 수정할 수 있다.
"
mutableList.set(1, "수정할 값")
"

리스트에 입력된 값 제거하기: removeAt
removeAt 함수로 리스트에 입력된 값의 인덱스를 지정해서 삭제할 수 있다.
"
mutableList.removeAt(1)
"
두번째 값을 삭제하면 세번째 값부터 인덱스가 하나씩 감소하면서 빈자리의 인덱스로 이동한다.

컬렉션 개수 가져오기: size
size 프로퍼티를 사용하면 컬렉션의 개수를 가져올 수 있다.
"
mutableList.size
"
앞에서 set, get 등은 '함수'라고 하고, size는 '프로퍼티'라는 용어를 사용했는데 이 둘을 구분하는 방법은 괄호의 유무이다.
괄호가 있으면 함수, 괄호가 없으면 프로퍼티라고 알고 있으면 된다.

2-2. 셋
Set은 중복을 허용하지 않는 리스트라고 할 수 있다. List와 유사한 구조이지만 인덱스로 조회할 수 없고, get 함수도 지원하지 않는다.
String 타입의 값을 입력받기 위해 다음과 같이 선언할 수 있다.
"
var set = mutableSetOf<String>()
"

Set 사용하기
Set은 인덱스로 조회하는 함수가 없기 때문에 특정 위치의 값을 직접 사용할 수 없다.
"
Log.d("Collection", "Set 전체 출력 = ${set}")
"

Set 삭제하기
Set은 값이 중복되지 않기 때문에 값으로 직접 조회해서 삭제할 수 있다.
"
set.remove("FEB")
"

2-3. 맵

Map 생성하기
Map은 Key와 Value의 쌍으로 입력되는 컬렉션이다. Map의 Key는 List의 인덱스와 비슷한데 Map에서는 Key를 직접 입력해야된다.
제네릭으로 키와 값의 데이터 타입을 지정해서 Map을 생성한다.
"
var map = mutableMapOf<String, String>()
"
인덱스에 해당하는 키를 직접 지정해서 사용해야 한다.

빈 맵으로 생성하고 값 추가하기
값을 추가하기 위해 제공되는 Map에서 제공되는 put 함수에 키와 값을 입력하면 된다.
"
var map = mutableMapOf<String, String>()
map.put("키1", "값2")
map.put("키2", "값2")
map.put("키3", "값3")
"
키와 값을 추가할 때마다 리스트처럼 공간이 늘어난다.

맵 사용하기
get 함수에 키를 직접 입력해서 값을 꺼낼 수 있다.
"
Log.d("CollectionMap", "map에 입력된 키1의 값을 ${map.get("키1")}입니다."
"

맵 수정하기
put 함수를 사용할 떄 동일한 키를 가진 값이 있으면 키는 유지된 채로 그 값만 수정된다.
"
map.put("키2", "수정")
"

맵 삭제하기
remove 함수에 키를 입력해서 값을 삭제할 수 있다. 리스트와는 다르게 인덱스에 해당하는 키의 값이 변경되지 않고 그대로 유지된다.
"
map.remove("키2")
"

3. 이뮤터블 컬렉션
코틀린은 일반 배열처럼 크기를 변경할 수 없으면서 값 또한 변경할 수 없는 이뮤터블 컬렉션(Immutable Collection)을 지원한다.
이뮤터블 컬렉션은 기존 컬렉션에서 mutable이라는 접두어가 제거된 형태로 사용된다.
"
var list = mutableListOf("1", "2") -> var list = listOf("1", "2")
"

불변형 컬렉션은 한 번 입력된 값을 변경할 수 없기 때문에 add나 set 함수는 지원하지 않고 최초 입력된 값을 '사용'만 할 수 있다.
배열과 다른점은 크기뿐만 아니라 값의 변경 또한 불가능하다는 것이다. 즉 불변형 컬렉션은 수정, 추가, 제거 모두 안된다.
"
val IMMUTABLE_LIST = listOf("JAN", "FEB", "MAR") // 생성
Log.d("Collection", "리스트의 두 번째 값은 ${IMMUTABLE_LIST.get(1)}입니다.") // 사용
"

그렇다면 이뮤터블 컬렉션은 언제 사용할 수 있을까?

일반 변수 var와 읽기 전용 변수 val의 관계에서 그 사용법을 유추할 수 있는데, 기준이 되는 어떤 값의 모음을 하나의 변수에
저장할 필요가 있거나 또는 여러 개의 값을 중간에 수정하지 않고 사용할 필요가 있을 때 이뮤터블 컬렉션을 사용한다.
대표적인 예로 요일 데이터가 있다.

이뮤터블 컬렉션을 저장할 때는 val로 선언하고 변수명을 대문자로 표시하는게 좋다. Set과 Map도 동일하게 사용한다.


배열(Array) : 하나의 변수에 여러 개의 정해진 값을 담을 수 있게 해주는 데이터 타입 입니다. 처음 정해진 값의 개수는 바꿀 수 없다.
컬렉션(Collection) : 여러개의 값을 담을 수 있는 배열은 값의 개수가 증가하면 사용할 수 없는 단점이 있기 때문에 동적으로 크기를
                    변경할 수 있도록 만들어진 동적 배열이다. 동적 배열에는 크게 List, Set, Map 세가지의 데이터 타입이
                    있으며 이것들을 모두 통칭해서 부르는 용어가 컬렉션 이다.
뮤터블(Mutable) : 입력된 값을 변경할 수 있는 것을 말한다. 대표적으로 var로 선언된 변수는 모두 뮤터블이다.
리스트(List) : 컬렉션의 한 종류로 인덱스를 사용하는 데이터 타입이다. 인덱스가 있기 떄문에 중복된 값을 넣을 수 있다.
셋(Set) : 리스트에서 인덱스가 빠진 데이터 타입이다. 값을 중복해서 넣을 수 없다.
맵(Map) : Key와 Value을 쌍으로 갖는 데이터 타입이다. 맵의 Key는 리스트의 인덱스처럼 사용할 수 있다.

 */