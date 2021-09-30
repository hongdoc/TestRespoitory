package kr.co.hanbit.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.hanbit.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        binding.btnSay.setOnClickListener{
            binding.textSay.text = "hello kotlin!!!"
        }
    }
}