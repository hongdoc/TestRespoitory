 package com.hongdoc.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
                "https://www.mangoplate.com/restaurants/0Dc83nt2DQsa",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/593796_1471281207718379.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "다정도병인양"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/8_V151r3Zgqe",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/584479_1479740575442069.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "유키가후루"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/yT6tRfkdamSG",
                "https://mp-seoul-image-production-s3.mangoplate.com/231804/627630_1529537247599_108676?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "춘천막국수"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/AiPzUgBBHN",
                "https://mp-seoul-image-production-s3.mangoplate.com/14226/855261_1623556447640_8972?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "대보명가"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/Zy0b5FFvV_",
                "https://mp-seoul-image-production-s3.mangoplate.com/187830/1528015_1613477437974_3894?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "히피스베이글"
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
                "https://www.mangoplate.com/restaurants/0Dc83nt2DQsa",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/593796_1471281207718379.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "다정도병인양"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/8_V151r3Zgqe",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/584479_1479740575442069.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "유키가후루"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/yT6tRfkdamSG",
                "https://mp-seoul-image-production-s3.mangoplate.com/231804/627630_1529537247599_108676?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "춘천막국수"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/AiPzUgBBHN",
                "https://mp-seoul-image-production-s3.mangoplate.com/14226/855261_1623556447640_8972?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "대보명가"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/Zy0b5FFvV_",
                "https://mp-seoul-image-production-s3.mangoplate.com/187830/1528015_1613477437974_3894?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "히피스베이글"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int){

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                intent.putExtra("title",items[position].titleText)
                intent.putExtra("imageUrl",items[position].titleImageUrl)
                startActivity(intent)

            }
        }

        recyclerview.layoutManager = GridLayoutManager(this, 2)

    }

}