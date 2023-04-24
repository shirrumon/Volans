package com.polodarb.volans

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.polodarb.volans.databinding.ActivityMainBinding
import com.polodarb.volans.ui.fragments.AdminFragment
import com.polodarb.volans.ui.fragments.HomeFragment
import com.polodarb.volans.ui.fragments.MyTicketsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = Color.TRANSPARENT
        setContentView(binding.root)

//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        val navController = navHostFragment.navController
//        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//            .setupWithNavController(navController)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        setupWithNavController(binding.bottomNavigationView, navController)

//        NavigationBarView.OnItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.navbar_home -> {
////                    supportFragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, HomeFragment()).commit()
//                    true
//                }
//                R.id.navbar_my_tickets -> {
////                    supportFragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, MyTicketsFragment()).commit()
//                    true
//                }
//                R.id.navbar_admin -> {
////                    supportFragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, AdminFragment()).commit()
//                    true
//                }
//                else -> false
//            }
//        }

    }
}