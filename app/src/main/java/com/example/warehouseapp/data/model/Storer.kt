package com.example.warehouseapp.data.model

data class Storer(
    val id: String,
    val email: String,
    val password: String,
    val name: String,
    val warehouseIds: List<String>
)