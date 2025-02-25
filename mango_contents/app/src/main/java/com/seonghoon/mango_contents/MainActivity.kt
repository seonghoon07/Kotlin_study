package com.seonghoon.mango_contents

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/place/1468989042913905.jpg?w=307&h=300&c=Y",
                "권숙수"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/323",
                "https://img.siksinhot.com/place/1530597402238010.jpg?w=307&h=300&c=Y",
                "새벽집"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/1541145",
                "https://img.siksinhot.com/place/1698721170760173.jpg?w=307&h=300&c=Y",
                "그리에"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/359640",
                "https://img.siksinhot.com/place/1637222638571692.jpg?w=307&h=300&c=Y",
                "울프강 스테이크하우스"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/place/1468989042913905.jpg?w=307&h=300&c=Y",
                "권숙수"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/323",
                "https://img.siksinhot.com/place/1530597402238010.jpg?w=307&h=300&c=Y",
                "새벽집"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/1541145",
                "https://img.siksinhot.com/place/1698721170760173.jpg?w=307&h=300&c=Y",
                "그리에"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/359640",
                "https://img.siksinhot.com/place/1637222638571692.jpg?w=307&h=300&c=Y",
                "울프강 스테이크하우스"
            )
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                startActivity(intent)
            }

        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}