package com.example.kotlindemo.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlindemo.R
import com.example.kotlindemo.bean.Food

class MyAdapter(val context:Context,val list: List<Food>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val foodImage =
            LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(foodImage)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val food = list[position]
        //用Glide加载
        Glide.with(context).load(food.imageId).placeholder(R.drawable.ic_launcher_background).into(holder.foodImage)
        holder.foodDetail.text = food.detail
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.image)
        val foodDetail: TextView = itemView.findViewById(R.id.detail)
    }

}