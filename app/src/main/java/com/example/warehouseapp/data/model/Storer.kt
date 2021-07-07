package com.example.warehouseapp.data.model

import com.google.gson.annotations.SerializedName

data class Storer(
    @SerializedName("id")
    val id: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("warehouseIds")
    val warehouseIds: List<String>
)