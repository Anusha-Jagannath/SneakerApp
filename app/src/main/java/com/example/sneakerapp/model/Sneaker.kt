package com.example.sneakerapp.model

import java.io.Serializable

data class Sneaker(
    val brand: String,
    val colorway: String,
    val gender: String,
    val id: String,
    val media: Media,
    val name: String,
    val releaseDate: String,
    val retailPrice: Int,
    val shoe: String,
    val styleId: String,
    val title: String,
    val year: Int,
    val size: Int
) : Serializable