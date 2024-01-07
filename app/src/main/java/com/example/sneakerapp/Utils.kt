package com.example.sneakerapp

import com.example.sneakerapp.model.Media
import com.example.sneakerapp.model.Sneaker

object Utils {


    const val SNEAKER = "sneaker"
    const val TAX = 300.0f

    val addList = arrayListOf<Sneaker>()

    fun getSneakersData(): ArrayList<Sneaker> {
        val sneakersList = arrayListOf<Sneaker>()
        val nikeAirJordan = Media(
            R.drawable.nike_air_jordan,
            R.drawable.nike_air_jordan,
            R.drawable.nike_air_jordan
        )
        val nike = Media(R.drawable.nike, R.drawable.nike, R.drawable.nike)
        val puma = Media(R.drawable.puma, R.drawable.puma, R.drawable.puma)
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )

        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )

        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )

        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )

        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )

        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )
        sneakersList.add(
            Sneaker(
                "Adidas",
                "blue",
                "female",
                "1",
                nikeAirJordan,
                "Adidas",
                "06/01/2024",
                1000,
                "Adidas",
                "Adidas1",
                "The adidas brand offers apparel and footwear for every sport",
                2024,
                7
            )
        )

        sneakersList.add(
            Sneaker(
                "Nike",
                "orange",
                "male",
                "2",
                nike,
                "Nike",
                "06/01/2024",
                999,
                "Nike",
                "Nike1",
                "Nike delivers innovative products, experiences and services.",
                2024,
                8
            )
        )

        sneakersList.add(
            Sneaker(
                "Puma",
                "black",
                "male",
                "3",
                puma,
                "Puma",
                "06/01/2024",
                2000,
                "Puma",
                "Puma1",
                "Designs and manufactures athletic and casual footwear, apparel, and accessories",
                2024,
                9
            )
        )



        return sneakersList
    }

    fun addToList(sneaker: Sneaker): ArrayList<Sneaker> {
        addList.add(sneaker)
        return addList;
    }


    fun removeFromList(sneaker: Sneaker): ArrayList<Sneaker> {
        addList.remove(sneaker)
        return addList
    }
}