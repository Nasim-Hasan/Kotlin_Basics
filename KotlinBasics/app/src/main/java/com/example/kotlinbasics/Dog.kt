package com.example.kotlinbasics

//...Dog Class Holding the Default Value of a Property (age=2)...//
class Dog (val name:String, val breed:String, val age:Int=2) {
    //..Initializer...//
    init{
        bark(name);
    }

    fun bark(name:String){
        println("$name Says Woof Woof!!!");
    }
}