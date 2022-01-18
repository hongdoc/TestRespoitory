package com.hongdoc.edittextstd

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.hongdoc.edittextstd.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

/*
속성
text : EditText에 표시할 문자열을 설정한다.
hint : 입력된 값이 없을 경우 표시할 안내 문구를 설정한다.
inputType : 입력 값에 대해 설정한다. 표시된느 형식, 나타나는 키보드 등에 영향을 준다.
imeOptions : 나타나는 키보드의 Enter 키 모양을 설정한다.

TextWatcher : 사용자가 입력한 내용을 실시간으로 감시한다.
EditorAction : 키보드의 Enter 키를 눌렀을 때 발생하는 이벤트

EditText는 사용자에게 문자열 갑승ㄹ 입력 받을 수 있는 View 이다.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = editText.text

            var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editText.windowToken, 0)

            editText.clearFocus()
        }
        editText.addTextChangedListener(listener1)

        editText.setOnEditorActionListener{
            v, actionId, event ->
            textView.text = "엔터 버튼을 눌렀습니다."
            textView2.text = editText.text
            false
        }
    }

    val listener1 = object : TextWatcher {
        //문자열이 변경되기 전
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            textView.text = "before : + $p0"

        }

        // 문자열 변경 작업이 완료되었을 때
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            textView2.text = "Changed : $p0"
        }

        // 변경된 문자열이 화면에 반영되었을 때
        override fun afterTextChanged(p0: Editable?) {
            textView3.text = "after : $p0"
        }
    }
}