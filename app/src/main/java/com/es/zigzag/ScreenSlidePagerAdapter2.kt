package com.es.zigzag

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter2 (
    var fa : FragmentActivity
): FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> Frag21Activity(R.drawable.shop_19)
            1 -> Frag21Activity(R.drawable.shop_20)
            2 -> Frag21Activity(R.drawable.shop_21)
            3 -> Frag21Activity(R.drawable.shop_22)
            4 -> Frag21Activity(R.drawable.shop_23)
            else -> Frag21Activity(R.drawable.shop_24)
        }
    }

}