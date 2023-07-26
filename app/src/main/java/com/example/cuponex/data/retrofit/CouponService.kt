package com.example.cuponex.data.retrofit

import com.example.cuponex.data.response.CouponListResponse
import retrofit2.http.GET

interface CouponService {
    @GET("5340fe6c-6250-4409-aade-ecdf5f494882")
    suspend fun getCoupons() : CouponListResponse
}