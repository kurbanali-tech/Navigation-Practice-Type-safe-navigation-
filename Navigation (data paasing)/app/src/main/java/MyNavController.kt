package com.example.navigationdatapassing

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable

fun control(){

    val navController= rememberNavController()

    NavHost(navController = navController,startDestination = "page1"){

        composable (route="page1"){
            pg1(navController)
        }
        composable(route="page2/{msg}",
            arguments = listOf(
                navArgument("msg"){
                    type=NavType.StringType
                }
            )

        ) {backStackEntry->
            val data=backStackEntry.arguments?.getString("msg")?:""
            pg2(navController,data)


        }
    }
}