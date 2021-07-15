package com.example.front_startup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.front_startup.R

class Horizontal_RCV_dua: RecyclerView.Adapter<Horizontal_RCV_dua.ViewHolder>() {

    private val img = intArrayOf(
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

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImg: ImageView

        init {
            itemImg = itemView.findViewById(R.id.rcvimgplacess)

            itemView.setOnClickListener{ v: View ->

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Horizontal_RCV_dua.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv_col_kedua, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Horizontal_RCV_dua.ViewHolder, position: Int) {
        holder.itemImg.setImageResource(img[position])
    }

    override fun getItemCount(): Int {
        return img.size
    }
}