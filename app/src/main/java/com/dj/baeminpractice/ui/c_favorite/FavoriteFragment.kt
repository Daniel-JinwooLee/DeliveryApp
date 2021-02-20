package com.dj.baeminpractice.ui.c_favorite

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dj.baeminpractice.R
import com.dj.baeminpractice.databinding.FragmentFavoriteBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_favorite.view.*

class FavoriteFragment: Fragment(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_favorite, container, false)

        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(RecruitingNowFragment(),"모집중인 방")
        adapter.addFragment(DeliveringNowFragment(),"진행중인 배달")
        adapter.addFragment(RecordFragment(),"과거 주문내역")
        view.c_viewPager.adapter = adapter
        view.c_tablayout.setupWithViewPager(view.c_viewPager)

        Log.d("FavoriteFragment", "onCreateView 호출됨. "+"fragment 개수 : "+adapter.count.toString())

        return view
    }
}