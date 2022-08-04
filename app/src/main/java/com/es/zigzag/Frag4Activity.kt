package com.es.zigzag

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_frag4.*
import kotlinx.android.synthetic.main.activity_main.*

class Frag4Activity :Fragment() {
    private var viewPager: ViewPager2? = null
    private lateinit var tabLayout: TabLayout
    private val tabTitleArray = arrayOf("전체", "상의", "아우터", "원피스/세트", "바지", "스커트", "슈즈", "가방", "악세사리")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.activity_frag4, container, false)
        viewPager = view.findViewById(R.id.frag4viewpager)
        tabLayout = view.findViewById(R.id.tab_layout)

        return view

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val pagerAdapter = Frag4PagerAdapter(requireActivity())

        // 2개의 fragment add
        pagerAdapter.addFragment(Frag41Activity())
        pagerAdapter.addFragment(Frag42Activity())
        pagerAdapter.addFragment(Frag43Activity())
        pagerAdapter.addFragment(Frag44Activity())
        pagerAdapter.addFragment(Frag45Activity())
        pagerAdapter.addFragment(Frag46Activity())
        pagerAdapter.addFragment(Frag47Activity())
        pagerAdapter.addFragment(Frag48Activity())
        pagerAdapter.addFragment(Frag49Activity())

        // adapter 연결
        viewPager?.adapter = pagerAdapter
        viewPager?.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int){
                super.onPageSelected(position)
                Log.e("ViewPagerFragment", "Page ${position+1}")
            }
        })

        //tablayout 뷰페이저랑 연결
        viewPager?.let {
            TabLayoutMediator(tabLayout, it){ tab, position ->
                tab.text = tabTitleArray[position]
            }.attach()
        }
    }
}