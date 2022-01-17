package com.hongdoc.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*
RelativeLayout
Parent나 다른 View와의 관계를 설정하여 배치하는 layout이다.
Relative Layout에는 특별한 속성이 없지만 배치되는 view들의 속성을 이용해 배치를 결정하게 된다.

layout_alignParentTop : 자신의 상단을 parent의 상단 부분과 일치 시킨다.
layout_alignParentBottom : 자신의 하단을 parent 의 하단 부분과 일치 시킨다.
layout_alignParentLeft : 자신이 좌측 부분을 parent의 좌측 부분과 일치 시킨다.
layout_alignParentRight : 자신의 우측 부분을 parent의 우측 부분과 일치 시킨다.
layout_alignWithParentMissing : 다른 View를 정렬 기준으로 설정하였을 경우 기준으로 설정한 View가 없을 때는 parent를
기준으로 정렬하게 된다.
layout_centerHorizontal : 세로 방향의 중앙에 정렬
layout_centerVertical : 가로 방향의 중앙에 정렬
layout_centerInParent : 가로 세로 모두 중앙에 정
layout_alignTop : 자신의 상단 부분을 지정된 view의 상단 부분에 일치 시킨다.
layout_alignBottom : 자신의 하단 부분을 지정된 view의 하단 부분에 일치 시킨다.
layout_alignLeft : 좌측 부분에 일치
layout_alignRigth : 우측 부분에 일치
layout_alignBaseline : 자신의 Baseline 부분과 지정된 view의 Baseline을 일치 시킨다.
layout_above : 지정된 view 상단에 배치한다.
layout_below : 지정된 view 하단에 배치
layout_toRightOf : 지정된 view 우측에 배치
layout_toLeftOf : 지정된 view 좌측에 배치

RelativeLayout은 Parent 나 다른 View 와의 관계를 설정하여 배치한다..sdasd
dsadsadsad
 */


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}