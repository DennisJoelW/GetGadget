package com.example.jetpack2.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.clearCompositionErrors
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack2.R
import com.example.jetpack2.repository.LaptopRepository
import com.example.jetpack2.ui.theme.onestFontFamily

@Composable
fun ProductView(){

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Product",
                fontFamily = onestFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )

            Text(
                text = "See All",
                fontFamily = onestFontFamily,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        Spacer(Modifier.height(16.dp))

    }
}

fun LazyListScope.TwoColumnProducts() {
    val laptopRepository = LaptopRepository()
    val getFourLaptop = laptopRepository.getFourLaptop()

    items(getFourLaptop.chunked(2)) { chunk -> // chunking list into pairs of items
        Row(
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            // For each chunk (pair of laptops)
            chunk.forEach { laptop ->
                Column(
                    modifier = Modifier
                        .weight(1f) // Make each column take equal space
                        .background(Color(0xFFF1F2F3), shape = RoundedCornerShape(8.dp))
                        .padding(top = 12.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
                ) {
                    Image(
                        painter = painterResource(id = laptop.laptopImage),
                        contentDescription = "Laptop Pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(150.dp)
                    )

                    Column(
                        modifier = Modifier
                            .background(Color.White, shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = laptop.laptopName,
                            maxLines = 1,
                            fontFamily = onestFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = laptop.laptopBrand,
                            fontFamily = onestFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        Spacer(Modifier.height(4.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "$ ${laptop.laptopPrice}",
                                fontFamily = onestFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(top = 12.dp)
                            )

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .size(36.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFF1F2F3), // Background color
                                    contentColor = Color.White          // Text color
                                ),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                // Empty button
                            }
                        }
                    }
                }
            }


        }

        Spacer(Modifier.height(14.dp))

    }
}



