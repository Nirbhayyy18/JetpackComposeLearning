package com.example.jetpackcomposecourse.E_Layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseDashboard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        // Status Bar (simplified)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "9:41",
                fontSize = 14.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Greeting
        Text(
            text = "Hello John!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Search Bar
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = "Find your course",
                    color = Color.Gray
                )
            },
            leadingIcon = {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF6C5CE7)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Q",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.LightGray,
                unfocusedBorderColor = Color.LightGray,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Limited Time Offer Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF6C5CE7)
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Box(modifier = Modifier.padding(16.dp)) {
                Column {
                    Text(
                        text = "Limited Time Offer",
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "30% OFF",
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "for all Courses",
                        fontSize = 14.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    TextButton(
                        onClick = { /* TODO */ },
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White)
                    ) {
                        Text(
                            text = "Get Offer Now",
                            color = Color(0xFF6C5CE7),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Popular Courses Section
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Popular Courses",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            TextButton(onClick = { /* TODO */ }) {
                Text(
                    text = "See All",
                    color = Color(0xFF6C5CE7),
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Courses Grid
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // UX/UI Design Card
            CourseCard(
                title = "UX/UI Design",
                duration = "30 min",
                rating = "4.9 (322 Reviews)"
            )

            // Web Development Card
            CourseCard(
                title = "Web Development",
                duration = "30 min",
                rating = "4.9 (322 Reviews)"
            )
        }
    }
}

@Composable
fun CourseCard(
    title: String,
    duration: String,
    rating: String
) {
    Card(
        modifier = Modifier
            //.all(1f)
            .height(160.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = duration,
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = rating,
                fontSize = 12.sp,
                color = Color(0xFFFFA000)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseDashboardPreview() {
    CourseDashboard()
}