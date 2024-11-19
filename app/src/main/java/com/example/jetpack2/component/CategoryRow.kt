package com.example.jetpack2.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack2.repository.CategoryRepository
import com.example.jetpack2.ui.theme.onestFontFamily

@Preview(showBackground = true)
@Composable
fun CategoryRow(){

    val categoryRepository = CategoryRepository()
    val getAllCategory = categoryRepository.getAllCategory()

    var selectedCategoryId by remember { mutableIntStateOf(0) }

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        items(
            items = getAllCategory,
        ){  category ->

            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(
                        if (category.categoryId == selectedCategoryId) {
                            Color(0xFF060A58)
                        }
                        else {
                            Color(0xFFF1F2F3)
                        }, shape = RoundedCornerShape(10.dp))
                    .padding(vertical = 12.dp, horizontal = 12.dp)
                    .clickable {
                        selectedCategoryId = category.categoryId
                    }

            ) {
                Image(
                    painter = painterResource(category.categoryImage),
                    contentDescription = "Icon",
                    Modifier.size(50.dp).background(Color(0xFF8284AC), shape = RoundedCornerShape(5.dp))
                        .padding(5.dp)
                )

                Spacer(Modifier.width(12.dp))

                Column(
                    modifier = Modifier
                ){
                    Text(
                        text = category.categoryName,
                        fontFamily = onestFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = if (selectedCategoryId == category.categoryId) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                    Text(
                        text = "${category.totalProducts} Products",
                        fontFamily = onestFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}