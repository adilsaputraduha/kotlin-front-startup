package com.example.front_startup.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.front_startup.R
import com.example.front_startup.adapter.AdapterSlider
import com.example.front_startup.adapter.Horizontal_RCV
import com.example.front_startup.adapter.Horizontal_RCV_dua
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Horizontal_RCV
    private lateinit var adapterdua: Horizontal_RCV_dua

    lateinit var vpSlider: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        //Star Recycler View Horizontal
        recyclerView = view.findViewById(R.id.horRCVsatu)
        adapter = Horizontal_RCV()

        recyclerView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = adapter

        recyclerView = view.findViewById(R.id.horRCVdua)
        adapterdua = Horizontal_RCV_dua()

        recyclerView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapterdua
        //End Recycler View Horizontal

        //Start View Page Slider
        vpSlider = view.findViewById(R.id.vp_slider)

        var arraySlider = ArrayList<Int>()
        arraySlider.add(R.drawable.vp_slider_1)
        arraySlider.add(R.drawable.vp_slider_2)
        arraySlider.add(R.drawable.vp_slider_3)

        val adapterslider = AdapterSlider(arraySlider, activity)
        vpSlider.adapter = adapterslider
        //End View Page Slider

        return view
    }



}