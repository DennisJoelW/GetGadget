package com.example.jetpack2.model

import androidx.compose.ui.graphics.painter.Painter

data class Category(
    val categoryId: Int,
    val categoryName: String,
    val totalProducts: Int,
    val categoryImage: Int
)
