package com.es.zigzag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_frag3btn2.*

class Frag3btn2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag3btn2)


        btnback6.setOnClickListener {
            finish()
        }

    }
}