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


class HomeFragment1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home1, container, false)



        return view
    }


}