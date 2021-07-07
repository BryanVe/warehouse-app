package com.example.warehouseapp.data.model

import com.google.gson.annotations.SerializedName

data class ProductAndStock(
    @SerializedName("product")
    val product: String,
    @SerializedName("stock")
    val stock: Int,
    @SerializedName("price")
    val price: String
)