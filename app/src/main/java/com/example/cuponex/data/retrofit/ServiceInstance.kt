package com.example.cuponex.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    //https://run.mocky.io/v3/5340fe6c-6250-4409-aade-ecdf5f494882
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCouponService(): CouponService = retrofit.create(CouponService::class.java)
}