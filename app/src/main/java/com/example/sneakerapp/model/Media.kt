package com.example.sneakerapp.model

import java.io.Serializable

data class Media(
    val imageUrl: Int,
    val smallImageUrl: Int,
    val thumbUrl: Int
) : Serializable