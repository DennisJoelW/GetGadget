package com.example.jetpack2.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.jetpack2.R
import com.example.jetpack2.model.Category

class CategoryRepository {

    fun getAllCategory(): List<Category>{

        return listOf(
            Category(
                1,
                "Laptop",
                40,
                categoryImage = R.drawable.laptop
            ),
            Category(
                2,
                "SmartPhone",
                10,
                R.drawable.smartphone
            ),
            Category(
                3,
                "Monitor",
                12,
                R.drawable.monitor
            )
        )
    }
}