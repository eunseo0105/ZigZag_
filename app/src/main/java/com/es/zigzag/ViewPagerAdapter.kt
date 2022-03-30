package com.es.zigzag

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(private val c: Frag2Activity):PagerAdapter()  {

    private lateinit var li :LayoutInflater

    val i= arrayOf(
        R.drawable.shop_13,
        R.drawable.shop_14,
        R.drawable.shop_15,
        R.drawable.shop_16,
        R.drawable.shop_17,
        R.drawable.shop_18
    )

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == "object"
    }

    override fun getCount(): Int {
        return i.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        li= c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v=li!!.inflate(R.layout.imagefile,null)
        val iv= v.findViewById<View>(R.id.iv) as ImageView
        iv.setImageResource(i[position])
        container.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.invalidate()
    }

}