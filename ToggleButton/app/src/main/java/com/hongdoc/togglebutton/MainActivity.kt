package com.hongdoc.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/*
ToggleButton
환경설정 같은 화면에서 애플리케이션의 기능을 ON/OFF 하는 기능을 제공하고자 할 때 사용한다.

지금은 더 보기 좋은 View들이 많이 생겨 많이 사용하지는 않는다.

.
주요 속성

textOn : ON 상태 일 때 표시할 문자열을 설정한다.
textOff : OFF 상태 일 때 표시할 문자열을 설정한다.

isChecked : ON/OFF 상태 여부 값을 ON이면 true, OFF이면 false.

toggle : 현재의 토글 상태를 반전시킨다.

click : Toggle 버튼을 클릭하면 발생하는 이벤트

toggleBuitton은 ON/OFF 상태를 설정할 수 있는 View 이다.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(toggleButton.isChecked == true){
                textView.text = "ON 상태 입니다."
            } else {
                textView.text = "OFF 상태 입니다."
            }
        }
        button2.setOnClickListener {
            toggleButton.isChecked = true
        }
        button3.setOnClickListener {
            toggleButton.isChecked = false
        }
        button4.setOnClickListener {
            toggleButton.toggle()
        }
        toggleButton.setOnClickListener(listener)

        //고차 함수
        toggleButton2.setOnClickListener {
            if(toggleButton2.isChecked == true){
                textView2.text = "ON 상태로 설정되었습니다."
            } else {
                textView2.text = "OFF 상태로 설정되었습니다."
            }
        }
    }

    val listener = object : View.OnClickListener{
        override fun onClick(p0: View?) {
            if(toggleButton.isChecked == true){
                textView.text = "ON 상태로 설정되었습니다."
            } else {
                textView.text = "OFF 상태로 설정되었습니다."
            }
        }
    }

}