package com.example.composeapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun JourneyScreen() {
    LazyColumn {
        item {
            Text("Wednesday, 04/09/2024 START 4:50 AM END 4:50 AM")
        }
        item {
           Button(onClick = {}) {
               Text("Start Journey")
           }
        }
    }
}
