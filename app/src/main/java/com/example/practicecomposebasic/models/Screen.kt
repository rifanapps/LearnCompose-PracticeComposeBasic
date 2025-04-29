package com.example.practicecomposebasic.models

sealed class Screen (val route: String) {
    object Main: Screen("main_screen")
    object ComposeArticle: Screen("compose_article_screen")
    object TaskManager: Screen("task_manager_screen")
    object ComposeQuadrant: Screen("compose_quadrant_screen")
}