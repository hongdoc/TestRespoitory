package com.hongdoc.permission


import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.hongdoc.permission.databinding.ActivityMainBinding
import android.Manifest

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnCamera.setOnClickListener{
            checkPermission()
        }
    }

    //권한을 확인하는 checkPermission 메서드 생성
    fun checkPermission() {
        // 카메라 권한의 승인 상태 가져오기
        val cameraPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        if (cameraPermission == PackageManager.PERMISSION_GRANTED) {
            // 1 승인이면 프로그램 진행
            startProcess()
        } else {
            // 2 미승인이면 권한 요청
            requestPermission()
        }
    }
        fun requestPermission(){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 99)
        }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray){
        when (requestCode){
            99 -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startProcess()
                } else {
                    finish()
                }
            }
        }
    }
    fun startProcess(){
        Toast.makeText(this, "카메라를 실행합니다.", Toast.LENGTH_LONG).show()
    }
}