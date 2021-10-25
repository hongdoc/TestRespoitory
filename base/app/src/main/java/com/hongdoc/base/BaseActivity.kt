package com.hongdoc.base

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

//권한 처리를 하기 위해 액티비티의 기본기능 상속
abstract class BaseActivity: AppCompatActivity() {
    abstract fun permissionGranted(requestCode: Int)
    abstract fun permissionDenied(requestCode: Int)

    fun requirePermissions(permissions: Array<String>, requestCode: Int) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            permissionGranted(requestCode)
        } else {
            val isAllPermissionsGranted = permissions.all {
                checkSelfPermission(it) == PackageManager.PERMISSION_GRANTED
            }
            if (isAllPermissionsGranted) {
                permissionGranted(requestCode)
            } else {
                ActivityCompat.requestPermissions(this, permissions, requestCode)
            }
        }
    }
    override fun onRequestPermissionsResult(
        requestCode : Int,
        permissions: Array<out String>,
        grantResult: IntArray
    ){
        if(grantResult.all { it == PackageManager.PERMISSION_GRANTED}) {
            permissionGranted(requestCode)
        } else {
            permissionDenied(requestCode)
        }
    }
}