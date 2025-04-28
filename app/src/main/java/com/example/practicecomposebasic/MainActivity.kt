package com.example.practicecomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.practicecomposebasic.models.Screen
import com.example.practicecomposebasic.navigation.NavigationStack
import com.example.practicecomposebasic.ui.theme.PracticeComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeComposeBasicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    NavigationStack()
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        Button(onClick = {
            navController.navigate(route = Screen.ComposeArticle.route)
        }) {
            Text(text = "Compose Article")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Task Manager")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Compose Quadrant")
        }
    }
}