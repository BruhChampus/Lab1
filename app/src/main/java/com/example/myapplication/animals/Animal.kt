package com.example.myapplication.animals

open class Animal(var satiety:Int){

    open val food:String = "їжу";
    open val animalType:String = "Тварина";

    open fun voice(){
        println("Голос");

    }

    open fun eat(){
        if(satiety < 10){
            println("$animalType їсть $food");
            satiety++;}
        else{
            println("$animalType вже не хоче їсти");
        }
    }


}