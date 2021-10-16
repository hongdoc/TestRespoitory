package com.hongdoc.widgetsprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hongdoc.widgetsprogressbar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //앱이 실행되고 3초후에 showProgress(false)를 호출하는 코드.
        thread(start=true){
            Thread.sleep(3000) // 3000 밀리초 = 3초
            runOnUiThread{
                showProgress(false)
            }
        }


    }
    //리니어 레이아웃을 숨겼다 보였다 할 수 있는 코드
    fun showProgress(show: Boolean){
        if (show){
            binding.progressLayout.visibility = View.VISIBLE
        } else {
            binding.progressLayout.visibility = View.GONE
        }
    }
}