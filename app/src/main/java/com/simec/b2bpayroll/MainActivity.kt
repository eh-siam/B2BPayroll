package com.simec.b2bpayroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.simec.b2bpayroll.presentation.screen.home.HomeViewModel
import com.simec.b2bpayroll.presentation.screen.home.PreviewHomeScreenWithoutVM
import com.simec.b2bpayroll.presentation.screen.login.LoginScreen
import com.simec.b2bpayroll.presentation.screen.splash.ShowSplashScreen
import com.simec.b2bpayroll.ui.theme.B2BPayrollTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            B2BPayrollTheme {
                SplashActivity()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}