package com.simec.b2bpayroll.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.simec.b2bpayroll.core.designsystem.*
import com.simec.b2bpayroll.presentation.navigation.AppNavigation


/**
 * Created by Emdadul Haque Siam on 29,June,2025
 * Copyright (c): SIMEC System Ltd.
 */

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            B2bPayrollTheme {
                val navController = rememberNavController()  // Create NavController
                AppNavigation(navController = navController)  // Pass it to AppNavigation
            }
        }
    }
}


