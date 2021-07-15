package com.example.front_startup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.front_startup.R
import com.example.front_startup.helper.SharedPref

class SignUp_Or_InActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var signUp: Button
    private lateinit var signIn: Button

    lateinit var s: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_or_in)

        window.setStatusBarColor(ContextCompat.getColor(this@SignUp_Or_InActivity,R.color.gray))

        s = SharedPref(this)

        signUp = findViewById(R.id.btn_daftar)
        signUp.setOnClickListener(this)
        signIn = findViewById(R.id.btn_login)
        signIn.setOnClickListener(this)

//        s.setStatusLogin(true)

    }

    override fun onClick(v: View?) {
        if(v != null)
            when (v.id) {
                R.id.btn_login -> kotlin.run {
                    val ip = Intent( this@SignUp_Or_InActivity, LoginActivity::class.java)
                    startActivity(ip)
                }
                R.id.btn_daftar -> kotlin.run {
                    val ip = Intent( this@SignUp_Or_InActivity, RegisterActivity::class.java)
                    startActivity(ip)
                }
            }
    }

}