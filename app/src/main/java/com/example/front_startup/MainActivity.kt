package com.example.front_startup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.front_startup.fragment.HomeFragment
import com.example.front_startup.fragment.UserFragment
import com.example.front_startup.activity.SignUp_Or_InActivity
import com.example.front_startup.fragment.ChatFragment
import com.example.front_startup.helper.SharedPref
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val statusLogin = false
    private lateinit var s: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        s = SharedPref(this)

        setNav()
    }

    //start Fragment
    fun setNav(){
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.botNav)
        val homeFragment = HomeFragment()
        val userFragment = UserFragment()
        val chatFragment = ChatFragment()


        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.beranda -> setCurrentFragment(homeFragment)
                R.id.profil -> {
                    if (s.getStatusLogin()){
                        setCurrentFragment(userFragment)
                    } else {
                        startActivity(Intent(this, SignUp_Or_InActivity::class.java))
                    }
                }
                R.id.pesan -> setCurrentFragment(chatFragment)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.place, fragment)
            commit()
        }
    //end Fragment

}