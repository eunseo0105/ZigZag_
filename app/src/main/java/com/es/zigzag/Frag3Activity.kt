package com.es.zigzag

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class Frag3Activity :Fragment() {
    private lateinit var viewPager : ViewPager2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.activity_frag3, container, false)
        viewPager =view.findViewById(R.id.frame3)
        val pagerAdapter = ScreenSlidePagerAdapter2(this.requireActivity())
        viewPager.adapter = pagerAdapter
        return view
    }
}