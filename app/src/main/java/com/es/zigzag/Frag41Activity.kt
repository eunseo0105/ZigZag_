package com.es.zigzag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_frag4.*

class Frag41Activity : Fragment() {
    private lateinit var pageradapter:PagerAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_frag41,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}