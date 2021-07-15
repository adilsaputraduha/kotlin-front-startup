package com.example.front_startup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.front_startup.R

class Horizontal_RCV: RecyclerView.Adapter<Horizontal_RCV.MyViewHolder>() {

    private val images = intArrayOf(
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg,
        R.drawable.agrio_logo_no_bg
    )

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView

        init{
            itemImage = itemView.findViewById(R.id.rcvimgplace)

            itemView.setOnClickListener { v: View ->

            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv_col, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, i: Int) {
        holder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return images.size
    }


}