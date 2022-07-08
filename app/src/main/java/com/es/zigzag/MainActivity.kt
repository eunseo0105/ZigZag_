package com.es.zigzag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    private val frame: LinearLayout by lazy { // activity_main의 화면 부분
        findViewById(R.id.frame1)
    }
    private val bottomNagivationView: BottomNavigationView by lazy { // 하단 네비게이션 바
        findViewById(R.id.bottom_navigation)
    }
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
        adapter.addFragment(Frag5Activity(),"세일")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        btnplus.setOnClickListener{
            var intent=Intent(applicationContext,PlusActivity::class.java)
            startActivity(intent)
        }

        btncart.setOnClickListener {
            var intent=Intent(applicationContext,CartActivity::class.java)
            startActivity(intent)
        }

        // 애플리케이션 실행 후 첫 화면 설정
        supportFragmentManager.beginTransaction().add(R.id.frame1, Fragment()).commit()

//        // 하단 네비게이션 바 클릭 이벤트 설정
//        bottomNagivationView.setOnNavigationItemSelectedListener {item ->
//            when(item.itemId) {
//                R.id.nav_home -> {
//
//                    true
//                }
//                R.id.nav_store -> {
//                    replaceFragment(ChartFragment())
//                    true
//                }
//                R.id.nav_preview -> {
//                    replaceFragment(MemoFragment())
//                    true
//                }
//                else -> false
//            }
//        }
    }


}

