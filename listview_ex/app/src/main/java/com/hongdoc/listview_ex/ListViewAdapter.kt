package com.hongdoc.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // listview_item에 있는 아이템을 가져오는 코드.
        var converView = convertView

        if (converView == null){
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = converView!!.findViewById<TextView>(R.id.listviewItem)
        val content = converView!!.findViewById<TextView>(R.id.listviewItem2)
        //List에 하나씩 들어가게 하는부분
        title.text = List[position].title
        content.text= List[position].content
        // List[0] -> ListViewModel("a", "b")
        // List[1] -> ListViewModel("c", "d")
        // List[2] -> ListViewModel("e", "f")

        return converView!!

    }
}