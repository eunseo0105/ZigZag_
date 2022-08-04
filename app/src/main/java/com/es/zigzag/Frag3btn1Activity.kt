package com.es.zigzag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_frag3btn1.*

class Frag3btn1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag3btn1)

        btnback5.setOnClickListener {
            finish()
        }

    }
}