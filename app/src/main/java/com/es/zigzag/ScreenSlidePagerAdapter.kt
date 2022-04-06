package com.es.zigzag

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(
    var fa : FragmentActivity
): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> Frag21Activity(R.drawable.shop_13)
            1 -> Frag21Activity(R.drawable.shop_14)
            2 -> Frag21Activity(R.drawable.shop_15)
            3 -> Frag21Activity(R.drawable.shop_16)
            4 -> Frag21Activity(R.drawable.shop_17)
            else -> Frag21Activity(R.drawable.shop_18)
        }
    }
}