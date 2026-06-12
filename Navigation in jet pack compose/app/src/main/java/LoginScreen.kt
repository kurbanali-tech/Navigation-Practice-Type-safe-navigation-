package com.example.navigation

//import androidx.activity.compose.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
//@Preview


fun loginscreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(top = 200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,



    ) {
        Image(
            painter = painterResource(R.drawable.contacticon),
            contentDescription = null,
            modifier = Modifier.size(100.dp),


        )




        Spacer(modifier = Modifier.size(16.dp))




        Column(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            var set by remember { mutableStateOf("") }
            TextField(
                value = set,
                onValueChange = {set=it},
                label = {Text(text = "Email ID",
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,

                )},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                   Image(
                       painter = painterResource(R.drawable.maleicon),
                       contentDescription = null,
                       modifier = Modifier.size(53.dp)
                   )
                }



            )



            Spacer(modifier = Modifier.size(18.dp))




            var set2 by remember { mutableStateOf("") }
            TextField(
                value = set2,
                onValueChange = {set2=it},
               label = {Text(text = "Password",
                   modifier = Modifier.fillMaxWidth(),
                   textAlign = TextAlign.Center,
                   fontSize = 20.sp
               )},
               leadingIcon = {
                   Image(
                       painter = painterResource(R.drawable.lockicon),
                       contentDescription = null,
                       modifier = Modifier.size(53.dp),



                   )
               }



            )
        }



        Spacer(modifier = Modifier.size(30.dp) )



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,

        ) {

            Text(text = "Remeber me",

            )


            Text(text = "Forget Password?",
                modifier = Modifier.clickable{
                    println("plss try again")
                }
            )

        }



        Spacer(modifier = Modifier.size(30.dp) )




        Column(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            Button(
                onClick = {
                   navController.navigate("Home Screen")
                }
            ) {
                Text(text = "Login")

            }



        }
    }
}