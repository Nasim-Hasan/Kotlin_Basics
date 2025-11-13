package com.example.kotlinbasics

fun main(){

    println("Enter your age:");
    var age = readln().toInt();

    if(age>=18 && age<40) {
        println("You can enter into the club");
    } else if(age>=40) {
        println("You can't enter into the club. Please, go home");
    } else{
        println("You are too young to enter into the club");
    }
}