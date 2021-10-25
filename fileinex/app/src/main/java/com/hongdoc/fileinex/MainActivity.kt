package com.hongdoc.fileinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        내부 저장소 : Internal Storage
        외부 저장소 : External Storage

        외부 저장소 읽기 권한
        <uses-permission android:name = "android.permission.READ_EXTERNAL_STORAGE"/>

        외부 저장소 쓰기 권한
        <uses-permission android:name = "android.permission.WRITE_EXTERNAL_STORAGE"/>

        파일 사용하기
        val file = File("경로")

        다른 방법
        val file = File(baseContext.filesDir, "파일명")

        액티비티의 경우 filesDir이 기본 프로퍼티 이다.
        val file = File(filesDir, "파일명")

        exists - File의 존재 여부를 확인합니다.
        if (file.exists()) {
            Log.d("File", "파일이 존재합니다.")
        }

        isFile - File의 생성자에 젅달된 경로가 파일인지 확인합니다.
        if (file.isFile){
            Log.d("File", "파일입니다.")
        }

        isDirectory - File의 생성자에 전달된 경로가 디렉터리인지를 확인합니다.
        if (file.isDirectory){
            Log.d("File", "디렉터리입니다.")
        }

        name - 생성된 파일 또는 디렉터리의 이름을 반환합니다.
        Log.d("File", "이 파일(디렉터리)의 이름은 ${file_name}입니다.")

        createNewFile() - 해당 경로에 파일이 존재하지 않으면 createNewFile()로 파일을 생성하며 보통 exists()와 함께 사용
        if (!file.exists()) {
            file.createNewFile()
        }

        mkdirs() - 디렉터리를 생성합니다. 생성하려는 디렉터리의 중간 경로도 함께 생성합니다.
        if (!file.exists()){
            file.mkdirs()
        }

        delete() - 파일이나 디렉터리를 삭제합니다. 디렉터리의 경우 내부에 파일이 존재한다면 삭제되지 않습니다.
        file.delete()

        absolutePath - 파일 또는 디렉터리의 절대경로를 반환합니다. 절대경로는 시스템의 루트(/)부터 시작하는 경로
        입니다. 일반적으로 파일을 저장하거나 읽을 때는 절대경로를 기준으로 사용합니다.
        Log.d("File", "이 파일(디렉터리)의 절대경로는 ${file.absolutePath}입니다.")



         */
    }
}