package com.es.zigzag

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.es.zigzag.databinding.ActivityStoreBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_store.*

class StoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title="스토어"
        setupViewPager()
        setupTabLayout()
    }

    private fun setupTabLayout() {
        TabLayoutMediator(
            binding.tabLayout2, binding.storeViewpager
        ) { tab, position -> tab.text = "Tab " + (position + 1) }.attach()
    }

    private fun setupViewPager() {
        val adapter = StorePagerAdapter(this, 2)
        binding.storeViewpager.adapter = adapter

    }
    override fun onBackPressed() {
        val viewPager = binding.storeViewpager
        if (viewPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }
}