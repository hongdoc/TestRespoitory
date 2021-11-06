package com.hongdoc.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
코틀린 액티비티 생명주기

액티비티는 안드로이드 어플 4대 구성요소의 한 가지로 UI를 나타내는 컴포넌트이다.
유저들에게 직접적으로 보여지는 부분인 만큼 굉장히 중요하다. 액티비티는 스택의 형태로 저장되어 사용된다.
1. intent flag를 사용하거나
2. launchMode 속성 설정을 이용하여 액티비티의 생성/ 소멸/ 표시 등의 관리를 할 수 있다.
어플리케이션은 본디 필연적으로 여러 액티비티가 정보를 주고 받으며 계속 번갈아가면서 표시되는 환경이다.
따라서 생성 -> 중지 -> 소멸, 생성 -> 중지 -> 소멸 이라는 액티비티 관리는 굉장한 비효율을 낳게된다.
뿐만 아니라 appdㅣ 원하는 상황이 아니라 시스템이 강제로 지시하는 상황이 생길 수 있으므로 그때마다 app에 상황을 알려주어
필요한 일들을 처리할 수 있도록 한다.


1. onCreate() 메소드는 액티비티가 실행될 때 처음으로 호출되는 메소드이다. 안드로이드 스튜디오에서 기본 Activity를 만들면 이 메소드가 같이 만들어 진다. setContentView()를 이용하여 레이아웃을 inflate 시킨다.
2.onStart() 메소드는 액티비티가 실행되고 화면에 보이기 직전에 호출되는 메소드이다. 이 메소드 호출 이후에는 화면에 액티비티가 출력된다. 동작할 수 있는 준비 단계이다.
3.onResume() 메소드는 액티비티가 사용자와 상호작용하기 전에 호출된다.
4.onRestart() 메소드는 액티비티가 중지된 이후 다시 시작되기 전에 호출된다. 이 메소드 이후엔 onStart()메소드가 출력된다.
5.onPause() 메소드는 다른 액티비티를 시작하려고 할 때 호출된다.(액티비티가 화면에서 사라지는 단계)
저장되지 않은 데이터나 작업을 중지하고 이를 빠르게 저장후 리턴해준다. 이 과정이 끝나야 다음 액티비티 실행이 가능하다. 시스템은 액티비티를 강제 종료할 수 있다.
6.onStop(): 액티비티가 사용자에게 더 이상 보이지 않을 때 호출된다.
7.onDestroy(): 액티비티가 소멸되어 없어지기 전에 호출된다.
 */