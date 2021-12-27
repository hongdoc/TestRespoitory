package com.hongdoc.mysampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BoardWriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_write)

        val writeBtn = findViewById<Button>(R.id.writeUploadBtn)
        writeBtn.setOnClickListener {

            val writetext = findViewById<EditText>(R.id.writeTextArea)

            // Write a message to the database
            //database가 저장될 위치를 정해주는 것
            val database = Firebase.database
            val myRef = database.getReference("board")

            myRef.push().setValue(
                Model(writetext.text.toString())
            )

        }

    }

}