package com.hongdoc.mysampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hongdoc.mysampleapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 현재 유저의 uid값을 가져와
        Toast.makeText(this, auth.currentUser?.uid.toString(), Toast.LENGTH_LONG).show()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val joinBtnClicked = findViewById<Button>(R.id.joinBtn)
        joinBtnClicked.setOnClickListener {

            //첫번째 방법
//            val email = findViewById<EditText>(R.id.emailArea)
//            val pwd = findViewById<EditText>(R.id.pwdArea)

            //두번째 방법
            val email = binding.emailArea
            val pwd = binding.pwdArea
          //회원가입.
            auth.createUserWithEmailAndPassword(email.text.toString(), pwd.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
                    }
                }
        }
        //로그아웃.
        binding.logoutBtn.setOnClickListener {
            auth.signOut()
            Toast.makeText(this, auth.currentUser?.uid.toString(), Toast.LENGTH_LONG).show()
        }
        //로그인.
        binding.loginBtn.setOnClickListener {

            val email = binding.emailArea
            val pwd = binding.pwdArea

            auth.signInWithEmailAndPassword(email.text.toString(), pwd.text.toString())

                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show()
                        Toast.makeText(this, auth.currentUser?.uid.toString(), Toast.LENGTH_LONG).show()

                        val intent = Intent(this, BoardListActivity::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
                    }
                }
        }
    }

}