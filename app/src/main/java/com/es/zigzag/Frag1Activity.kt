package com.es.zigzag

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_frag1.*

class Frag1Activity:  Fragment() {
    private lateinit var viewPager : ViewPager2
    private lateinit var btn6 : Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.activity_frag1, container, false)
        btn6 = view.findViewById(R.id.btn6)!!
        var ssb = SpannableStringBuilder(btn6.text);
        ssb.setSpan(ForegroundColorSpan(Color.parseColor("#696870")), 14, btn6.text.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        btn6.text = ssb
        viewPager =view.findViewById(R.id.imageSlide1)
        val pagerAdapter = ScreenSlidePagerAdapter(this.requireActivity())
        viewPager.adapter = pagerAdapter


        return view
    }

}