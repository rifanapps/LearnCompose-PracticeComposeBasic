package com.example.practicecomposebasic.models

sealed class Screen (val route: String) {
    object Main: Screen("main_screen")
    object ComposeArticle: Screen("compose_article_screen")
}