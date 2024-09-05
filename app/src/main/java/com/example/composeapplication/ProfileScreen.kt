package com.example.composeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource

@Composable
fun ProfileScreen() {
    LazyColumn {
        item {
            ProfileHeader()
        }

        item {
            Card() {
                Text(text = "Hello, world!")
                Text(text = "Hello, world!")
                Text(text = "Hello, world!")
            }

        }
    }
}