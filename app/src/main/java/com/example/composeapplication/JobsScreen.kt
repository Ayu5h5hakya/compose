package com.example.composeapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobsScreen() {
    Column {
        LazyRow {
            item {
                FilterChip(
                    selected = true,
                    onClick = {},
                    label = {
                        Text("All")
                    }
                )
            }
            item {
                FilterChip(
                    selected = true,
                    onClick = {},
                    label = {
                        Text("Pending")
                    }
                )
            }
            item {
                FilterChip(
                    selected = true,
                    onClick = {},
                    label = {
                        Text("Completed")
                    }
                )
            }
        }
        LazyColumn {
            items(50) { index ->
                Text("item $index", modifier = Modifier.fillMaxWidth())
            }
        }
    }
}