package com.example.warehouseapp.models

data class Warehouse(
    val id: String,
    val name: String,
    val country: String,
    val address: String,
    val pns: List<ProductAndStock>
)