package com.example.cuponex.data.repository

import com.example.cuponex.data.response.ApiResponse
import com.example.cuponex.data.response.CouponListResponse
import com.example.cuponex.data.retrofit.ServiceInstance
import java.lang.Exception

class CouponsRepository {
    suspend fun getCoupons(): ApiResponse<CouponListResponse>{
        return try {
            val response = ServiceInstance.getCouponService().getCoupons()
            ApiResponse.Success(response)
        } catch (e: Exception){
            ApiResponse.Error(e)
        }
    }
}