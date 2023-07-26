package com.example.cuponex.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cuponex.R
import com.example.cuponex.databinding.FragmentCouponFavoriteBinding

class CouponFavoriteFragment : Fragment() {

    private lateinit var binding: FragmentCouponFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_coupon_favorite, container, false)
        binding = FragmentCouponFavoriteBinding.bind(view)
        return binding.root
    }
}