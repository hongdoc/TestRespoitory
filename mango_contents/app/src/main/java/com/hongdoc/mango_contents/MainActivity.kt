 package com.hongdoc.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/l0JdGHGMmsel",
                "https://mp-seoul-image-production-s3.mangoplate.com/872233_1595994610070732.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
            "스시요로코부"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/l0JdGHGMmsel",
                "https://mp-seoul-image-production-s3.mangoplate.com/872233_1595994610070732.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "스시요로코부"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/l0JdGHGMmsel",
                "https://mp-seoul-image-production-s3.mangoplate.com/872233_1595994610070732.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "스시요로코부"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        recyclerview.layoutManager = GridLayoutManager(this, 2)

    }

}