package com.example.kotlinbasics

fun main(){
    println("Please Enter a Number:");
    try{
        val number = readln().toInt();
        println("You entered:$number");
    }catch(e:Exception){
        println("Error ${e.message}");
    }finally{
        println("This block will be executed regardless of error or not");
    }
}