package com.simec.b2bpayroll.presentation.activity

/**
 * Created by Emdadul Haque Siam on 29,June,2025
 * Copyright (c): SIMEC System Ltd.
 */
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.simec.b2bpayroll.presentation.screen.splash.SplashScreen


class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set Compose UI
        setContent {
            val navController = rememberNavController()

            SplashScreen(navController = navController)
        }

        // Delay 2.5 seconds (2500 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            val isLoggedIn = checkLoginStatus()

            if (isLoggedIn) {
                // যদি user login করা থাকে
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                // যদি user login না করে
                startActivity(Intent(this, LoginActivity::class.java))
            }

            finish() // যাতে back press এ splash এ না যায়
        }, 2500)
    }

    private fun checkLoginStatus(): Boolean {
        // এখানে আপনি FirebaseAuth বা SharedPreferences থেকে login অবস্থা চেক করতে পারেন
        // উদাহরণস্বরূপ:
        // return FirebaseAuth.getInstance().currentUser != null
        return false // এখন এটা false রাখা হলো, আপনি চাইলে বাস্তব logic বসাবেন
    }
}
