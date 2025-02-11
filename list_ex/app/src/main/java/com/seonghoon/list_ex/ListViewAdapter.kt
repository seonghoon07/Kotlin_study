package com.seonghoon.list_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>): BaseAdapter() {
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
        var convertView = convertView

        if (convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = convertView!!.findViewById<TextView>(R.id.listviewitem)
        val content = convertView!!.findViewById<TextView>(R.id.listviewitem2)
        title.text = List[position].title
        content.text = List[position].content
        // List[0] -> listViewModel("a", "b")
        // List[1] -> listViewModel("c", "d")
        // List[2] -> listViewModel("e", "f")

        return convertView!!
    }
}