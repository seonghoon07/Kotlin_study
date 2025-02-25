package com.seonghoon.mango_contents

import android.os.Bundle
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
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/place/1468989042913905.jpg?w=307&h=300&c=Y",
                "권숙수"
            )
        )
        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/place/1468989042913905.jpg?w=307&h=300&c=Y",
                "권숙수"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}