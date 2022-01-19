package com.hongdoc.textinputlayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

/*

EditText를 보완한 View이다.
EditText의 속성, 이벤트, 프로퍼티 등을 그대로 사용하며 몇 가지 요소가 추가되었다.

hint : 입력한 내용이 없으면 보여줄 안내 메세지 이다. EditText와 다르게 문자열을 입력하면 상단 부분으로 올라간다.
counterEnabled : 입력한 글자의 수가 나타난다.
counterMaxLength : 지정한 글자수를 넘으면 붉은 색으로 표시해 준다.

주요 프로퍼티
editText : TextInputLayout이 가지고 있는 EditText 객체의 주소 값
error : 오류로 표시할 메시지를 설정한다.

정리
TextInputLayout은 EditText에 몇가지 기능을 추가한 입력 요소 이다.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = textInputLayout.editText?.text

            textInputLayout.editText?.clearFocus()

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(textInputLayout.editText?.windowToken, 0)
        }
        textInputLayout.editText?.addTextChangedListener(listener1)
    }

    val listener1 = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            if(p0 != null){
                if(p0.length > 10){
                    textInputLayout.error = "10글자 이하로 입력해주세요"
                } else {
                    textInputLayout.error = null
                }
            }
        }
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }






    }

}