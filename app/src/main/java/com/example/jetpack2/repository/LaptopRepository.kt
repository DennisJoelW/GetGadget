package com.example.jetpack2.repository

import com.example.jetpack2.R
import com.example.jetpack2.model.Laptop

class LaptopRepository {

    fun getFourLaptop(): List<Laptop>{

        return listOf(
            Laptop(
                1,
                "ProArt Studiobook",
                "Asus",
                2338.1f,
                R.drawable.laptop1
            ),
            Laptop(
                2,
                "Zenbook Duo",
                "Asus",
                1272.2f,
                R.drawable.laptop2

            ),
            Laptop(
                3,
                "Zenbook Pro Duo",
                "Asus",
                3096.6f,
                R.drawable.laptop3

            ),
            Laptop(
                4,
                "Macbook Pro",
                "Apple",
                1238.75f,
                R.drawable.laptop4
            ),
        )
    }
}