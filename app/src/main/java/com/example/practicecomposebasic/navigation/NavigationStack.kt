package com.example.practicecomposebasic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicecomposebasic.MainScreen
import com.example.practicecomposebasic.models.Screen
import com.example.practicecomposebasic.screen.ComposeArticleScreen
import com.example.practicecomposebasic.screen.ComposeQuadrantScreen
import com.example.practicecomposebasic.screen.TaskManagerScreen

@Composable
fun NavigationStack () {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(route = Screen.Main.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.ComposeArticle.route) {
            ComposeArticleScreen()
        }
        composable(Screen.TaskManager.route) {
            TaskManagerScreen()
        }
        composable(Screen.ComposeQuadrant.route) {
            ComposeQuadrantScreen()
        }
    }
}