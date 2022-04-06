package com.es.zigzag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Frag21Activity(
    val image : Int
): Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.activity_frag21, container, false)
        var imageView : ImageView = view.findViewById(R.id.iv)
        imageView.setImageResource(image)
        return view
    }
}

