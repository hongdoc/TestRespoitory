package com.hongdoc.iphone_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.iphone_image_1)
        image1.setOnClickListener {

            Toast.makeText(this, "클릭완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, iPhoneActivity::class.java)
            startActivity(intent)
        }


    }

}