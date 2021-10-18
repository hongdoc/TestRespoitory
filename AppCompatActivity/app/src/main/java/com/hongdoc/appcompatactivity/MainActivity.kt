package com.hongdoc.appcompatactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hongdoc.appcompatactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //resultCode가 정상인지 체크하는 코드.
        if (resultCode == RESULT_OK){
            when (requestCode){
                99 -> {
            // 정상이라면 돌려받은 인텐트에서 메시지를 꺼내 변수에 저장해둡니다.
            val message = data?.getStringExtra("returnValue")
            // 해당 메시지를 Toast로 화면에 보여주는 코드를 작성한다. Toast는 화면에 잠깐 나타났다 사라지는 메시지 출력 도구입니다.
            // 메서드의 닫는 괄호()) 다음에 반드시 .show()를 호출해야지만 화면에 나타납니다.
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 인텐트 생성할 떄 호출할 클래스명 뒤에 '::class.java.'라고 정확하게 입력해야 함.
        // Intent 를 사용하기 위한 작성 규칙
        val intent = Intent(this, SubActivity::class.java)
        intent.putExtra("from1", "Hello Bundle")
        intent.putExtra("from2", 2021)
        //클릭리스너 코드 블록 안에서 startActivity() 메서드를 호출하면서 인텐트를 값으로 넘겨줍니다.
        // 간단하게 두 줄을 추가하는 것만 으로도 새로만든 액티비티를 실행 가능하다.
        binding.btnStart.setOnClickListener{ startActivityForResult(intent, 99) }
    }
}