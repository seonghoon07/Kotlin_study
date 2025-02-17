package com.seonghoon.listview_second_ex

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
//
//        list_item.add("A")
//        list_item.add("B")
//        list_item.add("C")

        val list_item2 = mutableListOf<ListViewModel>()
        list_item2.add(ListViewModel("a", "b"))
        list_item2.add(ListViewModel("c", "d"))
        list_item2.add(ListViewModel("e", "f"))

        val listviewAdapter = ListViewAdapter(list_item2)

        val listview = findViewById<ListView>(R.id.mainListView)
        listview.adapter = listviewAdapter

        listview.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, list_item2[position].text1, Toast.LENGTH_SHORT).show()

        }
    }
}