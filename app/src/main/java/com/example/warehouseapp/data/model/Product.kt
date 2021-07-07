package com.example.warehouseapp.data.model

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("producer")
    val producer: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: List<Byte>,
    @SerializedName("price")
    val price: Double,
    @SerializedName("stock")
    val stock: Int
)