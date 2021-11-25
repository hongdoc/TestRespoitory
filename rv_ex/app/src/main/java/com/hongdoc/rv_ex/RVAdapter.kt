package com.hongdoc.rv_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// 리사이클러뷰의 Adapter
class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>(){

    //리사이클러뷰의 아이템을 불러온다
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    interface ItemClick {
        fun onClick(view : View, position: Int)
    }
    var itemClick : ItemClick? = null

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {

        if(itemClick != null) {
            holder.itemView.setOnClickListener { v ->
                itemClick?.onClick(v, position)
            }
        }
        holder.bindItems(items[position])
    }

    // 전체 리사이클러뷰의 갯수.
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : String){
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }
    }
}