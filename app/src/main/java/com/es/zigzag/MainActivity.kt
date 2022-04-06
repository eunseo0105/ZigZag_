package com.es.zigzag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.frame1)
        tabLayout = findViewById(R.id.tabLayout)

        val adapter : PagerAdapter = PagerAdapter(supportFragmentManager)
        adapter.addFragment(Frag1Activity(), "홈")
        adapter.addFragment(Frag2Activity(), "BRAND")
        adapter.addFragment(Frag3Activity(),"뷰티")
        adapter.addFragment(Frag4Activity(),"베스트")


        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)


    }
}
