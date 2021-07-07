package com.example.warehouseapp.data.model

import com.google.gson.annotations.SerializedName

data class Warehouse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("pns")
    val pns: List<ProductAndStock>
)