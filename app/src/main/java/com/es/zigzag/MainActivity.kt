package com.es.zigzag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.frame1)
        tabLayout = findViewById(R.id.tabLayout)

        val adapter: PagerAdapter = PagerAdapter(supportFragmentManager, 1)
        adapter.addFragment(Frag1Activity(), "홈")
        adapter.addFragment(Frag2Activity(), "BRAND")
        adapter.addFragment(Frag3Activity(), "뷰티")
        adapter.addFragment(Frag4Activity(), "베스트")
        adapter.addFragment(Frag5Activity(), "세일")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        btnplus.setOnClickListener {
            var intent = Intent(applicationContext, PlusActivity::class.java)
            startActivity(intent)
        }

        btncart.setOnClickListener {
            var intent1 = Intent(applicationContext, CartActivity::class.java)
            startActivity(intent1)
        }

        btnhome.setOnClickListener{
            var intent2=Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent2)
        }

    }


}

