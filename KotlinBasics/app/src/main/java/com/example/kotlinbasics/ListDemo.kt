package com.example.kotlinbasics

fun main(){
    val fruitsListI = listOf("Apple", "Banana", "Orange"); //..Immutable List: can't be changed/modified..//
    val fruitsListM = mutableListOf("Pineapple", "Grape", "Guava"); //..Mutable List: can be changed/modified..//

    println("Immutable Fruit List:$fruitsListI");
    println("Mutable Fruit List:$fruitsListM");

    fruitsListM.add("Mango");
    println("After Adding Mango, Mutable Fruit List:$fruitsListM");

    if(fruitsListM.contains("Mango")){
        println("Mango is in the List in the"+fruitsListM.indexOf("Mango")+" Position");
    } else{
        println("Mango is not in the List");
    }

    fruitsListM.remove("Guava");
    println("After Removing Guava, Mutable Fruit List:$fruitsListM");
}
