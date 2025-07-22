package com.simec.b2bpayroll.presentation.screen.home.hr


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.simec.b2bpayroll.R
import com.simec.b2bpayroll.presentation.component.ui.CommonTopBar

/**
 * Created by Emdadul Haque Siam on 08,July,2025
 * Copyright (c): SIMEC System Ltd.
 */


@Composable
fun HRScreen(
    navController: NavHostController, onBackClick: () -> Unit = {}
){

    Scaffold(
        topBar = {
            CommonTopBar(title = "HR Management", onBackClick = onBackClick)
        }
    ) {
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("configuration")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.Blue, Color.Cyan)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.duty),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Configuration",
                            color = Color(0xFF1A237E),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("Application_configuration")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.Yellow, Color.Red)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.application),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Application",
                            color = Color(0xFF4C216A),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("Employee")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.Green, Color.LightGray)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.division),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Employee",
                            color = Color(0xFF4C216A),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }
                }



                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("attendance")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.Magenta, Color.Red)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.immigration),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Attendance",
                            color = Color(0xFF4C216A),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("reports")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.LightGray, Color.Red)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.reports),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Reports",
                            color = Color(0xFF4C216A),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    onClick = {
                        navController.navigate("leave")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Side bar with gradient
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .width(4.dp)
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(Color.Yellow, Color.Red)
                                    )
                                )
                                .padding(end = 6.dp)
                        )

                        // Icon
                        Icon(
                            painter = painterResource(id = R.drawable.leave),
                            contentDescription = "Configuration icon",
                            modifier = Modifier
                                .height(36.dp)
                                .padding(start = 10.dp, end = 10.dp),
                            tint = Color.Unspecified
                        )

                        // Text
                        Text(
                            text = "Leave",
                            color = Color(0xFF4C216A),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp, end = 16.dp)
                        )

                        // Arrow icon
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow),
                            contentDescription = "Right arrow",
                            modifier = Modifier
                                .size(18.dp)
                                .padding(start = 10.dp, end = 10.dp),

                            )
                    }

                }


            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HRScreenPreview(){
    HRScreen(navController = NavHostController(LocalContext.current))
}


