package com.dj.baeminpractice.ui.c_favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dj.baeminpractice.R
import com.xwray.groupie.GroupieAdapter
import kotlinx.android.synthetic.main.fragment_record.view.*

class RecordFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_record, container, false)
        val adapter = GroupieAdapter()
        val dummyshop = ShopInfo("하늘카페")

        view.recyclerView_fragment_record.layoutManager = LinearLayoutManager(activity)
        view.recyclerView_fragment_record.adapter = adapter


        adapter.add(RecordItem(dummyshop))
        adapter.add(RecordItem(dummyshop))
        adapter.add(RecordItem(dummyshop))




        return view
    }

}