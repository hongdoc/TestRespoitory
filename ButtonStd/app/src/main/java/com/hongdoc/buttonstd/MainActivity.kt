package com.hongdoc.buttonstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.hongdoc.buttonstd.databinding.ActivityMainBinding

/*
srcCompat : 이미지 버튼 이미지를 설정한다.
OnClick : 사용자가 Button을 Click하면 발생하는 이벤트 이다.

kotlin 기반 안드로이드에서 이벤트 처리는 자바 기반 프로젝트와 동이랗다.
이벤트와 관련된 Listener 클래스를 구현하고 객체를 생성한 다음 메서드를 통해 View에 설정하면 된다.
추가적으로 이벤트와 관련된 메서드 대부분은 고차 함수로도 제공이 되는데 이를 이용하면 편하게 작성할 수 있다.
여러 view에 대한 처리를 동시에 할 경우에는 Listener를 추천하고 각각 따로 처리할 때는 고차 함수 방식을 추천한다.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            binding.text1.text = "다섯 번째 버튼을 눌렀습니다."
        }


        binding.button1.setOnClickListener {
            binding.text1.text = "첫 번째 버튼을 눌렀습니다."
        }
        binding.imageButton1.setOnClickListener {
            binding.text1.text = "두 번째 버튼을 눌렀습니다."
        }
        binding.button2.setOnClickListener {
            binding.text1.text = "세 번째 버튼을 눌렀습니다."
        }
        binding.button3.setOnClickListener {
            binding.text1.text = "네 번째 버튼을 눌렀습니다."
        }
    }

}