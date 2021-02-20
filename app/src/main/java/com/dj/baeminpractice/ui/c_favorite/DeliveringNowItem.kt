package com.dj.baeminpractice.ui.c_favorite

import com.dj.baeminpractice.R
import com.xwray.groupie.Group
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.item_record.view.*

class DeliveringNowItem(private val shopInfo: ShopInfo) : Item<GroupieViewHolder>() {

    override fun getLayout() = R.layout.item_delivering_now

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        //바인딩 코드 추가
    }
}