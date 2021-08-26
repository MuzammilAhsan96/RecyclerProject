package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(private val items:ArrayList<DataClass>): RecyclerView.Adapter<RecAdapter.ItemViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder1 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ItemViewHolder1(view)

    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onBindViewHolder(holder: ItemViewHolder1, position: Int) {
        holder.titleImage.setImageResource(items[position].image)
        holder.tview.text = items[position].name
        if (items[position].b)
            holder.swit.isChecked = true
        else
            holder.swit.isChecked = false


        holder.swit.setOnClickListener {
            println("DATA OLD ${items[position].b} Position ${position}")

            items[position].b = !items[position].b

            println("DATA NEW ${items[position].b} Position ${position}")
        }
    }

  inner  class ItemViewHolder1(itemView:View): RecyclerView.ViewHolder(itemView)
    {
        var titleImage: ImageView = itemView.findViewById(R.id.img1)
        val tview:TextView = itemView.findViewById(R.id.tv1)
        val swit: Switch = itemView.findViewById(R.id.myswitch)
    }
}
