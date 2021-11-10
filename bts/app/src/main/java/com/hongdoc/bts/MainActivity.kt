package com.hongdoc.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //화면을 보여주는 코드.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면 클릭
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

        //2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여줌
        val intent = Intent(this, bts1Activity::class.java)
        startActivity(intent)
        }

        //7개 image들의 이름을 다 붙이고 클릭시 다른 액티비티 이동.
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image2.setOnClickListener {
            val intent = Intent(this, bts2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, bts3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, bts4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, bts5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, bts6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, bts7Activity::class.java)
            startActivity(intent)
        }


    }
}