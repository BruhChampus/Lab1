package com.example.myapplication.animals


class Fish(satiety: Int) : Animal(satiety) {

    override val food: String
        get() = "риб'ячий корм";

    override val animalType: String
        get() = "Риба";

    private var name:String = ""
      get() {
            return field;
        }
    set(name){
        field = name;
    }


    fun swim(){
        println("$animalType плаває");
    }
}