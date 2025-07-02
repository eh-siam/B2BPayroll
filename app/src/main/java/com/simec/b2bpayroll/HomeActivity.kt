package com.simec.b2bpayroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.simec.b2bpayroll.presentation.screen.home.PreviewHomeScreenWithoutVM


/**
 * Created by Emdadul Haque Siam on 30,June,2025
 * Copyright (c): SIMEC System Ltd.
 */

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewHomeScreenWithoutVM()
        }
    }
}