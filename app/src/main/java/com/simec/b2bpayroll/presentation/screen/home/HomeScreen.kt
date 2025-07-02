package com.simec.b2bpayroll.presentation.screen.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.simec.b2bpayroll.R


/**
 * Created by Emdadul Haque Siam on 26,June,2025
 * Copyright (c): SIMEC System Ltd.
 */
@Preview(showBackground = true)
@Composable
fun PreviewHomeScreenWithoutVM()  {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp),
            verticalAlignment = Alignment.Top
        ) {
            // 📷 Profile Image
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription ="Profile Picture",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .border(1.dp, Color.Gray, CircleShape)
            )

            // 📝 Texts
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 12.dp)
                    .weight(1f) // Fill remaining horizontal space
            ) {
                Text(
                    text = "Home Admin",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "Welcome to Simec Payroll",
                    fontSize = 13.sp,
                    color = Color.Gray,
                )
            }

            // 🔔 Notification Bell Icon
            Image(
                painter = painterResource(id = R.drawable.notification_bell),
                contentDescription = "Notification Bell Icon",
                modifier = Modifier
                    .padding(top = 12.dp)
                    .size(30.dp)
            )


        }

        Spacer(modifier = Modifier.padding(7.dp))

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {
                if (it.length <= 30) search = it
            },
            placeholder = { Text("Search...") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .border(
                    width = 1.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(12.dp)
                ),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,

        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
            ){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.recruitment),
                            contentDescription = "Profile Picture",
                            modifier = Modifier
                                .size(60.dp)

                        )

                        Text(
                            text = "HR\nManagement",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 12.dp)
                        )
                        Text(
                            text = "Empowering people,\nbuilding success",
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.DarkGray
                            ),
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }


                }
            }


            Box(
                modifier = Modifier
                    .weight(1f)

            ){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.retention),
                            contentDescription = "Profile Picture",
                            modifier = Modifier
                                .size(60.dp)
                        )

                        Text(
                            text = "Payroll\nManagement",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 12.dp)
                        )

                        Text(
                            text = "Smart payroll for smart businesses.",
                            fontSize = 13.sp,
                            modifier = Modifier.padding(top = 10.dp),
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )

                    }

                }
            }


        }



    }
    

}

