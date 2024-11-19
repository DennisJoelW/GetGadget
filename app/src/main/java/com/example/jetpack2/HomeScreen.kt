package com.example.jetpack2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpack2.component.Carousel
import com.example.jetpack2.component.CategoryRow
import com.example.jetpack2.component.ProductView
import com.example.jetpack2.component.TopAppBar
import com.example.jetpack2.component.TwoColumnProducts
import com.example.jetpack2.model.Category
import com.example.jetpack2.repository.LaptopRepository
import com.example.jetpack2.ui.theme.onestFontFamily

@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        item { TopAppBar() }

        item {
            Spacer(Modifier.height(24.dp))
            Carousel()
        }

        item {
            Spacer(Modifier.height(24.dp))
            CategoryRow()
        }

        item {
            Spacer(Modifier.height(24.dp))
            ProductView()  // This will be scrollable within LazyColumn
        }

        TwoColumnProducts()
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen(){
    var navController = rememberNavController()

    HomeScreen(navController)
}