package com.example.composeapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(navigateToHome: () -> Unit) {
    Scaffold {it ->
        Box(modifier = Modifier
            .background(color = colorResource(id = R.color.dark_blue))
            .fillMaxSize()
            .padding(it)) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.app_name),
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(20.dp))
            Column (modifier = Modifier.align(Alignment.BottomEnd)){
                Image(
                    painter = painterResource(id = R.drawable.welcome),
                    contentDescription = stringResource(id = R.string.app_name),
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp,
                        topStart = 16.dp,
                        topEnd = 16.dp
                    ),

                    ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Text(text = "Welcome Back!")
                        Text(text = "Login to your existing employee management account.")
                        TextField(
                            value = "",
                            onValueChange = {},
                            leadingIcon = {
                                Icon(
                                    Icons.Filled.Info,
                                    contentDescription = "Localized description"
                                )
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            leadingIcon = {
                                Icon(
                                    Icons.Filled.Info,
                                    contentDescription = "Localized description"
                                )
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.size(15.dp))
                        Text(text = "Forgot Password?", modifier = Modifier.align(Alignment.End))
                        Spacer(modifier = Modifier.size(15.dp))
                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            onClick = {navigateToHome()}) {
                            Text(text = "Login")
                        }
                    }
                }
            }
        }
    }


}