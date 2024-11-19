package com.example.jetpack2

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ){
        composable(
            route = Routes.HOME
        ){
            HomeScreen(navController)
        }
        composable(
            route = Routes.DETAIL
        ){
            DetailScreen()
        }
    }
}