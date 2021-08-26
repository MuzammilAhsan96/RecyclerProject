package com.example.recyclerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     private lateinit var rcv: RecyclerView
    private lateinit var adapter: RecAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = fetchData()
        adapter = RecAdapter(items)
        rcv = findViewById(R.id.rv1)
        rcv.setHasFixedSize(true)
        rcv.adapter = adapter
    }
    private fun fetchData():ArrayList<DataClass>
    {
        val list =ArrayList<DataClass>()
        for(i in 0..100)
        {
            list.add(DataClass(R.drawable.rocket,"Item $i"))
        }
        return list
    }
}