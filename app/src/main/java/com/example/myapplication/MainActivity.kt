package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.animals.Bird
import com.example.myapplication.animals.Cat
import com.example.myapplication.animals.Dog
import com.example.myapplication.animals.Fish

class MainActivity fun main(){
    val dog1 = Dog(9, "John");
    val dog2 = Dog(5, "Von");

    val cat1 = Cat(6);

    val bird1 = Bird(2);

    val fish1 = Fish(3);

    dog2.voice();

    for(i in 1..3){
        dog1.eat();
    }

   println("\n");
    cat1.walk();
    fish1.swim();
    fish1.eat();
    bird1.fly();
    bird1.voice();
}
