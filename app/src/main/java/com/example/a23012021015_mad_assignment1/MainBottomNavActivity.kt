package com.example.a23012021015_mad_assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainBottomNavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bottom_nav)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Default fragment
        replaceFragment(CropYieldFragment())

        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_crop -> replaceFragment(CropYieldFragment())
                R.id.nav_alerts -> replaceFragment(FarmerAlertsFragment())
                R.id.nav_profile -> replaceFragment(ProfileFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
