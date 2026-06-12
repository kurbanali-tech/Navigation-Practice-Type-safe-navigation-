package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable

fun MyNavigation(){

    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "Screen 1"){

        composable(route = "Screen 1"){
            sc1(navController)
        }

        composable("Screen 2"){
            sc2(navController)
        }

    }
}
