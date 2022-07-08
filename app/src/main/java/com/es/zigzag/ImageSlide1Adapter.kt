
package com.es.zigzag

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2

class ImageSlide1Adapter(private val context: Context, manager: FragmentManager):PagerAdapter(manager){
    private var layoutInflater:LayoutInflater?=null

    val Image= arrayOf(R.drawable.shop_1,R.drawable.shop_13,R.drawable.shop_14,R.drawable.shop_15,R.drawable.shop_16
        ,R.drawable.shop_17,R.drawable.shop_18)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return super.isViewFromObject(view, `object`)
    }

    override fun getCount(): Int {
        return Image.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v=layoutInflater!!.inflate(R.layout.activity_imageslide1,null)
        val image=v.findViewById<View>(R.id.imageview)as ImageView
        image.setImageResource(Image[position])
        val vp = container as ViewPager2
        vp.addView(v,0)

        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp=container as ViewPager2
        val v= `object` as View
        vp.removeView(v)
    }
}

/*
fragment1안에 있는 이미지 슬라이드를 만드려고 어댑터를 추가로 만들었으나 기존에 있던 어댑터를 사용하여
screenslidepagerAdapter을 만들어 그 안에 이미지들을 넣고 어댑터와 연결함 */
