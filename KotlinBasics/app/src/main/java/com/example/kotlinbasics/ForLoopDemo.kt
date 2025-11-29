package com.example.kotlinbasics

fun main(){
    val fruitsListI = listOf("Apple", "Banana", "Orange"); //..Immutable List: can't be changed/modified..//
    var tmpnum:Int =0;
    for(fruit in fruitsListI){
        println("$fruit is at index="+fruitsListI.indexOf(fruit));
    }
    val numbers = mutableListOf(1,2,3,4,5); //..Mutable List: can be changed/modified..//
    for(index in 0 until numbers.size){
        tmpnum = numbers[index];
        numbers[index] = tmpnum*tmpnum;
    }
    println("After squaring all the elements:"+numbers);
}