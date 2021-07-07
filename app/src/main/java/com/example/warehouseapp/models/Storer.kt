package com.example.warehouseapp.models

data class Storer(
    val id: String,
    val email: String,
    val password: String,
    val name: String,
    val warehouseIds: List<String>
)