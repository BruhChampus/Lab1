package com.example.myapplication.animals

class Dog(satiety: Int, var name: String) : Animal(satiety), Walkable {

    override val food: String
        get() = "м'ясо";

    override val animalType: String
        get() = "Собака";


    override fun walk() {
        println("$animalType пішла");
    }
    override fun voice() {
        println("$animalType $name гавкає");
    }

    override fun eat() {
        if(satiety < 10){
            println("$animalType $name  їсть $food");
            satiety++;}
        else{
            println("$animalType $name вже не хоче їсти");
        }
    }


}
