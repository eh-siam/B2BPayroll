package com.simec.b2bpayroll.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.simec.b2bpayroll.presentation.screen.home.HomeScreen
import com.simec.b2bpayroll.presentation.screen.home.hr.HRScreen
import com.simec.b2bpayroll.presentation.screen.home.payroll.PayrollScreen
import com.simec.b2bpayroll.presentation.screen.splash.SplashScreen


/**
 * Created by Emdadul Haque Siam on 20,July,2025
 * Copyright (c): SIMEC System Ltd.
 */

@Composable
fun AppNavigation(navController: NavHostController) {


    NavHost(navController = navController, startDestination = "home"){


        composable("splash") {
            SplashScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("hr_configuration") {
            HRScreen(navController = navController,
            onBackClick = {navController.popBackStack()}
            )
        }
        composable("payroll") {
            PayrollScreen(navController = navController,
                onBackClick = {navController.popBackStack()}
            )
        }
        composable("configuration") {
            HRScreen(navController)
        }
        composable("Application_configuration") {
            HRScreen(navController)
        }
        composable("Employee") {
            HRScreen(navController)
        }
    }
}