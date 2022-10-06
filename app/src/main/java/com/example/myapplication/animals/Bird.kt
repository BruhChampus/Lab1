package com.example.myapplication.animals

class Bird(satiety: Int) : Animal(satiety), Walkable {

    override val food: String
        get() = "ягоди";

    override val animalType: String
        get() = "Птиця";

    override fun walk() {
        println("$animalType йде");
    }
    override fun voice() {
        println("$animalType чирікає");
    }

    fun fly(){
        println("$animalType літає");
    }
}