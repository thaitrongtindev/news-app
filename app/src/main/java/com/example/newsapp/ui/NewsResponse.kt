package com.example.newsapp.ui

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)
