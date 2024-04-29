package com.akashnavik

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.akashnavik.dicapp.R

@Composable
fun DicUi() {

    var dicimage by remember {
        mutableStateOf(R.drawable.dice_2)
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Welcome to the World Of Dic ?",
            fontFamily = FontFamily.Default ,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Image(painter = painterResource(id = dicimage), contentDescription = null)
        Button(onClick = {
            var random = kotlin.random.Random.nextInt(6)
            when(random){
                1->dicimage = R.drawable.dice_1
                2->dicimage = R.drawable.dice_2
                3->dicimage = R.drawable.dice_3
                4->dicimage = R.drawable.dice_4
                5->dicimage = R.drawable.dice_5
                6->dicimage = R.drawable.dice_6
                else -> print("Invalid")
            }

        }) {
            Text(text = "Click to Roll")
        }

    }
}