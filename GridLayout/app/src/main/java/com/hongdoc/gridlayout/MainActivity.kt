package com.hongdoc.gridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
GridLayout
    Grid를 설정하여 view를 배치하는 layout이다.
    TableLayout을 보완하기 위해 제공되는 layout이다.

    rowCount : 그리드 레이아웃의 줄의 개수
    columnCount : 그리드 레이아웃의 칸의 개수

    layout_column : View가 배치될 칸의 위치 (0부터 시작)
    layout_row : View가 배치될 줄의 위치 (0부터 시작)
    layout_columnSpan : View가 차지할 칸의 수
    layout_rowSpan : View가 차지할 줄의 수
    layout_columnWeight : 남은 공간을 차지할 가로 비율
    layout_columnHeight : 남은 공간을 차지할 세로 비율

    GridLayout은 Grid 형태로 View를 배치하는 Layout이다.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}