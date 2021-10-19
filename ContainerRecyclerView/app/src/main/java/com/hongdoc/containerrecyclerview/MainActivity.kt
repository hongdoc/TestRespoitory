package com.hongdoc.containerrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hongdoc.containerrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 1. 데이터를 생성한다.
        val data:MutableList<Memo> = loadData()
        // 2. 만든 데이터롤 아답터를 생성한다.
        var adapter = CustomAdapter()
        adapter.listData = data
        // 3. 리사이클러뷰에 어답터를 연결한다.
        binding.recyclerView.adapter = adapter
        // 4. 리사이클러뷰에 레이아웃매니저를 연결한다.

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun loadData(): MutableList<Memo>{
        val data: MutableList<Memo> = mutableListOf()
        for (no in 1..100){
            // 개별 데이터 생
            val title = "공부좀 더하자 성원아 ${no}"
            val date = System.currentTimeMillis()
            // 100개의 Memo 클래스를 생성한다.
            var memo = Memo(no, title, date)
            // 데이터 배열에 담는다.
            data.add(memo)
        }
        return data;
    }
}
