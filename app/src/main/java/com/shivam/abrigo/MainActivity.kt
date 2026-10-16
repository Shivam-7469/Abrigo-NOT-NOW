package com.shivam.abrigo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shivam.abrigo.ui.theme.AbrigoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AbrigoTheme {
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6B4EFF))
            .systemBarsPadding()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(140.dp)
                .background(Color(0xFFFFC83D), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text("🐶", fontSize = 64.sp)
        }
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Every pet deserves a safe home",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(32.dp))
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFC83D),
                contentColor = Color(0xFF1B1F3B)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text("Get started", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    AbrigoTheme {
        WelcomeScreen()
    }
}