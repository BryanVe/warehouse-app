package com.example.warehouseapp.data.model

import com.google.gson.annotations.SerializedName

data class Producer(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("email")
    val email: String
)
