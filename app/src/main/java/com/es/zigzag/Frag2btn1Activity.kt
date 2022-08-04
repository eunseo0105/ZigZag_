package com.es.zigzag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_frag2btn2.*

class Frag2btn1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag2btn1)

        btnback3.setOnClickListener {
            finish()
        }

    }
}