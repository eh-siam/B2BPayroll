package com.simec.b2bpayroll.presentation.screen.auth.login

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.simec.b2bpayroll.R
import com.simec.b2bpayroll.presentation.activity.MainActivity
import com.simec.b2bpayroll.presentation.screen.home.HomeScreen


/**
 * Created by Emdadul Haque Siam on 26,June,2025
 * Copyright (c): SIMEC System Ltd.
 */

@Preview(showBackground = true)
@Composable
fun LoginScreen() {

    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1F1F1)) // Light gray background
            .padding(horizontal = 30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.letter),
                    contentDescription = stringResource(R.string.app_name),
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.Gray, CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Simec Payroll",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Welcome to Simec Payroll",
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )
                }
            }

            Spacer(modifier = Modifier.height(100.dp))

            OutlinedTextField(
                value = email,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                onValueChange = {
                    if (it.length <= 30) email = it
                },
                label = { Text("Email Or Username") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = password,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                onValueChange = {
                    if (it.length <= 10) password = it
                },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = "Forgot Password?",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(Alignment.End)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {
                    context.startActivity(Intent(context, MainActivity::class.java))
                },
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                )
            ) {
                Text(text = "Login", color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Or Continue With",
                color = Color.Blue,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}
