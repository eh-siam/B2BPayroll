package com.simec.b2bpayroll.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.simec.b2bpayroll.core.designsystem.B2bPayrollTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            B2bPayrollTheme {
                SplashActivity()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}