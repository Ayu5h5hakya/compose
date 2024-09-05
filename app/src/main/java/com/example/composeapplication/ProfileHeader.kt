package com.example.composeapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeader (){
    Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Box {
            Image(
                painter = painterResource(R.drawable.welcome),
                contentDescription = "test image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp).clip(CircleShape))
            Box(
                modifier = Modifier.align(Alignment.BottomEnd).padding(bottom = 10.dp).size(24.dp).clip(CircleShape).background(Color.White)
            ) {
                Icon(
                Icons.Default.Person,
                contentDescription = "",
                    modifier = Modifier.padding(2.dp)
            )
            }
        }
        Spacer(Modifier.height(10.dp))
        Text("Narendra Uprety")
    }
}