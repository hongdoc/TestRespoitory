package com.hongdoc.appcompatactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hongdoc.appcompatactivity.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.to1.text = intent.getStringExtra("from1")
        binding.to2.text = "${intent.getIntExtra("from2", 0)}"

        // 서브 액티비티가 종료될 때 자신을 호출했던 액티비티로 값을 돌려주는 코드.
        binding.btnClose.setOnClickListener {
            // 리스너 블록 안에 호출한 메인 액티비티에 돌려줄 인텐트를 하나 생성하고 변수에 저장한다.
            val returnIntent = Intent()
            returnIntent.putExtra("retrunValue", binding.editMessage.text.toString())
            // returnIntent와 상태 값을 setResult() 메서드에 담아서 실행하면 호출한 측으로 전달된다.
            // 상태 값은 RESULT_OK와 RESULT_CANCELED로 안드로이드에 이미 상수로 정의되어 있습니다.
            // 처리한 결괏값에 따라 성공이면 ok를, 실패하거나 취소되었으면 CANCELED를 사용하면 됩니다.
            // setResult() 메서드의 첫 번째 파라미터가 상태 값, 두 번째가 전달하려는 인텐트 입니다.
            setResult(RESULT_OK, returnIntent)
            //finish() 메서드를 호출하면 서브 액티비티가 종료되면서 메인 액티비티에 값이 전달 된다.
            finish()
        }
    }
}