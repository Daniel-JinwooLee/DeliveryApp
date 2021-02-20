package com.dj.baeminpractice.ui.c_favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dj.baeminpractice.R
import com.xwray.groupie.GroupieAdapter
import kotlinx.android.synthetic.main.fragment_delivering_now.view.*
import kotlinx.android.synthetic.main.fragment_recuriting_now.view.*

class DeliveringNowFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_delivering_now, container, false)
        val adapter = GroupieAdapter()

        val dummyshop = ShopInfo("하늘카페")
        view.recyclerView_delivering_now.layoutManager = LinearLayoutManager(activity)
        view.recyclerView_delivering_now.adapter = adapter

        adapter.add(DeliveringNowItem(dummyshop))
        adapter.add(DeliveringNowItem(dummyshop))
        adapter.add(DeliveringNowItem(dummyshop))




        return view       }

}