package com.example.myrecipeapp

sealed class Screen(val route :String) {
    object RecipeScreen: Screen("screen")
    object DetailScreen: Screen("detail")
}