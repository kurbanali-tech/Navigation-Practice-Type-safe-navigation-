package com.example.navigation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable


fun homescreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 50.dp, end = 50.dp),
        verticalArrangement = Arrangement.Center,

    ) {
        Text(text="Welcome to homeScreen",
            //modifier = Modifier.fillMaxSize(),
            fontSize = 45.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.ExtraBold,
            //color = Color.Yellow,
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.size(60.dp))

        Button(onClick = {
           navController.popBackStack()

        }) {

            Text(text = "<-Previous")
        }



    }
}




