package com.example.myapplication.animals

class Cat(satiety: Int) : Animal(satiety), Walkable {

    override val food: String
        get() = "рибу";

    override val animalType: String
        get() = "Кішка"



    override fun walk() {
        println("$animalType пішла");
    }
    override fun voice() {
        println("$animalType мяукає");
    }

}