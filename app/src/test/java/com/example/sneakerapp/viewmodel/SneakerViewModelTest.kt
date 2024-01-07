package com.example.sneakerapp.viewmodel

import com.example.sneakerapp.Utils
import com.example.sneakerapp.model.Media
import com.example.sneakerapp.model.Sneaker
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SneakerViewModelTest {
    private var sneakersList = arrayListOf<Sneaker>()

    @Before
    fun beforeTest() {
        sneakersList = Utils.getSneakersData()
    }

    @Test
    fun getSneakersListTest() {
        Assert.assertTrue(sneakersList.isNotEmpty())
    }

    @Test
    fun getSneakersListSize() {
        val expectedSize = 48
        val actualSize = Utils.getSneakersData().size
        Assert.assertEquals(expectedSize, actualSize)
    }

    @Test()
    fun addToListTest() {
        val media = Media(1, 1, 1)
        val sneaker =
            Sneaker(
                "Adidas",
                "black",
                "female",
                "101",
                media,
                "Adidas",
                "28-01-2023",
                1000,
                "Adidas12",
                "Adidas",
                "Adidas",
                7,
                2023
            )


        val expectedSize = Utils.getSneakersData().size + 1
        sneakersList.add(sneaker)
        val actualSize = sneakersList.size
        Assert.assertEquals(expectedSize, actualSize)
    }

    @Test
    fun removeFromList() {
        val expectedSize = Utils.getSneakersData().size - 1;
        sneakersList.remove(sneakersList[0])
        val actualSize = sneakersList.size
        Assert.assertEquals(expectedSize, actualSize)
    }
}