package com.example.kotlinbasics

fun main(){
    val numbers = listOf(1,2,3);
    val doubleNumbers = numbers.map { it*2 };
    println(doubleNumbers);
}