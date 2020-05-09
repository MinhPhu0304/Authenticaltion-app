package com.example.authentication_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.authentication_app.ui.home.HomeFragment

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commitNow()
        }
    }
}
