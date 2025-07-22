package com.simec.b2bpayroll.presentation.screen.home.payroll

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.fillMaxSize
import com.simec.b2bpayroll.presentation.component.ui.CommonTopBar

/**
 * Created by Emdadul Haque Siam on 08,July,2025
 * Copyright (c): SIMEC System Ltd.
 */

@Composable
fun PayrollScreen(
    navController: NavHostController, onBackClick: () -> Unit = {}){

    Scaffold(
        topBar = {
            CommonTopBar(title = "Payroll", onBackClick = onBackClick)
        }
    ){
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {

        }
    }


}

