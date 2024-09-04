package com.example.composeapplication.features.splash.presentation

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.composeapplication.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navigateToLogin: () -> Unit) {

    LaunchedEffect(Unit) {
        delay(1000L)
        navigateToLogin()
    }

    Image(painter = painterResource(id = R.drawable.splashscreen),
        contentDescription = stringResource(id = R.string.app_name)
    )
}