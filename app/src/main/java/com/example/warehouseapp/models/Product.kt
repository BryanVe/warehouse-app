package com.example.warehouseapp.models

data class Product(
    val id: String,
    val name: String,
    val producer: String,
    val description: String,
    val image: List<Byte>,
    val price: Double,
    val stock: Int
)