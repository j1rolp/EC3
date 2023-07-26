package com.example.cuponex.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cuponex.R
import com.example.cuponex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fabAddCoupon.setOnClickListener {
            val intent = Intent(this, AddCouponActivity::class.java)
            startActivity(intent)
        }

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_coupon) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)
        /*binding.bnvMenu.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.item_coupon_list -> {
                    binding.txtHello.text = "coupon list"

                    true
                }
                R.id.item_coupon_favorite -> {
                    binding.txtHello.text = "favorite"
                    true
                }
                R.id.item_info -> {
                    binding.txtHello.text = "info"
                    true
                }
                else -> {
                    binding.txtHello.text = "error"
                    false
                }
            }
        }*/
    }
}