package com.hongdoc.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
주요 속성
srcCompat : 보여줄 이미지를 지정한다. 안드로이드 4버전 까지는 src였는데 백터 방식의 이미지(SVG,PSD 등)을 처리할 수 있는
기능을 추가하여 srcCompat로 변경하였다.

주요 메서드
setImageResource : res 폴더에 있는 이미지를 설정한다.
setImageBitmap : Bitmap 객체로 만들어진 이미지를 설정한다.
setImageDrawable : Drawable 객체로 만들어진 이미지를 설정한다.

Setimag
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

}