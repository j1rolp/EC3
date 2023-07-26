package com.example.cuponex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cuponex.databinding.ItemCouponBinding
import com.example.cuponex.model.coupon

class RVCouponListAdapter(var coupons: List<coupon>): RecyclerView.Adapter<CouponVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponVH {
        val binding = ItemCouponBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CouponVH(binding)
    }

    override fun getItemCount(): Int = coupons.size

    override fun onBindViewHolder(holder: CouponVH, position: Int) {
        holder.bind(coupons[position])
    }

}

class CouponVH(private val binding: ItemCouponBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(coupon: coupon) {
        binding.txtDiscount.text = "${coupon.discount}%"
        binding.txtNameStore.text = coupon.store
        binding.txtDetail.text = coupon.detail
        binding.txtExpiredOn.text = coupon.expiresOn
    }

}