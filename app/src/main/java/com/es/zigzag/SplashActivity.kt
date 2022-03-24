package com.es.zigzag


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {
    val SPLASH_VIEW_TIME: Long=2000 //2초간 스플래쉬화면을 보여줌

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.splash)
        loadSplash()
    }
    private fun loadSplash() {
        Handler().postDelayed({
            //스플래쉬끝난후 메인액티비티 전환
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
