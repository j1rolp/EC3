package com.example.cuponex.model

import com.google.gson.annotations.SerializedName

data class coupon(
    @SerializedName("url_image")
    val urlImage: String,
    val name: String,
    val store: String,
    val discount: String,
    val detail: String,
    val expiresOn: String,
    @SerializedName("qr_code")
    val qrCode: String = ""
)

fun getData(): List<coupon> =
    listOf(
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
        coupon("", "", "Nike store", "50", "Obtén un 50% de descuento por el día del padre.", "24 june 2023"),
    )
