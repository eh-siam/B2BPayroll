package com.simec.b2bpayroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.simec.b2bpayroll.presentation.screen.login.LoginScreen
import com.simec.b2bpayroll.ui.theme.B2BPayrollTheme

/**
 * Created by Emdadul Haque Siam on 29,June,2025
 * Copyright (c): SIMEC System Ltd.
 */
class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            B2BPayrollTheme {
                LoginScreen()
            }
        }
    }

}

