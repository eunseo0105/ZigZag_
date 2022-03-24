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
import android.widget.TextView
import androidx.fragment.app.Fragment

class Frag2Activity:Fragment() {
    private lateinit var text3: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.activity_frag2, container, false)

        text3 = view.findViewById(R.id.text3)
        var txt = SpannableStringBuilder(text3.text);
        txt.setSpan(ForegroundColorSpan(Color.parseColor("#4B714C")), 7,13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        text3.text = txt


        return view
    }
}