package com.example.front_startup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import com.example.front_startup.MainActivity
import com.example.front_startup.R

class SplashScreenActivity : AppCompatActivity() {

    private val Splash:Long = 3000 //delay 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setStatusBarColor(ContextCompat.getColor(this@SplashScreenActivity,R.color.white))

        //Kode untuk menjalankan main screen setelah timer splash habis
        Handler().postDelayed({
            startActivity(Intent(this, SignUp_Or_InActivity::class.java))
            finish()
        }, Splash)
        //End Code
    }
}