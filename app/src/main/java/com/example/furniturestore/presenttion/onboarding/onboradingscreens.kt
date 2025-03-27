package com.example.furniturestore.presenttion.onboarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.furniturestore.R

@Preview(showSystemUi = true)
@Composable
fun OnboardingScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        content = {
            // Image
            Image(
                painter = painterResource(R.drawable.mask_group),
                contentDescription = "Phone",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Box (modifier = Modifier.padding(horizontal = 30.dp, vertical = 30.dp)){
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(textAlign = TextAlign.Center,
                        )
                        ) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("Transform Your Space with ")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF1A5D8F),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("AI & ")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF1A5D8F),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("AR!")
                            }
                        }
                    }
                )
            }

            // Description text
            Text(
                text = "Experience the future of furniture shopping—visualize, customize, and place items in your home before buying.",
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 10.dp, start = 24.dp, end = 24.dp)
            )
            Box(modifier = Modifier.padding(end = 24.dp, top = 28.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    FloatingActionButton(
                        onClick = {
//                            navController.navigate("OnboardingScreen2")
                        },
                        shape = RoundedCornerShape(50.dp),
                        containerColor = Color(0xFF1A5D8F),
                        elevation = FloatingActionButtonDefaults.elevation(0.dp),
                        modifier = Modifier.size(42.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Continue",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    )
}

@Composable
fun OnboardingScreen2(navController: NavController){
    Column(
        content = {
            // Image
            Image(
                painter = painterResource(R.drawable.mask_group),
                contentDescription = "Phone",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Box (modifier = Modifier.padding(horizontal = 60.dp, vertical = 30.dp)){
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(textAlign = TextAlign.Center,
                        )) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xff1A5D8F),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("Smart AI, ")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("Perfect Picks!")
                            }
                        }
                    }
                )
            }

            // Description text
            Text(
                text = "Our AI understands your style and space to suggest the best furniture for your home..",
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 10.dp, start = 24.dp, end = 24.dp, bottom = 40.dp)
            )
            Box(modifier = Modifier.padding(end = 24.dp, top = 28.dp, start = 24.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedIconButton(
                        onClick = {navController.navigate("OnboardingScreen")},
                        shape = RoundedCornerShape(50.dp),
                        border = BorderStroke(1.dp, Color(0xFF1A5D8F)),
                        modifier = Modifier.size(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Continue",
                            tint = Color(0xFF1A5D8F),
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    FloatingActionButton(
                        onClick = {navController.navigate("OnboardingScreen3")},
                        shape = RoundedCornerShape(50.dp),
                        containerColor = Color(0xFF1A5D8F),
                        elevation = FloatingActionButtonDefaults.elevation(0.dp),
                        modifier = Modifier.size(42.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Continue",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    )
}

@Composable
fun OnboardingScreen3(navController: NavController) {
    Column(
        content = {
            // Image
            Image(
                painter = painterResource(R.drawable.mask_group),
                contentDescription = "Phone",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Box (modifier = Modifier.padding(horizontal = 70.dp, vertical = 30.dp)){
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(textAlign = TextAlign.Center,
                        )) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("See It ")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF1A5D8F),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                            ) {
                                append("Before You Buy!")
                            }
                        }
                    }
                )
            }

            // Description text
            Text(
                text = "Use AR to place furniture in your room and get a real-time view of how it fits.",
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 10.dp, start = 24.dp, end = 24.dp, bottom = 40.dp)
            )
            Box(modifier = Modifier.padding(end = 24.dp, top = 28.dp, start = 24.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedIconButton(
                        onClick = {navController.navigate("OnboardingScreen2")},
                        shape = RoundedCornerShape(50.dp),
                        border = BorderStroke(1.dp, Color(0xFF1A5D8F)),
                        modifier = Modifier.size(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Continue",
                            tint = Color(0xFF1A5D8F),
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    FloatingActionButton(
                        onClick = {navController.navigate("SignupScreen")},
                        shape = RoundedCornerShape(50.dp),
                        containerColor = Color(0xFF1A5D8F),
                        elevation = FloatingActionButtonDefaults.elevation(0.dp),
                        modifier = Modifier.size(42.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Continue",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    )
}


