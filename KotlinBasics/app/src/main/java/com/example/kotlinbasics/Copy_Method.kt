package com.example.kotlinbasics

fun main(){

    val blueVase = Vase(color="Blue", design="Rose");
    val redVase = blueVase.copy(color="Red");
    println(blueVase);
    println(redVase);
}

data class Vase (val color: String, val design:String);